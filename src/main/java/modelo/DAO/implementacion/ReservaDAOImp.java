package modelo.DAO.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.DAO.interfaces.ReservaDAO;
import modelo.Reserva;

/**
 *
 * @author LENOVO
 */
public class ReservaDAOImp extends Conexion implements ReservaDAO {

    private PreparedStatement sentencia;
    boolean estadoOP;

    @Override
    public boolean crear(Reserva reserva) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "INSERT INTO reservas(id_usuario, id_vuelo, id_habitacion, fecha_reserva)"
                    + "VALUES(?,?,?,?)";
            sentencia = connection.prepareStatement(sql);
            sentencia.setInt(1, reserva.getIdUsuario());
            sentencia.setInt(2, reserva.getIdVuelo());
            sentencia.setInt(3, reserva.getIdHabitacion());
            sentencia.setDate(4, java.sql.Date.valueOf(reserva.getFechaReserva()));

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
    public Reserva leer(int id) throws SQLException {
        ResultSet resultados = null;
        Reserva reserva = new Reserva();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            sql = "SELECT * FROM reservas WHERE id_reserva = ?";
            sentencia = connection.prepareStatement(sql);
            sentencia.setInt(1, id);

            resultados = sentencia.executeQuery();

            if (resultados.next()) {
                connection.setAutoCommit(false);

                reserva.setIdReserva(resultados.getInt(1));
                reserva.setIdUsuario(resultados.getInt(2));
                reserva.setIdVuelo(resultados.getInt(3));
                reserva.setIdHabitacion(resultados.getInt(4));
                reserva.setFechaReserva(resultados.getObject(5, LocalDate.class));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public boolean actualizar(int id, Reserva reserva) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "UPDATE reservas SET id_usuario=?, id_vuelo=?, id_habitacion=?, fecha_reserva=? WHERE id_reserva =?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setInt(1, reserva.getIdUsuario());
            sentencia.setInt(2, reserva.getIdVuelo());
            sentencia.setInt(3, reserva.getIdHabitacion());
            sentencia.setDate(4, java.sql.Date.valueOf(reserva.getFechaReserva()));
            sentencia.setInt(5, id);

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
            sql = "DELETE FROM reservas WHERE id_reserva =?";
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
    public List<Reserva> listar() throws SQLException {
        ResultSet resultado = null;
        List<Reserva> listaReservas = new ArrayList<>();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "SELECT * FROM reservas";
            sentencia = connection.prepareStatement(sql);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Reserva reserva = new Reserva();

                reserva.setIdReserva(resultado.getInt(1));
                reserva.setIdUsuario(resultado.getInt(2));
                reserva.setIdVuelo(resultado.getInt(3));
                reserva.setIdHabitacion(resultado.getInt(4));
                reserva.setFechaReserva(resultado.getObject(5, LocalDate.class));

                listaReservas.add(reserva);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaReservas;
    }

}
