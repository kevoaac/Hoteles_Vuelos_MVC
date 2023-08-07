package controlador.Reserva;

import java.time.LocalDate;
import modelo.Reserva;

/**
 *
 * @author kevin
 */
public class RegistroBuilder {

    private Registro registro;

    public RegistroBuilder() {
        registro = Registro.obtenerInstancia();
    }

    public RegistroBuilder buildIdReserva(int idReserva) {
        registro.setIdReserva(idReserva);
        return this;
    }

    public RegistroBuilder buildIdUsuario(int idUsuario) {
        registro.setIdUsuario(idUsuario);
        return this;
    }

    public RegistroBuilder buildNombreUsuario(String nombreUsuario) {
        registro.setNombreUsuario(nombreUsuario);
        return this;
    }

    public RegistroBuilder buildApellidoUsuario(String apellidoUsuario) {
        registro.setApellidoUsuario(apellidoUsuario);
        return this;
    }

    public RegistroBuilder buildIdVuelo(int idVuelo) {
        registro.setIdVuelo(idVuelo);
        return this;
    }

    public RegistroBuilder buildIdHabitacion(int idHabitacion) {
        registro.setIdHabitacion(idHabitacion);
        return this;
    }

    public RegistroBuilder buildFechaReserva(LocalDate fechaReserva) {
        registro.setFechaReserva(fechaReserva);
        return this;
    }

    public RegistroBuilder buildPrecioVuelo(double precioVuelo) {
        registro.setPrecioVuelo(precioVuelo);
        return this;
    }

    public RegistroBuilder buildPrecioHabitacion(double precioHabitacion) {
        registro.setPrecioHabitacion(precioHabitacion);
        return this;
    }

    public Registro build() {
        return registro;

    }

}
