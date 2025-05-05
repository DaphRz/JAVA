/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turma;

import java.util.List;
import java.util.ArrayList;

public class Professor {
    private String nome;
    private List<Aluno> alunos;
    
    public Professor(String n){
        nome = n;
        alunos = new ArrayList();
    }
    
    public boolean temAluno(Aluno a){
        return alunos.contains(a);
    }
    
    public void addAluno(Aluno a){
        
        if(!this.temAluno(a)){
            alunos.add(a);
            
            if(!a.temProf(this)){
                a.setProf(this);
                System.out.println("Aluno add ao Prof");
            }
        }
        else {
            System.out.println("erro");
        }
    }
    
    public void removerAluno(Aluno a){
        
        if(this.temAluno(a)){
            alunos.remove(a);
            System.out.println("Aluno removido");
            
            if(a.temProf(this)){
                a.removerProf(this);
            }
        }
        else {
            System.out.println("Aluno nao encontrado");
        }
    }
    
    public void imprimir(){
        
        if(!alunos.isEmpty()){
            for (int i = 0; i < alunos.size();i++){
                System.out.println("Professor: "+nome+ " "+(i+1)+" "+alunos.get(i).getNome());
            }
        }
        else {
            System.out.println("Lista vazia");
        }
    }
}