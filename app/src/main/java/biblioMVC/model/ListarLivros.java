// Source code is decompiled from a .class file using FernFlower decompiler.
package biblioMVC.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarLivros {
   public ListarLivros() {
   }

   public static String listarLivros(Connection conexao) {
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
