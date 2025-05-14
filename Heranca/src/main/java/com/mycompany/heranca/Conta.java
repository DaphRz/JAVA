
package com.mycompany.heranca;

public class Conta {
    protected double saldo;
    protected int id;
    
    public Conta(){}
    
    public Conta(double s, int id){
        saldo = s;
        this.id = id;
    }
    
    public void sacar(int i){
        saldo = saldo - i;
        System.out.println("Saque concluído");
        System.out.println("Valor atualizado: R$"+saldo);
    }
    
    public void depositar(int i){
        saldo = saldo + i;
        System.out.println("Depósito concluído");
        System.out.println("Valor atualizado: R$"+saldo);
    }
    
    public void aplicarRendimento(){
        
    }
    
    @Override
    public String toString(){
        return "ID: "+id+" | "+"R$"+saldo;
    }
}