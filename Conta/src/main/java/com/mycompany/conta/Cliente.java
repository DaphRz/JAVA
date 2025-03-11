/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta;

/**
 *
 * @author alunolab09
 */
public class Cliente {    
    String nome;
    String sobrenome;
    String cpf;
    Cliente conjuge;
    
    public void casar(Cliente conjuge) {
        if (this.conjuge != null) {
           this.conjuge = conjuge; // parâmetro
           this.conjuge.conjuge = this;
        }
        else {
            System.out.println("Já está casado!");
        }
    }
}
