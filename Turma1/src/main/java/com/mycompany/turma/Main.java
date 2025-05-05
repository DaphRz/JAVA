/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.turma;

public class Main {

    public static void main(String[] args) {
        
        Professor p = new Professor("Cassio");
        Aluno a = new Aluno("daphne");
        Aluno a1 = new Aluno("yasmin");
        
        p.addAluno(a);
        p.addAluno(a);
        
        System.out.println();
        
        a1.setProf(p);
        a.setProf(p);
        
        System.out.println();
        
        p.removerAluno(a);
        p.removerAluno(a);
        
        System.out.println();
        
        a.removerProf(p);
        a1.removerProf(p);
        
        System.out.println();
        
        p.addAluno(a);
        p.addAluno(a1);
        
        System.out.println();
        
        p.imprimir();
        
        System.out.println();
        
        a.removerProf(p);
        a1.removerProf(p);
        
        System.out.println();
        
        p.imprimir();
    }
}