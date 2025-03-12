/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab12
 */

public class Teste {
    
    public int a;
    public int b;
    private int c;
    
    public int getC(){
        return this.c;
    }
    
    /* public void setC(int c){
        this.c = c; } */        // se não tiver essa função não dá pra alterar e acessar
    
    public void imprimirA() {
        System.out.println(this.a);
    }
    
    public void imprimirB() {
        System.out.println(this.b);
    }
    
    public void imprimirC() {
        System.out.println(this.c);
    }
}