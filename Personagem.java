/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulador_RPG;

/**
 *
 * @author GUSTAVOHENRIQUEDEOLI
 */
public class Personagem {
    String nome;
    int altura;
    int peso;
    int level;
    int vidaMAX;
    int vidaAtual;
    int almas;
    String classeInicial;
    int cargaMAXkg;
    int PTvigor;
    int PTresistencia;
    int PTvitalidade;
    int PTsintonização;
    int PTforca;
    int PTdestreza;
    int PTadaptabilidade;
    int PTinteligencia;
    int PTfé;
    String equipMdireita;
    String equipMesquerda;
    
    public Personagem(String nome,int altura,int peso,int level,int vidaMaxima,int vidaAtual,int almasatuais, String classeInicial, int cargaMaxima, int vigor,int resistencia,int vitalidade,int sintonização,int forca,int destreza,int adaptabilidade,int inteligencia, int fé,String equipMdeireita,String equipMesquerda){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.level = level;
        vidaMAX = vidaMaxima;
        this.vidaAtual = vidaAtual;
        almas = almasatuais;
        this.classeInicial = classeInicial;
        cargaMAXkg = cargaMaxima;
        PTvigor = vigor;
        PTresistencia = resistencia;
        PTvitalidade = vitalidade;
        PTsintonização = sintonização;
        PTforca = forca;
        PTdestreza = destreza;
        PTadaptabilidade = adaptabilidade;
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

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public int getLevel() {
        return level;
    }

    public int getVidaMAX() {
        return vidaMAX;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getAlmas() {
        return almas;
    }

    public String getClasseInicial() {
        return classeInicial;
    }

    public int getCargaMAXkg() {
        return cargaMAXkg;
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
