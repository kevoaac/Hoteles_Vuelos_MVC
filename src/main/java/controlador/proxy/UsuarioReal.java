/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.proxy;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import conexion.Conexion;
import java.util.Random;
import modelo.Crud;
import modelo.DAO.implementacion.UsuarioDAOImp;
import modelo.DAO.interfaces.UsuarioDAO;

public class UsuarioReal implements IUsuario {
	private Connection connection;
        private String captchaValue;
        private int suma = 0;

    public UsuarioReal(Connection connection) {
        this.connection = connection;
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
        Crud crud = new Crud();
        UsuarioDAO usuarioDAO = new UsuarioDAOImp(crud);
        //---------------------------------------
        String nombreR = nombre;
        String apellidoR = apellido;
        String correoR = correo;
        String contraseniaR = contrasenia;
        if (contraseniaR.length() <= 15 && contraseniaR.length() >= 4) {
            if (contraseniaR.matches("^(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,15}$")) {
                //Asi funciona el DAO al ingresar los datos:
                usuarioDAO.crearUsuario(new modelo.Usuario(0, nombreR, apellidoR, correoR, contraseniaR));
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
