/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turma;

public class Aluno {
    private String nome;
    Professor p;
    
    public Aluno(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Professor getProf(){
        return p;
    }
    
    public void setProfessor(Professor p){
        if (this.p != p){
            this.p = p;
            //p.addAluno(this);
        }
    }
}