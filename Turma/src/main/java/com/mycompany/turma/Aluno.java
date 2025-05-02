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
            
            if (!p.temAluno(this)) {
                p.addAluno(this);
            }
        }
    }
}