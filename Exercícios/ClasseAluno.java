/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author alunolab11
 */
public class ClasseAluno {

    private static int quantAlunos = 0;

    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;

    public ClasseAluno() {
    }
    
    public ClasseAluno(String nome,String curso, String turma, int periodo, 
            double nota1B, double nota2B) {
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
        
        nota1B + nota2B = this.notaFinal;
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
}
