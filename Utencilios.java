/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLista;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Utencilios implements ProdutoInter{
    String nomes;//  {"Garrafa termica", "Chaleira", "Panela", "Alvejante", "Vassoura"};
    double precos;//  {10.50, 30.00, 59.99, 12.25, 19.50 };
    
    public Utencilios(String nome, double preco) {
        this.nomes = nome;
        this.precos = preco;
    }
    
    @Override
    public String getNome() { 
        return nomes; 
    }
    
    @Override
    public double getPreco() { 
        return precos; 
    }
}
