
package com.mycompany.heranca;

public class ContaCorrente extends Conta implements Pix {
    
    public ContaCorrente(double s, int id){
        super(s,id); 
    }
    
    @Override
    public void sacar(double i){
        if (i + 5 <= saldo){
            saldo = saldo - i - 5;
            System.out.println("Saque concluído");
            System.out.println("Valor atualizado: R$"+saldo);
        }
        else {
            System.out.println("Saldo indisponível");
        }
        
    }
    
    @Override
    public void aplicarRendimento(){
        saldo *= 1.012;
    }
    
    @Override
    public void receberpix(double i){
        saldo += i;
        System.out.println("Pix concluído");
        System.out.println("Valor atualizado: R$"+saldo);
    }
}