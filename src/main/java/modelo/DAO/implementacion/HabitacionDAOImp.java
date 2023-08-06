/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO.implementacion;

import java.sql.SQLException;
import java.util.List;
import modelo.Crud;
import modelo.DAO.interfaces.HabitacionDAO;
import modelo.Habitacion;

/**
 *
 * @author LENOVO
 */
public class HabitacionDAOImp implements HabitacionDAO{
private Crud crud;

    public HabitacionDAOImp(Crud crud) {
    this.crud = crud;
    }

    @Override
    public boolean crearHabitacion(Habitacion habitacion) {
        try {
            Crud crud = new Crud();
            return crud.crearHabitacion(habitacion);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Habitacion leerHabitacion(String pais) {
        try {
            Crud crud = new Crud();
            return crud.leerHabitacion(pais);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean actualizarHabitacion(int id, Habitacion habitacion) {
        try {
            Crud crud = new Crud();
            return crud.actualizarHabitacion(id, habitacion);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminarHabitacion(int id) {
        try {
            Crud crud = new Crud();
            return crud.eliminarHabitacion(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Habitacion> obtenerHabitaciones(String pais) {
        try {
            Crud crud = new Crud();
            return crud.obtenerHabitaciones(pais);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
