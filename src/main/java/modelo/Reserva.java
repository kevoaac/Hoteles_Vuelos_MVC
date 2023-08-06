
package modelo;


import java.time.LocalDate;

public class Reserva {
//Atriburos de reserva:
	private int idReserva;
	private int idUsuario;
	private int idVuelo;
	private int idHabitacion;
	private LocalDate fechaReserva;

//Constructor:
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	public Reserva(int idReserva, int idUsuario, int idVuelo, int idHabitacion, LocalDate fechaReserva) {
		super();
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.idVuelo = idVuelo;
		this.idHabitacion = idHabitacion;
		this.fechaReserva = fechaReserva;
	}

//Getters y Setters:
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
// Imprimir informacion en formato:

	@Override
	public String toString() {
		return "Reserva [ ID Reserva:" + idReserva + 
				", ID Usuario:" + idUsuario + 
				", ID Vuelo:" + idVuelo
				+ ", ID Habitacion:" + idHabitacion 
				+ ", Fecha Reserva:" + fechaReserva + " ]";
	}
	
}

