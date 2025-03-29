/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.exercicioprova;

import java.time.Year;
import java.util.Random;


public class ClassAluno {
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;
    
    private static int quantAlunos;
    
    public ClassAluno(){
        quantAlunos++;
    }
    
    public ClassAluno(String nome, String curso, String turma,
                      int periodo, double nota1B, double nota2B) {
        
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
        
        gerarMatricula();
        gerarFinal();
        
        quantAlunos++;

        imprimir();
        
    }
    
    private String gerarMatricula(){
        int ano = Year.now().getValue();
        
        Random rand = new Random();
        int num = rand.nextInt(10000);
        
        return this.matricula = ano+String.format("%04d", num);
    }
        
    private void gerarFinal(){
        this.notaFinal = (this.nota1B + this.nota2B) / 2;
    }
    
    private void imprimir(){
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.curso);
        System.out.println(this.turma);
        System.out.println(this.periodo);
        System.out.println(this.nota1B);
        System.out.println(this.nota2B);
        System.out.println(this.notaFinal);
        System.out.println(quantAlunos);
    }
    
    public String getNome(){
        return nome.toUpperCase();
    }
    
    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }
}
