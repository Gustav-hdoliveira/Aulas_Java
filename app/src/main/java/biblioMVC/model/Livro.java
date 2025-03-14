/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibiloMVC.model;

/**
 *
 * @author LEONARDOESLABAOBARBO
 */
public class Livro {
    // Atributos
    private int id;
    private String titulo;
    private String autor;
    private int ano;

    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString para exibir os dados do livro
    @Override
    public String toString() {
        return "Livro{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", ano=" + ano +
               '}';
    }
}
