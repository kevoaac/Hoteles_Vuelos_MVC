
package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Reserva;

public interface ReservaDAO {

    boolean crear(Reserva reserva) throws SQLException;

    Reserva leer(int id) throws SQLException;

    boolean actualizar(int id, Reserva reserva) throws SQLException;

    boolean eliminar(int id) throws SQLException;

    List<Reserva> listar() throws SQLException;
}
