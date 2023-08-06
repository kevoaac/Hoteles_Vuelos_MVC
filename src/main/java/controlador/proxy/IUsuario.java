package controlador.proxy;

/**
 *
 * @author LENOVO
 */
public interface IUsuario {

    void registrarse(String nombre, String apellido, String correo, String contrasenia);

    boolean iniciarSesion(String correo, String contrasenia);

    void cerrarSesion();
}
