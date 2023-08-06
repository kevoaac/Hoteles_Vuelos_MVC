/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.util.List;
import modelo.Vuelo;

/**
 *
 * @author LENOVO
 */
public interface VueloDAO {
    boolean crearVuelo(Vuelo vuelo);
    Vuelo leerVuelo(String origen, String radio);
    boolean actualizarVuelo(int id, Vuelo vuelo);
    boolean eliminarVuelo(int id);
    List<Vuelo> obtenerVuelo(String origen, String destino);
}
