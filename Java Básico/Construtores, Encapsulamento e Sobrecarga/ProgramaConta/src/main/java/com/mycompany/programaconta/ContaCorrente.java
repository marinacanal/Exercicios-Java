/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaconta;

/**
 *
 * @author Marina
 */
public class ContaCorrente {
    private int numero;
    private int agencia;
    private double saldo;
    private double limiteEspecial;
    private boolean especial;
    
    public ContaCorrente() {
    }
    
    public ContaCorrente(int numero,int agencia, double saldo, double limiteEspecial,
            boolean especial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
    }
    
    public boolean sacarDinheiro(double quantiaASacar) {
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial +saldo;
                if (limite >= quantiaASacar) {
                saldo -= quantiaASacar;
                return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    
    public boolean depositarDinheiro(double quantiaADepositar) {
        if (saldo >= quantiaADepositar) {
            saldo -= quantiaADepositar;
            return true;
        } else {
            return false;
        }
    }
    
    public void dinheiroDepositado(double depositado) {
        saldo += depositado;
    }
    
    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
    
    public boolean verificarChequeEspecial() {
        return saldo < 0;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
}
