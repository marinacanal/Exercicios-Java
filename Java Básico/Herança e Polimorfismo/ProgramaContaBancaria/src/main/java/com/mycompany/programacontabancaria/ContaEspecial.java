/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacontabancaria;

/**
 *
 * @author Marina
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteConta;
    
    public ContaEspecial(){
        super();
    }
    
    public ContaEspecial(String nomeCliente, int numConta, double saldoConta, double limiteConta){
        super(nomeCliente, numConta, saldoConta);
        this.limiteConta = limiteConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }

    public void setLimiteConta(double limiteConta) {
        this.limiteConta = limiteConta;
    }
    
    public void sacarDinheiro(double valorASacar){
        if (limiteConta - valorASacar >= 0) {
            limiteConta =- valorASacar;
        } else {
            System.out.println("Você não tem limite o suficiente para sacar");
        }
        System.out.println("O seu limite atual é de: " + limiteConta);
    }
}
