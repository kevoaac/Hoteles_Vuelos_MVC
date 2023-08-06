
package controlador.Logica;

import modelo.Reserva;
import modelo.Usuario;
import modelo.Vuelo;

/**
 *
 * @author kevin
 */
public class Logica {
    //Singleton---------------------------------------------------------------------
    private static Logica instancia = new Logica();
    
    private Logica() {
        // Constructor privado para evitar instanciación desde fuera de la clase.
    }
    
    public static Logica obtenerInstancia(){
        
        if (instancia == null) {
            instancia = new Logica();
        }
        return instancia;
    }
    //---------------------------------------------------------------------------------
    
    
    private static Usuario usuario;
    private static Vuelo vuelo;
    private static Reserva reserva;
    

    public static Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public static Reserva getReserva() {
        return reserva;
    }

    public  void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    
    
    
    
    
    
    
    
    
}
