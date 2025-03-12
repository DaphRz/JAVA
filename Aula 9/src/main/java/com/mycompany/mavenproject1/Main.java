/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab12
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("TESTES");
        
        Teste t1 = new Teste();
        t1.a = 10;
        t1.b = 20;
        // t1.c = 30;  - private, está encapsulado
        
        // t1.setC(30);
        
        t1.imprimirA();
        t1.imprimirB();
        t1.imprimirC();
        
        System.out.println(t1.getC());
    }
}