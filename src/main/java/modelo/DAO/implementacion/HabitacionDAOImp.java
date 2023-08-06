package modelo.DAO.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.DAO.interfaces.HabitacionDAO;
import modelo.Habitacion;

/**
 *
 * @author LENOVO
 */
public class HabitacionDAOImp extends Conexion implements HabitacionDAO {

    private PreparedStatement sentencia;
    boolean estadoOP;

    @Override
    public boolean crear(Habitacion habitacion) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "INSERT INTO habitaciones(nombre_hotel, tipo_habitacion, precio_noche, disponibilidad, pais)"
                    + "VALUES(?,?,?,?,?)";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, habitacion.getNombreHotel());
            sentencia.setString(2, habitacion.getTipoHabitacion());
            sentencia.setDouble(3, habitacion.getPrecioNoche());
            sentencia.setBoolean(4, habitacion.isDisponibilidad());
            sentencia.setString(5, habitacion.getPais());

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
    public Habitacion leer(String pais) throws SQLException {
        ResultSet resultados = null;
        Habitacion habitacion = new Habitacion();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            sql = "SELECT * FROM habitaciones WHERE pais = ?";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(6, pais);

            resultados = sentencia.executeQuery();

            if (resultados.next()) {
                connection.setAutoCommit(false);

                habitacion.setIdHabitacion(resultados.getInt(1));
                habitacion.setNombreHotel(resultados.getString(2));
                habitacion.setTipoHabitacion(resultados.getString(3));
                habitacion.setPrecioNoche(resultados.getDouble(4));
                habitacion.setDisponibilidad(resultados.getBoolean(5));
                habitacion.setPais(resultados.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return habitacion;
    }

    @Override
    public boolean actualizar(int id, Habitacion habitacion) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "UPDATE habitaciones SET nombre_hotel=?, tipo_habitacion=?, precio_noche=?, disponibilidad=?, pais = ? WHERE id_habitacion =?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setString(1, habitacion.getNombreHotel());
            sentencia.setString(2, habitacion.getTipoHabitacion());
            sentencia.setDouble(3, habitacion.getPrecioNoche());
            sentencia.setBoolean(4, habitacion.isDisponibilidad());
            sentencia.setString(5, habitacion.getPais());
            sentencia.setInt(6, id);

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
            sql = "DELETE FROM habitaciones WHERE id_habitacion =?";
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
    public List<Habitacion> listar(String pais) throws SQLException {
        ResultSet resultado = null;
        List<Habitacion> listaHabitaciones = new ArrayList<>();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "SELECT * FROM habitaciones WHERE pais = ?";

            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, pais);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Habitacion habitacion = new Habitacion();

                habitacion.setIdHabitacion(resultado.getInt(1));
                habitacion.setNombreHotel(resultado.getString(2));
                habitacion.setTipoHabitacion(resultado.getString(3));
                habitacion.setPrecioNoche(resultado.getDouble(4));
                habitacion.setDisponibilidad(resultado.getBoolean(5));
                habitacion.setPais(resultado.getString(6));
                listaHabitaciones.add(habitacion);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaHabitaciones;
    }

}
