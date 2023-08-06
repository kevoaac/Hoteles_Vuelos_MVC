/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Habitacion;

/**
 *
 * @author LENOVO
 */
public interface HabitacionDAO {

    boolean crear(Habitacion habitacion) throws SQLException;

    Habitacion leer(String pais) throws SQLException;

    boolean actualizar(int id, Habitacion habitacion) throws SQLException;

    boolean eliminar(int id) throws SQLException;

    List<Habitacion> listar(String pais) throws SQLException;
}
