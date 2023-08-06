/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.util.List;
import modelo.Reserva;

/**
 *
 * @author LENOVO
 */
public interface ReservaDAO {
    boolean crearReserva(Reserva reserva);
    Reserva leerReserva(int id);
    boolean actualizarReserva(int id, Reserva reserva);
    boolean eliminarReserva(int id);
    List<Reserva> obtenerReservas();
}
