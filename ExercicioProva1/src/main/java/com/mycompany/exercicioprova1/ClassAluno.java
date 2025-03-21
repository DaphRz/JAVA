/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.exercicioprova1;

import java.time.Year;
import java.util.Random;

/**
 *
 * @author daphne
 */

public class ClassAluno {
    
    private static int quantAlunos = 0;
 
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;
 
    // Construtores 
    
    public ClassAluno() {
        quantAlunos++;
     }
     
    public ClassAluno(String nome,String curso, String turma, int periodo, 
             double nota1B, double nota2B) 
    {
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;     
        
        gerarMatricula();
        gerarNotaFinal();
        
        quantAlunos++;
     }
    
    // Construtores
     
    public static int getquantAlunos(){
        return quantAlunos;
    }
    
    public String getMatricula() {
        return matricula;
     }
     
    public String getNome() {
        return nome;
     }
    
    public void setNome(String nome) {
        this.nome = nome;
     }
    
    public String getCurso(){
        return curso;
    }
    
    public String getTurma(){
        return turma;
    }
    
    public int getPeriodo(){
        return periodo;
    }
    
    public double getNota1B(){
        return nota1B;
    }
    
    public double getNota2B(){
        return nota2B;
    }
    
    public double getGerarNotaFinal(){
        return notaFinal;
    }
    
    private String gerarMatricula(){
        
        int ano = Year.now().getValue();

        Random random = new Random();
        int numero = random.nextInt(10000);
        return this.matricula = ano+String.format("%04d", numero);
    }
    
    private void gerarNotaFinal(){
        this.notaFinal = (this.nota1B + this.nota2B)/2;
    }
    
    public boolean passar(String novaTurma, int novoPeriodo){
        if (this.notaFinal>=7){
            this.turma = novaTurma;
            this.periodo = novoPeriodo;
            return true;
        }        
        return false;
    }
}
