/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayLista;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Eletronicos implements ProdutoInter {
    String nomes;// {"Chaleira eletrica", "Celular LG P10", "Fogão eletrico", "Bomba atomica"};
    double precos;// {45.00, 572.75, 3500, 1000000.50};
    
    public Eletronicos(String nome, double preco) {
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
