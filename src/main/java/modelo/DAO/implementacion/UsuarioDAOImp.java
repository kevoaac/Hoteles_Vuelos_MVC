package modelo.DAO.implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.DAO.interfaces.UsuarioDAO;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public class UsuarioDAOImp extends Conexion implements UsuarioDAO {

    private PreparedStatement sentencia;
    boolean estadoOP;

    @Override
    public boolean crear(Usuario usuario) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "INSERT INTO usuarios(nombre, apellido, correo_electronico, contraseña)"
                    + "VALUES(?,?,?,?)";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, usuario.getNombre());
            sentencia.setString(2, usuario.getApellido());
            sentencia.setString(3, usuario.getCorreoElectronico());
            sentencia.setString(4, usuario.getContrasenia());

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
    public Usuario leer(int id) throws SQLException {

        ResultSet resultados = null;
        Usuario user = new Usuario();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            sql = "SELECT * FROM usuarios WHERE id_usuario = ?";
            sentencia = connection.prepareStatement(sql);
            sentencia.setInt(1, id);

            resultados = sentencia.executeQuery();

            if (resultados.next()) {
                connection.setAutoCommit(false);

                user.setIdUsuario(resultados.getInt(1));
                user.setNombre(resultados.getString(2));
                user.setApellido(resultados.getString(3));
                user.setCorreoElectronico(resultados.getString(4));
                user.setContrasenia(resultados.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Usuario leer(String correo) throws SQLException {
        ResultSet resultados = null;
        Usuario user = new Usuario();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            sql = "SELECT * FROM usuarios WHERE correo_electronico = ?";
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, correo);

            resultados = sentencia.executeQuery();

            if (resultados.next()) {
                connection.setAutoCommit(false);

                user.setIdUsuario(resultados.getInt(1));
                user.setNombre(resultados.getString(2));
                user.setApellido(resultados.getString(3));
                user.setCorreoElectronico(resultados.getString(4));
                user.setContrasenia(resultados.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    @Override
    public boolean actualizar(int id, Usuario usuario) throws SQLException {
        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "UPDATE usuarios SET nombre=?, apellido=?, correo_electronico=?, contraseÃ±a=? WHERE  =?";
            sentencia = connection.prepareStatement(sql);

            sentencia.setString(1, usuario.getNombre());
            sentencia.setString(2, usuario.getApellido());
            sentencia.setString(3, usuario.getCorreoElectronico());
            sentencia.setString(4, usuario.getContrasenia());
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
    public List<Usuario> listar() throws SQLException {//obtenerUsuarios
        ResultSet resultado = null;
        List<Usuario> listaUsuarios = new ArrayList<>();

        String sql = null;
        estadoOP = false;
        connection = getConnection();

        try {
            connection.setAutoCommit(false);
            sql = "SELECT * FROM usuarios";
            sentencia = connection.prepareStatement(sql);
            resultado = sentencia.executeQuery();

            while (resultado.next()) {
                Usuario user = new Usuario();

                user.setIdUsuario(resultado.getInt(1));
                user.setNombre(resultado.getString(2));
                user.setApellido(resultado.getString(3));
                user.setCorreoElectronico(resultado.getString(4));
                user.setContrasenia(resultado.getString(5));

                listaUsuarios.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaUsuarios;
    }

}
