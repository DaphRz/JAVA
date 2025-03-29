/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioprova;

/**
 *
 * @author daphne
 */
public class ExercicioProva {

    public static void main(String[] args) {
        ClassAluno a1 = new ClassAluno("daphne", "Computação", "ccm", 3,
                                        9.1, 10);
        
        ClassAluno a2 = new ClassAluno();
        ClassAluno a3 = new ClassAluno("yasmin", "medicina", "m3", 8,
                                        8.9, 9);
        
        a2.setNome("carol");
        System.out.println(a2.getNome());
    }
}
