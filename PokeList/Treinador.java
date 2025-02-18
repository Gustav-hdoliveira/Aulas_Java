/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PokeList;

import java.util.ArrayList;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Treinador {
    String nome;
    ArrayList<Pokemon> mochila = new ArrayList<>();
    
    public Treinador(String nome_treinador){
        nome = nome_treinador;
    }
    
    String get_nome(){
        return nome;
    }
    
    void set_mochila(Pokemon newPoke){
        mochila.add(newPoke);
        mochila.add(newPoke);
        mochila.add(newPoke);
        mochila.add(newPoke);
        mochila.add(newPoke);
        mochila.add(newPoke);
    }
    
    void alter_Vazio(Pokemon PokeCelecionado){
        for (int i = 0; i < mochila.size(); i++) {
            if("vazio".equals(mochila.get(i).get_nome())){
                mochila.get(i).set_Vazio(PokeCelecionado);
            }
        }
    }
    
    
}
