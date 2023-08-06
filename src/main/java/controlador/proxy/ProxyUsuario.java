/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.proxy;

/**
 *
 * @author LENOVO
 */

import conexion.Conexion;

public class ProxyUsuario implements IUsuario{
private UsuarioReal usuarioReal;

public ProxyUsuario() {
    this.usuarioReal = new UsuarioReal(
    		Conexion.getConnection());
}
	@Override
	public void registrarse(String nombre, String apellido, String correo, String contrasenia) {
		usuarioReal.registrarse(nombre,apellido,correo,contrasenia);
	}

	@Override
	public void iniciarSesion(String correo, String contrasenia) {
		usuarioReal.iniciarSesion(correo, contrasenia);		
	}

	@Override
	public void cerrarSesion() {
		usuarioReal.cerrarSesion();		
	}

}

