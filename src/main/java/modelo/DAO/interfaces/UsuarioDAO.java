/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.util.List;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public interface UsuarioDAO {
    boolean crearUsuario(Usuario usuario);
    Usuario leerUsuario(int id);
    boolean actualizarUsuario(int id, Usuario usuario);
    boolean eliminarUsuario(int id);
    List<Usuario> obtenerUsuarios();
    
}
