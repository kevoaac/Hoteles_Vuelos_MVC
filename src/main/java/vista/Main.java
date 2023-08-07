package vista;

import controlador.Reserva.Registro;
import controlador.Reserva.RegistroBuilder;
import java.sql.SQLException;
import java.util.List;

import java.time.LocalDate;
import modelo.*;
import modelo.DAO.implementacion.UsuarioDAOImp;
import modelo.DAO.interfaces.UsuarioDAO;

public class Main {

    public static void main(String[] args) throws SQLException {
//Conexion.getConnection();
        //Crud operacion = new Crud();
        /*
     * OJO YA HAY VALORES QUE SE INGRESARON DESDE MYSQL POR ENDE PRIMERO QUIERO
     * VER SI LEE TODA LA INFO Y LUEGO DE UNA EN UNA, Y ASI IR PROBANDO PARA QUE FUNCIONE
     * NO BORRARAN TODA LA INFOR :,V
     * */
        //1) LEER TODA LA INFO DE LA BASE DE DATOS
        //List<Usuario> miLista = operacion.obtenerUsuarios();
        //List<Reserva> miLista = operacion.obtenerReservas(); FUNCIONA!
        //List<Vuelo> miLista = operacion.obtenerVuelos(); FUNCIONA!
        //List<Habitacion> miLista = operacion.obtenerHabitaciones(); FUNCIONA!
        //miLista.forEach(x-> System.out.println(x));

        //2) LEER DE UNO EN UNO TODA LA INFO DE LA BASE DE DATOS FUNCIONA!  
        //System.out.println(operacion.leerUsuario(4));
        //System.out.println(operacion.leerVuelo(4));
        //System.out.println(operacion.leerHabitacion(4));
        //System.out.println(operacion.leerReserva(4));
        //operacion.crearReserva(new Reserva(999, 11, 11, 11, LocalDate.now()));
        
        
        //UsuarioDAO operacion = new UsuarioDAOImp();
        
        //operacion.crear(new Usuario(999, "Carl", "Jonson", "cj@gmail.com", "12345"));
        
        Registro registro = new RegistroBuilder()
                .buildIdReserva(99)
                .buildIdUsuario(88)
                .buildNombreUsuario("RAUL")
                .buildApellidoUsuario("Sanchez")
                .buildPrecioVuelo(1234)
                .buildPrecioHabitacion(232)
                .build();
        
        Registro registro2 = new RegistroBuilder().buildIdVuelo(777).build();
        
        System.out.println(registro2);
        
    
    }
}
