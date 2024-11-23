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
    int PTfe;
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
        PTsintonização = sintonização; // quantos de feitiços podem ser portados ao msm tempo
        PTforca = forca;
        PTdestreza = destreza;
        PTvelocidade = adaptabilidade; // a velocidade do jogador é determinada dividindo o atributo por 2
        PTinteligencia = inteligencia;
        PTfe = fé;
        this.equipMdireita = equipMdeireita;
        this.equipMesquerda = equipMesquerda;
    }
    
    public Personagem getPersonagem(Personagem Spersonagem){
        return Spersonagem;
    }
    
    public boolean calcularDesvioChance(double velocidade_ataque){
        double diferenca = velocidade_ataque / (PTvelocidade / 2);
        double placar = Math.random()*20;
        if(diferenca < 0.25) return (placar > 1);
        if(diferenca < 0.35) return (placar > 1.8);
        if(diferenca < 0.45) return (placar > 3);
        if(diferenca < 0.55) return (placar > 4);
        if(diferenca < 0.70) return (placar > 6);
        if(diferenca < 0.82) return (placar > 8);
        if(diferenca < 0.92) return (placar > 9);
        if(diferenca < 1) return (placar > 10);
        if(diferenca < 1.2) return (placar > 12);
        if(diferenca < 1.5) return (placar > 14);
        if(diferenca < 1.75) return (placar > 15.5);
        if(diferenca < 1.90) return (placar > 17);
        if(diferenca < 2) return (placar > 18);
        if(diferenca > 2) return (placar > 18.5);
        return false;
    }
    
    public double calcularDano(double danocalculo){
        double calculo = danocalculo - getDefesa();
        if (calculo > 0) {
            double danoreal = calculo - getVidaAtual();
            return danoreal;
        } else {
            double danoreal = danocalculo / 10;
            return danoreal;
        }
        
    }
    public void sofrerDano(double dano){
        double danoCalculado = getVidaAtual() - calcularDano(dano);
        vidaAtual = danoCalculado;
        System.out.println("Você sofreu " + vidaAtual + " de dano.");
    }
    
    public String getNome() {
        return nome;
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

    public double getPTvelocidade() {
        return PTvelocidade;
    }

    public int getPTinteligencia() {
        return PTinteligencia;
    }

    public int getPTfé() {
        return PTfe;
    }

    public String getEquipMdireita() {
        return equipMdireita;
    }

    public String getEquipMesquerda() {
        return equipMesquerda;
    }
    
}
