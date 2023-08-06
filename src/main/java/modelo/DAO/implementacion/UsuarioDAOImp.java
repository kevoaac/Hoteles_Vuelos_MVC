/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO.implementacion;

import java.sql.SQLException;
import java.util.List;
import modelo.Crud;
import modelo.DAO.interfaces.UsuarioDAO;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public class UsuarioDAOImp implements UsuarioDAO{
private Crud crud;

    public UsuarioDAOImp(Crud crud) {
        this.crud = crud;
    }
    
    @Override
    public boolean crearUsuario(Usuario usuario) {
        try {
            Crud crud = new Crud();
            return crud.crearUsuario(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario leerUsuario(int id) {
        try {
            Crud crud = new Crud();
            return crud.leerUsuario(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean actualizarUsuario(int id, Usuario usuario) {
        try {
            Crud crud = new Crud();
            return crud.actualizarUsuario(id, usuario);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminarUsuario(int id) {
        try {
            Crud crud = new Crud();
            return crud.eliminarUsuario(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        try {
            Crud crud = new Crud();
            return crud.obtenerUsuarios();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
