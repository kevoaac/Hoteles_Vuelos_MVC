package modelo.DAO.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.DAO.interfaces.VueloDAO;
import modelo.Vuelo;

/**
 *
 * @author LENOVO
 */
public class VueloDAOImp extends Conexion implements VueloDAO {

    private PreparedStatement sentencia;
    boolean estadoOP;

    @Override
    public boolean crear(Vuelo vuelo) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "INSERT INTO vuelos(origen, destino, fecha_salida, fecha_llegada, capacidad, precio)"
                    + "VALUES(?,?,?,?,?,?)";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, vuelo.getOrigen());
            sentencia.setString(2, vuelo.getDestino());
            sentencia.setDate(3, java.sql.Date.valueOf(vuelo.getFechaSalida()));
            sentencia.setDate(4, java.sql.Date.valueOf(vuelo.getFechaLlegada()));
            sentencia.setInt(5, vuelo.getCapacidad());
            sentencia.setDouble(6, vuelo.getPrecio());
            estadoOP = sentencia.executeUpdate() > 0;
            connection.commit();
            sentencia.close();
            connection.close();

        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }
        return estadoOP;
    }

    @Override
    public Vuelo leer(String origen, String destino) throws SQLException {
        ResultSet resultados = null;
        Vuelo vuelo = new Vuelo();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            sql = "SELECT * FROM vuelos WHERE origen = ? AND destino = ?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setString(2, origen);
            sentencia.setString(3, destino);

            resultados = sentencia.executeQuery();

            if (resultados.next()) {
                connection.setAutoCommit(false);

                vuelo.setIdVuelo(resultados.getInt(1));
                vuelo.setOrigen(resultados.getString(2));
                vuelo.setDestino(resultados.getString(3));
                vuelo.setFechaSalida(resultados.getObject(4, LocalDate.class));
                vuelo.setFechaLlegada(resultados.getObject(5, LocalDate.class));
                vuelo.setCapacidad(resultados.getInt(6));
                vuelo.setPrecio(resultados.getDouble(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vuelo;
    }

    @Override
    public boolean actualizar(int id, Vuelo vuelo) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "UPDATE vuelos SET origen=?, destino=?, fecha_salida=?, fecha_llegada=?, capacidad=?, precio = ? WHERE id_vuelo =?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setString(1, vuelo.getOrigen());
            sentencia.setString(2, vuelo.getDestino());
            sentencia.setDate(3, java.sql.Date.valueOf(vuelo.getFechaSalida()));
            sentencia.setDate(4, java.sql.Date.valueOf(vuelo.getFechaLlegada()));
            sentencia.setInt(5, vuelo.getCapacidad());
            sentencia.setDouble(6, vuelo.getPrecio());
            sentencia.setInt(7, id);

        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }

        estadoOP = sentencia.executeUpdate() > 0;
        connection.commit();
        sentencia.close();
        connection.close();

        return true;
    }

    @Override
    public boolean eliminar(int id) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "DELETE FROM usuarios WHERE id_usuario =?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setInt(1, id);
        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }

        estadoOP = sentencia.executeUpdate() > 0;
        connection.commit();
        sentencia.close();
        connection.close();

        return estadoOP;
    }

    @Override
    public List<Vuelo> listar(String origen, String destino) throws SQLException {
        ResultSet resultado = null;
        List<Vuelo> listaVuelos = new ArrayList<>();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "SELECT * FROM vuelos WHERE origen = ? AND destino = ?";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, origen);
            sentencia.setString(2, destino);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Vuelo vuelo = new Vuelo();

                vuelo.setIdVuelo(resultado.getInt(1));
                vuelo.setOrigen(resultado.getString(2));
                vuelo.setDestino(resultado.getString(3));
                vuelo.setFechaSalida(resultado.getObject(4, LocalDate.class));
                vuelo.setFechaLlegada(resultado.getObject(5, LocalDate.class));
                vuelo.setCapacidad(resultado.getInt(6));
                vuelo.setPrecio(resultado.getDouble(7));
                listaVuelos.add(vuelo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaVuelos;
    }

}
