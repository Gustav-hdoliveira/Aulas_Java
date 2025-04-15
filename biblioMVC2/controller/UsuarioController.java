/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC2.controller;

import biblioMVC2.model.Usuario;
import biblioMVC2.dao.UsuarioDAO;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    public boolean registrarUsuario(String username, String senha){
        Usuario usuario = new Usuario(username, senha);
        return usuarioDAO.registarUsuario(usuario);
    }
    
    public boolean validarLogin(String username, String senha){
        Usuario usuario = new Usuario(username, senha);
        return usuarioDAO.validarLogin(usuario);
    }
}
