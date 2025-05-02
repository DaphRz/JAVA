package com.mycompany.turma1;

import java.util.List;
import java.util.ArrayList;

public class Estudante {
    private String nome;
    private List<Curso> cursos;
    Curso c;
    
    public Estudante(String n){
        nome = n;
        cursos = new ArrayList();
    }
    
    public boolean temCurso(Curso c){
        return cursos.contains(c);
    }
            
    public void inscreverEmCurso(Curso c){
        
        if (!this.temCurso(c)){
            cursos.add(c);
            System.out.println("Inscrito");
            
            if (!c.temEstudante(this)){
                c.adicionarEstudante(this);
            }
        }
        else {
            System.out.println("Estudante já Inscrito");
        }
    }
}