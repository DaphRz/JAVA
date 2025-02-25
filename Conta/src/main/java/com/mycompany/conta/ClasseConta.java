/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab08
 */
public class ClasseConta {
    int numero;
    String nome;
    double limite;
    double saldo;
    
    double deposito;
        
    /*public*/ void sacar(double v){  // v = valor
        saldo = saldo - v;
    }
    
    void depositar(double v){
        saldo = saldo + v;
    }
}
