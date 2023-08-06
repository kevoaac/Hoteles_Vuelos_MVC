/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO.implementacion;

import java.sql.SQLException;
import java.util.List;
import modelo.Crud;
import modelo.DAO.interfaces.VueloDAO;
import modelo.Vuelo;

/**
 *
 * @author LENOVO
 */
public class VueloDAOImp implements VueloDAO{
private Crud crud;

    public VueloDAOImp(Crud crud) {
    this.crud = crud;
    }

    @Override
    public boolean crearVuelo(Vuelo vuelo) {
        try {
            Crud crud = new Crud();
            return crud.crearVuelo(vuelo);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Vuelo leerVuelo(String origen, String radio) {
        try {
            Crud crud = new Crud();
            return crud.leerVuelo(origen, radio);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean actualizarVuelo(int id, Vuelo vuelo) {
        try {
            Crud crud = new Crud();
            return crud.actualizarVuelo(id, vuelo);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminarVuelo(int id) {
        try {
            Crud crud = new Crud();
            return crud.eliminarVuelo(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Vuelo> obtenerVuelo(String origen, String destino) {
        try {
            Crud crud = new Crud();
            return crud.obtenerVuelos(origen, destino);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
