
package biblioMVC;

import java.sql.Connection;

public class App {

    public static void main(String[] args) {
        Connection conexao = ConexaoSQLite.conectar();
        CriarTabela.criarTableLivros(conexao);
        
        new FrmLivro().setVisible(true);
    }
}
