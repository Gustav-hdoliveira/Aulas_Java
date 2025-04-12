/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC2.model;

import biblioMVC2.database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class UsuarioDAO {
    
        public boolean registarUsuario(Usuario usuario){
            String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";
            
            String user = usuario.getEmail();
            String senha = usuario.getSenha();
            
            String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());
            
            try(Connection conn = Conexao.conexao(); PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, user);
                stmt.setString(2, senhaHash);
                
                stmt.executeUpdate();
                
                return true;
            } catch (SQLException e){
                e.printStackTrace();
                return false;
            }
        }
}
