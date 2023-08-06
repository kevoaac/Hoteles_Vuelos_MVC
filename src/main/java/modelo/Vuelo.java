
package modelo;

import java.time.LocalDate;

public class Vuelo {
//Atributos de vuelo:
	private int idVuelo;
	private String origen;
	private String destino;
	private LocalDate fechaSalida;
	private LocalDate fechaLlegada;
	private int capacidad;
        private double precio;

//Constructor:
	public Vuelo() {
		// TODO Auto-generated constructor stub
	}
	public Vuelo(int idVuelo, String origen, String destino, LocalDate fechaSalida, LocalDate fechaLlegada,
			int capacidad, double precio) {
		super();
		this.idVuelo = idVuelo;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.capacidad = capacidad;
                this.precio = precio;
	}

//Getters y Setters:
	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDate fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
        
	// Imprimir informacion en formato:

	@Override
	public String toString() {
		return "Vuelo [ ID:" + idVuelo + 
				", Origen:" + origen + 
				", Destino:" + destino + 
				", Fecha Salida."+ fechaSalida + 
				", Fecha Llegada:" + fechaLlegada + 
				", Capacidad:" + capacidad +", Precio:" +precio+" ]";
	}

}



