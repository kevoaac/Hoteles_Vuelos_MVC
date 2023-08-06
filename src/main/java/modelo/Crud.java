package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;

//Operaciones: Create Read Update Delete
public class Crud {

	private Connection connection;
	private PreparedStatement sentencia;
	boolean estadoOP;

	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	} 
	//CREAR:
	//-----------------USUARIOS------------------------
	public boolean crearUsuario(Usuario user) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO usuarios(nombre, apellido, correo_electronico, contraseña)"
					+ "VALUES(?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1, user.getNombre());
			sentencia.setString(2, user.getApellido());
			sentencia.setString(3, user.getCorreoElectronico());
			sentencia.setString(4, user.getContrasenia());

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
	//-------------------------------------------------
	//-----------------HABITACIONES-------------------
	public boolean crearHabitacion(Habitacion habitacion) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO habitaciones(nombre_hotel, tipo_habitacion, precio_noche, disponibilidad, pais)"
					+ "VALUES(?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1, habitacion.getNombreHotel());
			sentencia.setString(2, habitacion.getTipoHabitacion());
			sentencia.setDouble(3, habitacion.getPrecioNoche());
			sentencia.setBoolean(4, habitacion.isDisponibilidad());
                        sentencia.setString(5,habitacion.getPais());
                                
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
	//-----------------------------------------------
	//-----------------VUELOS------------------------
	public boolean crearVuelo(Vuelo vuelo) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO vuelos(origen, destino, fecha_salida, fecha_llegada, capacidad, precio)"
					+ "VALUES(?,?,?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
			 sentencia.setString(1, vuelo.getOrigen());
		        sentencia.setString(2, vuelo.getDestino());
		        sentencia.setDate(3, java.sql.Date.valueOf(vuelo.getFechaSalida()));
		        sentencia.setDate(4, java.sql.Date.valueOf(vuelo.getFechaLlegada()));
		        sentencia.setInt(5, vuelo.getCapacidad());
                        sentencia.setDouble(6, vuelo.getPrecio());
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
	//------------------------------------------------
	//----------------RESERVAS------------------------
	public boolean crearReserva(Reserva reserva) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO reservas(id_usuario, id_vuelo, id_habitacion, fecha_reserva)"
					+ "VALUES(?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
			 sentencia.setInt(1, reserva.getIdUsuario());
		        sentencia.setInt(2, reserva.getIdVuelo());
		        sentencia.setInt(3, reserva.getIdHabitacion());
		        sentencia.setDate(4, java.sql.Date.valueOf(reserva.getFechaReserva()));

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
	//------------------------------------------------
	
	//READ:
	//----------------USUARIO------------------------
	public Usuario leerUsuario(int id) throws SQLException {
		ResultSet resultados = null;
		Usuario user = new Usuario();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

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
	//-----------------------------------------------------
	//---------------HABITACION----------------------
	public Habitacion leerHabitacion(String pais) throws SQLException {
		ResultSet resultados = null;
		Habitacion habitacion = new Habitacion();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM habitaciones WHERE pais = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(6, pais);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);

				habitacion.setIdHabitacion(resultados.getInt(1));
				habitacion.setNombreHotel(resultados.getString(2));
				habitacion.setTipoHabitacion(resultados.getString(3));
				habitacion.setPrecioNoche(resultados.getDouble(4));
				habitacion.setDisponibilidad(resultados.getBoolean(5));
                                habitacion.setPais(resultados.getString(6));
                        }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return habitacion;
	}
	//-----------------------------------------------
	//---------------VUELO---------------------------
	public Vuelo leerVuelo(String origen, String destino) throws SQLException {
		ResultSet resultados = null;
		Vuelo vuelo = new Vuelo();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM vuelos WHERE origen = ? AND destino = ?";
			sentencia = connection.prepareStatement(sql);
                        
			sentencia.setString(2, origen);
                        sentencia.setString(3, destino);
                        
			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);

				vuelo.setIdVuelo(resultados.getInt(1));
				vuelo.setOrigen(resultados.getString(2));
				vuelo.setDestino(resultados.getString(3));
				vuelo.setFechaSalida(resultados.getObject(4,LocalDate.class));
				vuelo.setFechaLlegada(resultados.getObject(5,LocalDate.class));
				vuelo.setCapacidad(resultados.getInt(6));
                                vuelo.setPrecio(resultados.getDouble(7));
                        }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vuelo;
	}
	//-----------------------------------------------
	//--------------RESERVA--------------------------
	public Reserva leerReserva(int id) throws SQLException {
		ResultSet resultados = null;
		Reserva reserva = new Reserva();

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM reservas WHERE id_reserva = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, id);

			resultados = sentencia.executeQuery();

			if (resultados.next()) {
				connection.setAutoCommit(false);

				reserva.setIdReserva(resultados.getInt(1));
				reserva.setIdUsuario(resultados.getInt(2));
				reserva.setIdVuelo(resultados.getInt(3));
				reserva.setIdHabitacion(resultados.getInt(4));
				reserva.setFechaReserva(resultados.getObject(5,LocalDate.class));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reserva;
	}
	//-----------------------------------------------
	//Obtener Datos:
	//-----------------------USUARIOS-----------------
	public List<Usuario> obtenerUsuarios()throws SQLException{
		ResultSet resultado = null;
		List<Usuario> listaUsuarios = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM usuarios";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
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
	//------------------------------------------------
	//-----------------------HABITACIONES-------------
	public List<Habitacion> obtenerHabitaciones(String pais)throws SQLException{
		ResultSet resultado = null;
		List<Habitacion> listaHabitaciones = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM habitaciones WHERE pais = ?";
                        
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, pais);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Habitacion habitacion = new Habitacion();

				habitacion.setIdHabitacion(resultado.getInt(1));
				habitacion.setNombreHotel(resultado.getString(2));
				habitacion.setTipoHabitacion(resultado.getString(3));
				habitacion.setPrecioNoche(resultado.getDouble(4));
				habitacion.setDisponibilidad(resultado.getBoolean(5));
                                habitacion.setPais(resultado.getString(6));
				listaHabitaciones.add(habitacion);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaHabitaciones;
	}
	//------------------------------------------------
	//-----------------------RESERVA------------------
	public List<Reserva> obtenerReservas()throws SQLException{
		ResultSet resultado = null;
		List<Reserva> listaReservas = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM reservas";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Reserva reserva = new Reserva();

				reserva.setIdReserva(resultado.getInt(1));
				reserva.setIdUsuario(resultado.getInt(2));
				reserva.setIdVuelo(resultado.getInt(3));
				reserva.setIdHabitacion(resultado.getInt(4));
				reserva.setFechaReserva(resultado.getObject(5,LocalDate.class));

				listaReservas.add(reserva);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaReservas;
	}
	//------------------------------------------------
	//-----------------------VUELO--------------------
	public List<Vuelo> obtenerVuelos(String origen, String destino)throws SQLException{
		ResultSet resultado = null;
		List<Vuelo> listaVuelos = new ArrayList<>(); 

		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);
			sql = "SELECT * FROM vuelos WHERE origen = ? AND destino = ?";
			sentencia = connection.prepareStatement(sql);
                        sentencia.setString(1, origen);
                        sentencia.setString(2, destino);
			resultado = sentencia.executeQuery();

			while(resultado.next()){
				Vuelo vuelo = new Vuelo();

				vuelo.setIdVuelo(resultado.getInt(1));
				vuelo.setOrigen(resultado.getString(2));
				vuelo.setDestino(resultado.getString(3));
				vuelo.setFechaSalida(resultado.getObject(4,LocalDate.class));
				vuelo.setFechaLlegada(resultado.getObject(5,LocalDate.class));
				vuelo.setCapacidad(resultado.getInt(6));
                                vuelo.setPrecio(resultado.getDouble(7));
				listaVuelos.add(vuelo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaVuelos;
	}
	//------------------------------------------------
	//UPDATE:
	//-------------------USUARIO-----------------------
	public boolean actualizarUsuario(int id, Usuario user) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE usuarios SET nombre=?, apellido=?, correo_electronico=?, contraseÃ±a=? WHERE  =?";
			sentencia = connection.prepareStatement(sql);
			
			sentencia.setString(1, user.getNombre());
			sentencia.setString(2, user.getApellido());
			sentencia.setString(3, user.getCorreoElectronico());
			sentencia.setString(4, user.getContrasenia());
			sentencia.setInt(5, id);

			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------HABITACION--------------------
	public boolean actualizarHabitacion(int id, Habitacion habitacion) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE habitaciones SET nombre_hotel=?, tipo_habitacion=?, precio_noche=?, disponibilidad=?, pais = ? WHERE id_habitacion =?";
			sentencia = connection.prepareStatement(sql);
			
			sentencia.setString(1, habitacion.getNombreHotel());
			sentencia.setString(2, habitacion.getTipoHabitacion());
			sentencia.setDouble(3, habitacion.getPrecioNoche());
			sentencia.setBoolean(4, habitacion.isDisponibilidad());
                        sentencia.setString(5, habitacion.getPais());
			sentencia.setInt(6, id);
                        

			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------VUELO-------------------------
	public boolean actualizarVuelo(int id, Vuelo vuelo) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE vuelos SET origen=?, destino=?, fecha_salida=?, fecha_llegada=?, capacidad=?, precio = ? WHERE id_vuelo =?";
			sentencia = connection.prepareStatement(sql);
			
			sentencia.setString(1, vuelo.getOrigen());
			sentencia.setString(2, vuelo.getDestino());
			sentencia.setDate(3, java.sql.Date.valueOf(vuelo.getFechaSalida()));
	        sentencia.setDate(4, java.sql.Date.valueOf(vuelo.getFechaLlegada()));
			sentencia.setInt(5, vuelo.getCapacidad());
                        sentencia.setDouble(6, vuelo.getPrecio());
			sentencia.setInt(7, id);

			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//-------------------RESERVA-----------------------
	public boolean actualizarReserva(int id, Reserva reserva) throws SQLException {
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();
		
		
		try {
			connection.setAutoCommit(false);
			sql = "UPDATE reservas SET id_usuario=?, id_vuelo=?, id_habitacion=?, fecha_reserva=? WHERE id_reserva =?";
			sentencia = connection.prepareStatement(sql);
			
			sentencia.setInt(1, reserva.getIdUsuario());
			sentencia.setInt(2, reserva.getIdVuelo());
			sentencia.setInt(3, reserva.getIdHabitacion());
	        sentencia.setDate(4, java.sql.Date.valueOf(reserva.getFechaReserva()));
			sentencia.setInt(5, id);

			
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return true;
	}
	//-------------------------------------------------
	//DELETE:
	//-------------USUARIO----------------------------
public boolean eliminarUsuario(int id) throws SQLException {
		
		String sql = null;
		estadoOP = false;
		connection = obtenerConexion();

		
		try {
			connection.setAutoCommit(false);
			sql = "DELETE FROM usuarios WHERE id_usuario =?";
			sentencia = connection.prepareStatement(sql) ;

			sentencia.setInt(1, id);
		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

		estadoOP = sentencia.executeUpdate()>0;
		connection.commit();
		sentencia.close();
		connection.close();

		return estadoOP;
	}
	//------------------------------------------------
	//-------------HABITACION-------------------------
public boolean eliminarHabitacion(int id) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM habitaciones WHERE id_habitacion =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setInt(1, id);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
	//-------------VUELO------------------------------
public boolean eliminarVuelo(int id) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM vuelos WHERE id_vuelo =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setInt(1, id);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------
	//-------------RESERVA----------------------------
public boolean eliminarReserva(int id) throws SQLException {
	
	String sql = null;
	estadoOP = false;
	connection = obtenerConexion();

	
	try {
		connection.setAutoCommit(false);
		sql = "DELETE FROM reservas WHERE id_reserva =?";
		sentencia = connection.prepareStatement(sql) ;

		sentencia.setInt(1, id);
	} catch (SQLException e) {
		connection.rollback();
		e.printStackTrace();
	}

	estadoOP = sentencia.executeUpdate()>0;
	connection.commit();
	sentencia.close();
	connection.close();

	return estadoOP;
}
	//------------------------------------------------

	

}