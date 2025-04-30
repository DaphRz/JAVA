/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author Alunolab08
 */
public class Biblioteca {

    public static void main(String[] args) {
        
        Livro l = new Livro("POO", 149.9, "Daphne", 300);
        Livro l1 = new Livro("Cálculo", 49.9, "Carol", 100);
        
        Eletronico e = new Eletronico("Fone de Ouvido", 75, 100);
        
        System.out.println("\n\t| Bibioteca |\n");
        
        l.ehCaro();
        l.ehGrande();
        
        System.out.println();
        
        l1.ehCaro();
        l1.ehGrande();
        
        System.out.println();
        
        e.ehCaro();
        e.ehCaro(75);
    }
}
