/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO.implementacion;

import java.sql.SQLException;
import java.util.List;
import modelo.Crud;
import modelo.DAO.interfaces.ReservaDAO;
import modelo.Reserva;

/**
 *
 * @author LENOVO
 */
public class ReservaDAOImp implements ReservaDAO{
private Crud crud;

    public ReservaDAOImp(Crud crud) {
        this.crud = crud;
    }

    @Override
    public boolean crearReserva(Reserva reserva) {
        try {
            Crud crud = new Crud();
            return crud.crearReserva(reserva);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Reserva leerReserva(int id) {
        try {
            Crud crud = new Crud();
            return crud.leerReserva(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean actualizarReserva(int id, Reserva reserva) {
        try {
            Crud crud = new Crud();
            return crud.actualizarReserva(id, reserva);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminarReserva(int id) {
        try {
            Crud crud = new Crud();
            return crud.eliminarReserva(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Reserva> obtenerReservas() {
        try {
            Crud crud = new Crud();
            return crud.obtenerReservas();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
