/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programalampada;

/**
 *
 * @author Marina
 */
public class Lampada {
    private String modelo;
    private String tensao;
    private String tipoLuz;
    private String[] tipos;
    private String cor;
    private int garantiaMeses;
    private int potencia;
    private boolean tipoAbajur;
    private boolean ligada;
    
    public Lampada() {
    }
    
    public Lampada(String modelo, String tensao, String tipoLuz, String[] tipos,
            String cor, int garantiaMeses, int potencia, boolean tipoAbajur,
            boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.tipoLuz = tipoLuz;
        this.tipos = tipos;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.potencia = potencia;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }
    
    public void ligarLampada() {
        setLigada(true);
    }
    
    public void desligarLampada() {
        setLigada(false);
    }
    
    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }
    
    public void mudarEstado() {
        if (isLigada()) {
            desligarLampada();
        } else {
            ligarLampada();
        }
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
       this.modelo = modelo;
    }
    
    public String getTensao() {
        return tensao;
    }
    
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }
    
    public String getTipoLuz() {
        return tipoLuz;
    }
    
    public void SetTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }
    
    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
