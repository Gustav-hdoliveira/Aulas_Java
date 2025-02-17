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
    String nivel;
    
    public Pokemon(String nome_poke, String tipo1, String nivelPoke){
        nome = nome_poke;
        tipo = tipo1;
        nivel = nivelPoke;
    }
    
    String get_nome(){
        return nome;
    }
    
    String get_tipo_primario(){
        return tipo;
    }
    
    String get_nivel(){
        return nivel;
    }
}
