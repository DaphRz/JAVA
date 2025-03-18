/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Scanner;
import java.time.Year;
import java.util.Random;

/**
 *
 * @author alunolab11
 */
public class Exercicios {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ClasseAluno aluno = new ClasseAluno("daphne","Ciencia da Computação", 
                                            "CC3Mc",3,9.8,7.8);
        
        Random random = new Random();
        int numero = random.nextInt(10000);
        
        String matricula = String.format("%d%04d", Year.now().getValue(), numero);
        
        aluno.setMatricula(matricula);
                
        System.out.println("Matrícula: "+aluno.getMatricula());
        System.out.println("Nome: "+aluno.getNome());
    }
}
