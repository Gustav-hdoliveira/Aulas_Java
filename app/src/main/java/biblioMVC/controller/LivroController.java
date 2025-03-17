
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.controller;


import biblioMVC.model.Livro;
import biblioMVC.model.LivroDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */

/**
 * Classe LivroController que atua como controlador na arquitetura MVC (Model-View-Controller).
 * Ela faz a intermediação entre a camada de visão (View) e a camada de modelo (Model),
 * permitindo a manipulação dos dados de livros.
 */
public class LivroController {
    
    // Atributo privado que faz a interação com o banco de dados (via LivroDAO)
    private LivroDAO livroDAO;

    // Construtor da classe, que inicializa o objeto LivroDAO
    public LivroController() {
        this.livroDAO = new LivroDAO();  // Cria uma instância de LivroDAO para acessar o banco de dados
    }

    // Método para adicionar um livro no banco de dados
    public String adicionarLivro(String titulo, String autor, String anoTexto)  {
        try {
            int ano = Integer.parseInt(anoTexto);
            Livro livro = new Livro(titulo, autor, ano);
            livroDAO.adicionarLivro(livro);
            return "Livro adicionado com sucesso!";
        } catch (NumberFormatException e) {
            return "Erro: " + e.getMessage();
        }
    }
    
    public String listarLivros(Connection conexao) {
      String textoLivros = "";
      String lstl = "SELECT * FROM livros";

      try {
         Statement stmt = conexao.createStatement();

         try {
            ResultSet rs = stmt.executeQuery(lstl);

            try {
               textoLivros = textoLivros + "ID | Titulo | Autor | ano\n";

               int id;
               String titulo;
               String autor;
               String ano;
               for(textoLivros = textoLivros + "----------------------\n"; rs.next(); textoLivros = textoLivros + id + " | " + titulo + " | " + autor + " | " + ano + "\n") {
                  id = rs.getInt("id");
                  titulo = rs.getString("titulo");
                  autor = rs.getString("autor");
                  ano = rs.getString("ano");
               }
            } catch (SQLException var10) {
               if (rs != null) {
                  try {
                     rs.close();
                  } catch (SQLException var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if (rs != null) {
            } else {
                rs.close();
             }
         } catch (SQLException var11) {
            if (stmt != null) {
               try {
                  stmt.close();
               } catch (SQLException var8) {
                  var11.addSuppressed(var8);
               }
            }

            throw var11;
         }

         if (stmt != null) {
            stmt.close();
         }
      } catch (Exception var12) {
         textoLivros = textoLivros + "Erro ao listar usuários: " + var12.getMessage();
      }

      return textoLivros;
   }


}

/*
A classe LivroController é um controlador na arquitetura MVC (Model-View-Controller). 
Seu papel é atuar como intermediário entre a visão (View) e o modelo (Model), 
permitindo que a interface do usuário interaja com os dados de forma organizada. 
No caso, ela lida com operações relacionadas a livros e interage com a camada de persistência, 
que é a classe LivroDAO.

*/
