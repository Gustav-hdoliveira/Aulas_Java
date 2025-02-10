/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLista;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Alimentos implements ProdutoInter {
    String nomes;//  {"Maca 0.5KG", "Melancia", "Pizza 4 queijos congelada", "Caixa de leite", "Pepsi 2L" };
    double precos;//  {8.00, 25.50, 28.78, 5.60, 7.55};
    
    public Alimentos(String nome, double preco) {
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
