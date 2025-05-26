
package com.mycompany.heranca;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(double s, int id){
        super(s,id); 
    }
    
    @Override
    public void sacar(double i){
        if (i + 15 <= saldo){
            saldo = saldo - i - 15;
            System.out.println("Saque concluído");
            System.out.println("Valor atualizado: R$"+saldo);
        }
        else {
            System.out.println("Saldo indisponível");
        }
    }
    
    @Override
    public void aplicarRendimento(){
        saldo *= 1.005;
    }
}
