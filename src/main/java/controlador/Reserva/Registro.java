package controlador.Reserva;

import java.time.LocalDate;
import controlador.Reserva.RegistroBuilder;

/**
 *
 * @author kevin
 */
public class Registro {

    private int idReserva;
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;

    private int idVuelo;
    private int idHabitacion;
    private LocalDate fechaReserva;
    private double precioVuelo;
    private double precioHabitacion;
    
    //Singleton---------------------------------------------------------------------
    private static Registro instancia = new Registro();

    private Registro() {
    }
    
    public static Registro obtenerInstancia() {

        if (instancia == null) {
            instancia = new Registro();
        }
        return instancia;
    }
    //---------------------------------------------------------------------------------

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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
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

    public double getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(double precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Registro{" + "idReserva=" + idReserva + ", idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", idVuelo=" + idVuelo + ", idHabitacion=" + idHabitacion + ", fechaReserva=" + fechaReserva + ", precioVuelo=" + precioVuelo + ", precioHabitacion=" + precioHabitacion + '}';
    }

    
    
    



}
