/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaanimais;

/**
 *
 * @author Marina
 */
public class Animal {
    private String nome;
    private String cor;
    private String habitat;
    private String velocidade;
    private String comprimento;
    private int numeroPatas;
    
    public Animal(){
    }
    
    public Animal(String nome, String cor, String habitat, String velocidade, String comprimento, int numeroPatas) {
        this.nome = nome;
        this.cor = cor;
        this.habitat = habitat;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
