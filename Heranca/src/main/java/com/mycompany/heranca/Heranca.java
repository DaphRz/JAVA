
package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        
        Cliente c = new Cliente("daphne","123");
        Cliente c1 = new Cliente("carol","321");
        
        c1.criarConta(100, 0, 3);
        
        c.criarConta(1000, 1,1);
        
        c.mostrarSaldos();
        
        System.out.println();
        
        c.criarConta(900, 2,2);
        
        c.mostrarSaldos();
        
        System.out.println();
        
        c.getContas().get(0).sacar(100);
        
        System.out.println();
        
        c.getContas().get(1).depositar(100);
        
        System.out.println();
        
        c.getContas().get(1).sacar(10);
        
        System.out.println();
        
        for(Conta conta : c.getContas()){
            conta.aplicarRendimento();
        }
        
        c.mostrarSaldos();
        
        System.out.println();
        
        c.getContas().get(0).sacar(905.74);
        
        c.getContas().get(1).sacar(1000);
        
        System.out.println();
        
        if (c.getContas().get(0) instanceof ContaCorrente){
            ((ContaCorrente) c.getContas().get(0)).receberpix(100);
        }
    }
}