/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PokeList;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Pokemon {
    String nome;
    String tipo;
    int nivel;
    
    public Pokemon(String nome_poke, String tipo1, int nivelPoke){
        nome = nome_poke;
        tipo = tipo1;
        nivel = nivelPoke;
    }
    
    void set_Vazio(Pokemon PokeCelecionado){
        nome = PokeCelecionado.get_nome();
        tipo = PokeCelecionado.get_tipo();
        nivel = PokeCelecionado.get_nivel();
    }
    
    String get_nome(){
        return nome;
    }
    
    String get_tipo(){
        return tipo;
    }
    
    int get_nivel(){
        return nivel;
    }
}
