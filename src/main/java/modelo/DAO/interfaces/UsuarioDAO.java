/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.DAO.interfaces;

import java.sql.SQLException;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public interface UsuarioDAO {
    boolean crear(Usuario usuario) throws SQLException;
    Usuario leer(int id) throws SQLException;
    boolean actualizar(int id, Usuario usuario) throws SQLException;
    boolean eliminar(int id) throws SQLException;
    List<Usuario> listar() throws SQLException;
    
}
