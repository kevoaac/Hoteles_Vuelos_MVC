
package modelo;
public class Usuario {
//Atributos de usuario:
	private int idUsuario;
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String contrasenia;
//Constructor:
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(int idUsuario, String nombre, String apellido, String correoElectronico, String contrasenia) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.contrasenia = contrasenia;
	}
//Getters y Setters:
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
//Imprimir informacion en formato:
	@Override
	public String toString() {
		return "Usuario: [ ID:" + idUsuario + ", Nombre:" + nombre + ", Apellido:" + apellido + ", Correo Electronico:"
				+ correoElectronico + ", ContraseÃ±a:" + contrasenia + " ]";
	}

}

