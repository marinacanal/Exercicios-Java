/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaanimais;

/**
 *
 * @author Marina
 */
public class Mamifero extends Animal{
    private String alimento;
    
    public Mamifero(){
        super();
    }
    
    public Mamifero(String nome, String cor, String habitat, String velocidade, String comprimento, int numeroPatas, String alimento){
        super(nome, cor, habitat, velocidade, comprimento, numeroPatas);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
