/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Inimigo {
    String nome;
    double vida;
    double ataque;
    int defesa;
    int carga;
    double velocidade;
    
    public Inimigo(String nome_per, double Vitalidade, double Poder_Ataque, int armadura, String Classe_per, int Carga, double velocidade_Media){
        nome = nome_per;
        vida = Vitalidade;
        ataque = Poder_Ataque;
        defesa = armadura;
        carga = Carga;
        velocidade = velocidade_Media;
    };
    
    public void getPersonagem(){
        System.out.println("O inimigo: " + nome + " possui: " + ataque + " pts em ataque, " + vida + " pts de vida e " + defesa + "pts de defesa.");
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean estaVivo(){
        if(vida > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public void ataque_basico(Personagem inimigo){
        
    }
    public int getEscudo(){
        return defesa;
    }
    public double getVida(){
        return vida;
    }
    
    public int getCarga(){
        return carga;
    }
    
    public double getAtaque(){
        return ataque;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
}
