package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public interface UsuarioDAO {

    boolean crear(Usuario usuario) throws SQLException;

    Usuario leer(int id) throws SQLException;

    boolean actualizar(int id, Usuario usuario) throws SQLException;

    boolean eliminar(int id) throws SQLException;

    List<Usuario> listar() throws SQLException;

}
