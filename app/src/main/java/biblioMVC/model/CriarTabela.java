/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
import java.sql.Connection; // Importa a classe Connection para gerenciar a conexão com o banco de dados
import java.sql.Statement; // Importa a classe Statement para executar comandos SQL

/**
 *
 * @author Aluno
 */
public class CriarTabela { // Declaração da classe CriarTabela

    // Método que cria a tabela 'usuarios' no banco de dados
    public static void criarTabelaLivros(Connection conexao) {
        // Cria uma string contendo o comando SQL para criar a tabela, se não existir
        String sql = "CREATE TABLE IF NOT EXISTS livros (" 
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
                   + "titulo TEXT NOT NULL, " // Coluna 'nome' do tipo TEXT, obrigatório (NOT NULL)
                   + "autor TEXT NOT NULL,"
                   + "ano INTEGER NOT NULL)"; // Coluna 'email' do tipo TEXT, obrigatório (NOT NULL)
        
        // Bloco try and catch para garantir o fechamento do Statement após a execução
        /*Create Statement cria um objeto do tipo Statement, que permite executar comandos 
        SQL no banco de dados.*/
        try (Statement stmt = conexao.createStatement()) { 
            stmt.execute(sql); // Executa o comando SQL para criar a tabela
            System.out.println("Tabela 'livros' criada ou já existente."); // Exibe mensagem de sucesso
        } catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
            System.out.println("Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
        }
    }
}

