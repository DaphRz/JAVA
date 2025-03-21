/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioprova1;

// import java.util.Scanner;

/**
 *
 * @author daphne
 */

public class Main {

    public static void main(String[] args) {
        
        // Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\tALUNO 1\n");
         
        ClassAluno aluno = new ClassAluno("daphne","Ciencia da Computação", 
                                             "CC3Mc",3,10,7.8);
        
        ClassAluno aluno1 = new ClassAluno();
                                           
        System.out.println("Matrícula: "+aluno.getMatricula());
        System.out.println("Nome: "+aluno.getNome()+"\n");
        System.out.println("Curso: "+aluno.getCurso());
        System.out.println("Turma: "+aluno.getTurma());
        System.out.println("Período: "+aluno.getPeriodo()+"\n");
        System.out.println("Nota 1B: "+aluno.getNota1B());
        System.out.println("Nota 2B: "+aluno.getNota2B()+"\n");
        System.out.println("Nota Final: "+aluno.getGerarNotaFinal());
        System.out.println("Passou? "+aluno.passar("CC4Mc",4));
        
        System.out.println("\nTotal Alunos: "+ClassAluno.getquantAlunos());
    }
}
