
package com.mycompany.turma;

import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String nome;
    private List <Aluno> alunos;
    
    public Professor(String nome){
        this.nome = nome;
        alunos = new ArrayList();
    }
    
    public Professor(){
        
    }
    
    public void addAluno(Aluno a){
        boolean retorno = alunos.add(a);
        
        for (Aluno a : alunos){
            if(a.getNome().equals())
        }
        else{
            System.out.println("Aluno já Adicionado");
        }
    }
}
