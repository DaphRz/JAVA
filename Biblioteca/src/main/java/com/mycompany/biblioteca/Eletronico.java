/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Alunolab08
 */
public class Eletronico extends Produto {
    private int voltagem;
    
    public Eletronico (String n, double p, int v){
        nome = n;
        preco = p;
        voltagem = v;
    }
    
    public void ehCaro(int valor){
        
        if (preco > valor){
            System.out.println("Este eletrônico é caro");
        }
        else {
            System.out.println("Este eletrônico não é caro");
        }
    }
}