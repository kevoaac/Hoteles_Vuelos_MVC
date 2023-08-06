/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
