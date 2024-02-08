/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacontabancaria;

/**
 *
 * @author Marina
 */
public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldoConta;
    
    public ContaBancaria(){
    }
    
    public ContaBancaria(String nomeCliente, int numConta, double saldoConta){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldoConta = saldoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    public void sacarDinheiro(double valorASacar){
        if (saldoConta - valorASacar >= 0) {
            saldoConta -= valorASacar;
        } else {
            System.out.println("Você não tem saldo o suficiente para sacar");
        }
        System.out.println("O seu saldo atual é de: " + saldoConta);
    }
    
    public void depositarDinheiro(double valorADepositar){
        saldoConta += valorADepositar;
        System.out.println("O seu saldo atual é de: " + saldoConta);
    }
    
    public void showConta(){
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Num Conta: " + numConta);
        System.out.println("Saldo: " + saldoConta);
    }
}
