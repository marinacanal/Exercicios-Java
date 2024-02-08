/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaanimais;

/**
 *
 * @author Marina
 */
public class Peixe extends Animal{
    private String caracteristicas;
    
    public Peixe(){
        super();
    }
    
    public Peixe(String nome, String cor, String habitat, String velocidade, String comprimento, int numeroPatas, String caracteristicas){
        super(nome, cor, habitat, velocidade, comprimento, numeroPatas);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
