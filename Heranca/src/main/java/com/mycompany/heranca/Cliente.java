
package com.mycompany.heranca;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome, cpf;
    private Conta c;
    
    private List <Conta> contas;
    
    public Cliente(String n, String cpf){
        nome = n;
        this.cpf = cpf;
        
        contas = new ArrayList();
    }
    
    public List <Conta> getContas(){
        return contas;
    }
    
    public void criarConta(double s, int id, int tipo){
        
        if (tipo == 1){
            c = new ContaCorrente(s,id);
            contas.add(c);
            System.out.println("Conta Corrente Criada");
            return;
        }
        else if(tipo == 2){
            c = new ContaPoupanca(s,id);
            contas.add(c);
            System.out.println("Conta Poupanca Criada");
            return;
        }

        System.out.println("Digite um número válido (1 ou 2)");
    }
    
    public void mostrarSaldos() {
        int i = 1;
        
        for(Conta c : contas){
            System.out.println(i+". "+c.toString());
            i++;
        }
    }
}