
package com.mycompany.heranca;

public class Heranca {

    public static void main(String[] args) {
        Cliente c = new Cliente("daphne","123");
        
        c.criarConta(1000, 1,1);
        
        c.mostrarSaldos();
        
        System.out.println();
        
        c.criarConta(900, 2,2);
        
        c.mostrarSaldos();
        
        System.out.println();
        
        c.getContas().get(0).sacar(100);
        
        System.out.println();
        
        c.getContas().get(1).depositar(100);
    }
}
