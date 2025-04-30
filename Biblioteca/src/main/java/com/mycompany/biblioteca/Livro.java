/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Alunolab08
 */
public class Livro extends Produto {
    private String autor;
    private int paginas;
    
    public Livro (String n, double p, String a, int pag) {
       nome = n;
       preco = p;
       autor = a;
       paginas = pag;
    }
       
    public void ehGrande(){
           
        if (paginas > 200){
            System.out.println("Este livro é grande");
        }
        else {
             System.out.println("Este livro não é grande");
        }
    }
    
    @Override
    public void ehCaro(){
        
        if (preco > 50){
            System.out.println("Este livro é caro");
        }
        else {
            System.out.println("Este livro não é caro");
        }
    }
}
