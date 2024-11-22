/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RPG_simulador;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Personagem {
    String nome;
    int level;
    int vidaMAX;
    double vidaAtual;
    int almas;
    double defesa;
    double cargaMAXkg;
    double cargaAtual;
    int PTvigor;
    int PTresistencia;
    int PTvitalidade;
    int PTsintonização;
    int PTforca;
    int PTdestreza;
    double PTvelocidade;
    int PTinteligencia;
    int PTfé;
    String equipMdireita;
    String equipMesquerda;
    
    public Personagem(String nome,int level,int vidaMaxima,double vidaAtual, double defesa_Per, int almasatuais, double cargaMaxima, double carga_atual, int vigor,int resistencia,int vitalidade,int sintonização,int forca,int destreza,double adaptabilidade,int inteligencia, int fé,String equipMdeireita,String equipMesquerda){
        this.nome = nome;
        this.level = level;
        vidaMAX = vidaMaxima;
        this.vidaAtual = vidaAtual;
        almas = almasatuais;
        defesa = defesa_Per;
        cargaMAXkg = cargaMaxima;
        cargaAtual = carga_atual;
        PTvigor = vigor;
        PTresistencia = resistencia;
        PTvitalidade = vitalidade;
        PTsintonização = sintonização;
        PTforca = forca;
        PTdestreza = destreza;
        PTvelocidade = adaptabilidade;
        PTinteligencia = inteligencia;
        PTfé = fé;
        this.equipMdireita = equipMdeireita;
        this.equipMesquerda = equipMesquerda;
    }
    
    public Personagem getPersonagem(Personagem Spersonagem){
        return Spersonagem;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void calcularVelocidade(){
        
    }
    
    public void calcularDesvio(double velocidade_ataque){
       double placar = Math.random() * 20;
       
    }
    
    public void sofrerDano(double dano, double velocidade_ataque){
        
    }
    
    public int getLevel() {
        return level;
    }

    public int getVidaMAX() {
        return vidaMAX;
    }

    public double getVidaAtual() {
        return vidaAtual;
    }

    public int getAlmas() {
        return almas;
    }
    
    public double getDefesa(){
        return defesa;
    }

    public double getCargaMAXkg() {
        return cargaMAXkg;
    }
    
    public double getCargaAtual(){
        return cargaAtual;
    }

    public int getPTvigor() {
        return PTvigor;
    }

    public int getPTresistencia() {
        return PTresistencia;
    }

    public int getPTvitalidade() {
        return PTvitalidade;
    }

    public int getPTsintonização() {
        return PTsintonização;
    }

    public int getPTforca() {
        return PTforca;
    }

    public int getPTdestreza() {
        return PTdestreza;
    }

    public int getPTadaptabilidade() {
        return PTadaptabilidade;
    }

    public int getPTinteligencia() {
        return PTinteligencia;
    }

    public int getPTfé() {
        return PTfé;
    }

    public String getEquipMdireita() {
        return equipMdireita;
    }

    public String getEquipMesquerda() {
        return equipMesquerda;
    }
    
}
