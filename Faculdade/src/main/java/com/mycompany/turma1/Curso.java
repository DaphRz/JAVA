package com.mycompany.turma1;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private List<Estudante> estudantes;
    Estudante e;
    
    public Curso (String n){
        nome = n;
        estudantes = new ArrayList();
    }
    
    public boolean temEstudante(Estudante e){
        return estudantes.contains(e);
    }
    
    public void adicionarEstudante(Estudante e) {
        
        if (!this.temEstudante(e)){
            estudantes.add(e);
            System.out.println("Estudante Adicionado");
            
        }
        else {
            System.out.println("Estudante já Adicionado");
        }
    }
}