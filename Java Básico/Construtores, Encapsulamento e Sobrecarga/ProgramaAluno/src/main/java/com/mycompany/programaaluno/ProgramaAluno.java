/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaaluno;

import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ProgramaAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(ler.next());
        
        System.out.println("Entre com o nome do curso: ");
        aluno.setNomeCurso(ler.next());
        
        System.out.println("Entre com a matrícula: ");
        aluno.setMatricula(ler.next());
        
        for (int c=0; c<aluno.getNomeDisciplinas().length; c ++) {
            System.out.println("Entre com o nome da disciplina " + c);
            aluno.setPosicaoDisciplina(c, ler.next());
        }
        
        for (int c=0; c<aluno.getNotasDisciplinas().length; c++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[c]);
            for (int i=0; i<aluno.getNotasDisciplinas().length; i++) {
                System.out.println("Entre com a nota da disciplina " + (i+1));
                aluno.setPosicaoNotas(c, i, ler.nextDouble());
            }
        }
        
        aluno.mostrarInfo();
        
        for (int c=0; c<aluno.getNomeDisciplinas().length; c++) {
            if (aluno.verificarAprovacao(c)){
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[c] +
                        " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[c] +
                        " - foi reprovado");
            }
        }
    }
}
