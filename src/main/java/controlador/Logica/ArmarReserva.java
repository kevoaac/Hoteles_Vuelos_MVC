package controlador.Logica;

import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class ArmarReserva {

    private int idReserva;
    private int idUsuario;
    private int idVuelo;
    private int idHabitacion;
    private LocalDate fechaReserva;
    //Singleton---------------------------------------------------------------------
    private static ArmarReserva instancia = new ArmarReserva();

    private ArmarReserva() {
    }

    public static ArmarReserva obtenerInstancia() {

        if (instancia == null) {
            instancia = new ArmarReserva();
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

}
