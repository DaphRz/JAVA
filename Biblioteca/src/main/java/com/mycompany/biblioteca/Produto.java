package com.mycompany.biblioteca;

public class Produto {
    public String nome;
    public double preco;
    
    public Produto() {}
    
    public Produto(String n, double p){
        nome = n;
        preco = p;
    }
    
    public void ehCaro(){
        
        if (preco > 100){
            System.out.println("Este produto é caro");
        }
        else {
            System.out.println("Este produto não é caro");
        }
    }
}
