package modelo;

public class Habitacion {
//Atributos de Habitacion:

    private int idHabitacion;
    private String nombreHotel;
    private String tipoHabitacion;
    private double precioNoche;
    private boolean disponibilidad;
    private String pais;
//Constructor:

    public Habitacion() {
        // TODO Auto-generated constructor stub
    }

    public Habitacion(int idHabitacion, String nombreHotel, String tipoHabitacion, double precioNoche,
            boolean disponibilidad, String pais) {
        super();
        this.idHabitacion = idHabitacion;
        this.nombreHotel = nombreHotel;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.disponibilidad = disponibilidad;
        this.pais = pais;
    }
//Getters y Setters:

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Habitacion [ ID Habitacion:" + idHabitacion
                + ", Nombre Hotel:" + nombreHotel
                + ", Tipo Habitacion:"
                + tipoHabitacion
                + ", Precio Noche:" + precioNoche
                + ", Disponibilidad:" + disponibilidad + ", Pais:" + pais + " ]";
    }

}
