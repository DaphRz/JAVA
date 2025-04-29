
package com.mycompany.turma;

import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String nome;
    private List <Aluno> alunos = new ArrayList();
    
    public Professor(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void addAluno(Aluno a){
        
        for (Aluno aluno : alunos){
            if(aluno.getNome().equals(a.getNome())) {
                System.out.println("Aluno já adicionado.");
                return;
            }
        }
        
        alunos.add(a);
        
        if (a.getProf() != this){
            a.setProfessor(this);
        }
        System.out.println("Aluno Adicionado");
    }
}