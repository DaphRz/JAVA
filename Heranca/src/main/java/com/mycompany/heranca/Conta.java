
package com.mycompany.heranca;

public abstract class Conta {
    protected double saldo;
    protected int id;
    
    public Conta(){}
    
    public Conta(double s, int id){
        saldo = s;
        this.id = id;
    }
    
    public abstract void sacar(double i);
       
    public void depositar(int i){
        saldo = saldo + i;
        System.out.println("Depósito concluído");
        System.out.println("Valor atualizado: R$"+saldo);
    }
    
    public abstract void aplicarRendimento();
    
    @Override
    public String toString(){
        return "ID: "+id+" | "+"R$"+saldo;
    }
}