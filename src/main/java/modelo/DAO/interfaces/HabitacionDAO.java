/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;
import java.util.List;
import modelo.Habitacion;
/**
 *
 * @author LENOVO
 */
public interface HabitacionDAO {
    boolean crearHabitacion(Habitacion habitacion);
    Habitacion leerHabitacion(String pais);
    boolean actualizarHabitacion(int id, Habitacion habitacion);
    boolean eliminarHabitacion(int id);
    List<Habitacion> obtenerHabitaciones(String pais);
}
