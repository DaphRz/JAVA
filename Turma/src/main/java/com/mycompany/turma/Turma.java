
package com.mycompany.turma;

public class Turma {

    public static void main(String[] args) {
        Aluno a = new Aluno("Daphne");
        Aluno a1 = new Aluno("Yasmin");
        
        Professor p = new Professor("Cássio");
        Professor p1 = new Professor("Emanuella");
        
        p.addAluno(a);
        p.addAluno(a1);
        p.addAluno(a);
    }
}
