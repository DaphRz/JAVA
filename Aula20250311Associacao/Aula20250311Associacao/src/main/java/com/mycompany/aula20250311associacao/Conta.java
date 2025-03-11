package com.mycompany.aula20250311associacao;

public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular;
    
    public void Sacar(double valor){
        this.saldo-=valor;
    }
    
    public void Depositar(double valor){
        this.saldo+=valor;
    }
}
