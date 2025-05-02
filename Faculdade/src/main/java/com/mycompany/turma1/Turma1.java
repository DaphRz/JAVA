/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.turma1;

public class Turma1 {

    public static void main(String[] args) {
        
        Estudante e = new Estudante("Daphne");
        Estudante e1 = new Estudante("Yasmin");
        
        Curso c = new Curso("Computação");
        Curso c1 = new Curso("Medicina");
        
        e.inscreverEmCurso(c);
        
        System.out.println();
        
        e1.inscreverEmCurso(c1);
        
        System.out.println();
        
        e.inscreverEmCurso(c);
        
        System.out.println();
        
        c.adicionarEstudante(e);
        //c1.adicionarEstudante(e1);
        c1.adicionarEstudante(e);
    }
}