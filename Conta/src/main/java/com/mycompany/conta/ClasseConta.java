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
    double limite1, limite2;
    double saldo;
    
    double deposito;
        
    /*public*/ void sacar(double v){  // v = valor
        saldo = saldo - v; // saldo -= v
    }
    
    void depositar(double v){
        saldo = saldo + v; // saldo += v
    }
    
    void verificacaoSaque (double saque) {
        if (saque >= 0 && ((numero == 1 && saque <= limite1) || (numero == 2 && saque <= limite2))) {
            sacar(saque);
        }
        else if (saque > limite1 && numero == 1) {
            System.out.println("\nError! Seu Limite de Saque é de R$800,00.");
            System.exit(0);
        }
        else if (saque > limite2 && numero == 2) {
            System.out.println("\nError! Seu Limite de Saque é de R$10,00.");
            System.exit(0);
        }
        else {
            System.out.println("\nError. Digite um Valor Válido!");
            System.exit(0);
        }
    }
    
    void verificacaoDeposito () {
        if (deposito >= 0) {
            depositar(deposito);
        }
        else {
            System.out.println("\nError. Digite um Valor Válido!");
            System.exit(0);
        }
    }
}