package controlador.proxy;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion;
import modelo.DAO.implementacion.UsuarioDAOImp;
import modelo.DAO.interfaces.UsuarioDAO;

public class UsuarioReal extends Conexion implements IUsuario {

    private Connection connection;
    private String captchaValue;
    private int suma = 0;

    public UsuarioReal() {
        this.connection = getConnection();
        captchaValue = generarCaptcha();
    }

    private String generarCaptcha() {
        int numero1 = (int) (Math.random() * 10) + 1;
        int numero2 = (int) (Math.random() * 10) + 1;
        suma = numero1 + numero2;
        return "¿Cuánto es " + numero1 + " + " + numero2 + "?";
    }

    @Override
    public void registrarse(String nombre, String apellido, String correo, String contrasenia) {
        //Asi funciona un DAO con el CRUD:
        UsuarioDAO usuarioDAO = new UsuarioDAOImp();
        //---------------------------------------
        String nombreR = nombre;
        String apellidoR = apellido;
        String correoR = correo;
        String contraseniaR = contrasenia;
        if (contraseniaR.length() <= 15 && contraseniaR.length() >= 4) {
            if (contraseniaR.matches("^(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,15}$")) {
                try {
                    //Asi funciona el DAO al ingresar los datos:
                    usuarioDAO.crear(new modelo.Usuario(0, nombreR, apellidoR, correoR, contraseniaR));
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioReal.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "¡Registro exitoso!");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos una letra mayúscula, un carácter especial y sin espacios");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 4 y 15 caracteres");
        }
    }

    @Override
    public boolean iniciarSesion(String correo, String contrasenia) {
        String correoI = correo;
        String contraseniaR = contrasenia;
        String sql = "SELECT * FROM usuarios WHERE correo_electronico = ?";
        PreparedStatement sentencia = null;
        try {
            sentencia = connection.prepareStatement(sql);
            sentencia.setString(1, correoI);
            ResultSet resultados = sentencia.executeQuery();
            if (resultados.next()) {
                String contraseniaBD = resultados.getString("contraseña");
                if (contraseniaR.equals(contraseniaBD)) {
                    String captchaValue = generarCaptcha();
                    String captchaInput = JOptionPane.showInputDialog(null, captchaValue);

                    try {
                        int respuestaUsuario = Integer.parseInt(captchaInput);
                        int resultadoCaptcha = suma;
                        if (respuestaUsuario == resultadoCaptcha) {
                            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
                            // CONECTAMOS CON LA INTERFAZ:

                            return true;

                        } else {
                            JOptionPane.showMessageDialog(null, "CAPTCHA incorrecto. Por favor, inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para el CAPTCHA.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Por favor, inténtelo nuevamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Su cuenta no está registrada. Por favor, regístrese primero.");
            }

            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (sentencia != null) {
                try {
                    sentencia.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public void cerrarSesion() {
        JOptionPane.showMessageDialog(null, "Ha cerrado sesión correctamente. ¡Hasta pronto!");
    }

}
