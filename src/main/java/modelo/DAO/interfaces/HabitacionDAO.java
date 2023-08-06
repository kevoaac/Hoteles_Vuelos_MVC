package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Habitacion;

/**
 *
 * @author LENOVO
 */
public interface HabitacionDAO {

    boolean crear(Habitacion habitacion) throws SQLException;

    Habitacion leer(String pais) throws SQLException;

    boolean actualizar(int id, Habitacion habitacion) throws SQLException;

    boolean eliminar(int id) throws SQLException;

    List<Habitacion> listar(String pais) throws SQLException;
}
