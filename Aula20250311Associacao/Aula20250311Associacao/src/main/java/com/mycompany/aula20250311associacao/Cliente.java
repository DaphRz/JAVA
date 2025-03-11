package com.mycompany.aula20250311associacao;

public class Cliente {
    String cpf;
    String nome;
    String sobrenome;
    Cliente conjuge;
    
    public void Casar(Cliente conjuge){
        if(this.conjuge != null){
            this.conjuge = conjuge;
            this.conjuge.conjuge = this;
        }else{
            System.out.println("Já ta casado.");
        }
    }
}
