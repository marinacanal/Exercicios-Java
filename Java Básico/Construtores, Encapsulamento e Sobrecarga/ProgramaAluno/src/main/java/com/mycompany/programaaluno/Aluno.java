/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programaaluno;

/**
 *
 * @author Marina
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;
    
    public Aluno(){
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][3];
    }
    
    public Aluno(String nome, String nomeCurso, String matricula) {
        this.nome = nome;
        this.nomeCurso = nomeCurso; 
        this.matricula = matricula;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }
    
    private double obterMedia(int indice) {
        double soma = 0;
        for (int c=0; c<notasDisciplinas[indice].length; c++) {
            soma += notasDisciplinas[indice][c];
        }
        double media = soma/3;
        return media;
    }
    
    public boolean verificarAprovacao(int indice) {
        if(obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }
    
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i=0; i<notasDisciplinas.length; i++) {
            System.out.println("\n Notas da disciplina " + nomeDisciplinas[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
        }
    }
     
    public void setPosicaoDisciplina (int posicao, String nomeDisciplina) {
        this.nomeDisciplinas[posicao] = nomeDisciplina;
   }
    
   public void setPosicaoNotas (int posicaoC, int posicaoI, double
           notasDisciplinas) {
       this.notasDisciplinas[posicaoC][posicaoI] = notasDisciplinas;
   }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the nomeDisciplinas
     */
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the notasDisciplinas
     */
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    /**
     * @param notasDisciplinas the notasDisciplinas to set
     */
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
}