/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turma;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private List<Professor> profs;
    
    public Aluno(String n){
        nome = n;
        profs = new ArrayList();
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean temProf(Professor p){
        return profs.contains(p);
    }
    
    public void setProf(Professor p){
        
        if (!this.temProf(p)){
            profs.add(p);
            
            if(!p.temAluno(this)){
                p.addAluno(this);
                System.out.println("Prof add ao Aluno");
            }
        }
        else{
            System.out.println("erro");
        }
    }
    
    public void removerProf(Professor p){
        
        if(this.temProf(p)){
            profs.remove(p);
            System.out.println("Prof removido");
            
            if(p.temAluno(this)){
                p.removerAluno(this);
            }
        }
        else {
            System.out.println("Prof nao encontrado");
        }
    }
}