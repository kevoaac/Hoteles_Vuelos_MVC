package controlador.Reserva;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DAO.implementacion.ReservaDAOImp;
import modelo.DAO.implementacion.UsuarioDAOImp;
import modelo.DAO.interfaces.ReservaDAO;
import modelo.Reserva;
import modelo.Usuario;
import vista.Login;
import vista.views.PanelHabitaciones;

/**
 *
 * @author kevin
 */
public class Logica {

    public static void asignarIdUsuario(String correo) {
        //Guardar datos para la reserva------------------------

        try {
            //Guardar Id de usuario que inicio sesion
            UsuarioDAOImp usuarioCRUD = new UsuarioDAOImp();
            Usuario usuario = usuarioCRUD.leer(correo);

            Registro reservaSingleton = new RegistroBuilder()
                    .buildIdUsuario(usuario.getIdUsuario())
                    .buildNombreUsuario(usuario.getNombre())
                    .buildApellidoUsuario(usuario.getApellido())
                    .build();

            //reservaSingleton.setIdUsuario(usuarioCRUD.leer(correo).getIdUsuario());
        } catch (SQLException ex) {
            System.out.println(" <<<ERROR ASIGNANDO ID USUARIO");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void asignarIdVuelo(int idVuelo, double precio) {

        Registro reservaSingleton = new RegistroBuilder()
                .buildIdVuelo(idVuelo)
                .buildPrecioVuelo(precio)
                .build();

    }

    public static void asignarIdHabitacion(int idHabitacion, double preciohabitacion) {
        Registro reservaSingleton = new RegistroBuilder()
                .buildIdHabitacion(idHabitacion)
                .buildPrecioHabitacion(preciohabitacion)
                .build();

    }

    public static void crearReserva(){
        //Crear Reserva
        Reserva reserva = new Reserva();
        Registro registro = new RegistroBuilder().build();
        
        reserva.setIdUsuario(registro.getIdUsuario());
        reserva.setIdVuelo(registro.getIdVuelo());
        reserva.setIdHabitacion(registro.getIdHabitacion());
        reserva.setFechaReserva(LocalDate.now());
        reserva.setIdReserva(0);//se genera automaticamente
        
        System.out.println(registro);
        
        //CREAR reserva en base de datos
        try {
            ReservaDAO reservaCRUD = new ReservaDAOImp();
            reservaCRUD.crear(reserva);
        } catch (SQLException ex) {
            System.out.println(" <<<ERROR ASIGNANDO ID HABITACION y mas valores");
            Logger.getLogger(PanelHabitaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static double calcularPrecioTotal(){
        Registro registro = new RegistroBuilder().build();
        
        double IVA = 0.12;
        double subtotal = registro.getPrecioHabitacion() + registro.getPrecioVuelo();
        
        
        return subtotal + (IVA * subtotal);
    }

}
