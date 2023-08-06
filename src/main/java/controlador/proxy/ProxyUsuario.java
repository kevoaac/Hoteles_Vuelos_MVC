package controlador.proxy;

public class ProxyUsuario implements IUsuario {

    private UsuarioReal usuarioReal;

    public ProxyUsuario() {
        this.usuarioReal = new UsuarioReal();
    }

    @Override
    public void registrarse(String nombre, String apellido, String correo, String contrasenia) {
        usuarioReal.registrarse(nombre, apellido, correo, contrasenia);
    }

    @Override
    public boolean iniciarSesion(String correo, String contrasenia) {
        return usuarioReal.iniciarSesion(correo, contrasenia);
    }

    @Override
    public void cerrarSesion() {
        usuarioReal.cerrarSesion();
    }

}
