/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Vuelo;

/**
 *
 * @author LENOVO
 */
public interface VueloDAO {
    boolean crear(Vuelo vuelo) throws SQLException;
    Vuelo leer(String origen, String radio) throws SQLException;
    boolean actualizar(int id, Vuelo vuelo) throws SQLException;
    boolean eliminar(int id) throws SQLException;
    List<Vuelo> listar(String origen, String destino) throws SQLException;
}
