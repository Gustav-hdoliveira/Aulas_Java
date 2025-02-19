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
public class ComputadorBancoPokemon {
    ArrayList<Pokemon> BancoPokemon = new ArrayList<>();
    
    void addPokemonAObanco(String NomePKnovo, String TipoPKnovo, int LevelPKnovo){
        Pokemon pokemonNovo = new Pokemon(NomePKnovo, TipoPKnovo, LevelPKnovo);
        BancoPokemon.add(pokemonNovo);
    }
}
