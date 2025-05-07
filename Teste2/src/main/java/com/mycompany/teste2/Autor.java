
package com.mycompany.teste2;

import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome, abreviatura;
    
    private List<Contato> cntt = new ArrayList<>();
    private List<Livro> ls = new ArrayList<>();
    
    public Autor(String n, String ab){
        nome = n;
        abreviatura = ab;
    }
    
    public boolean temLivro(Livro l){
        return ls.contains(l);
    }
    
    public void addCntt(String t, String c){
        Contato cntt = new Contato(t,c);
        this.cntt.add(cntt);
        System.out.println("OK");
    }
    
    public void addLivro(Livro l){
        
        if(!this.temLivro(l)){
            ls.add(l);
            
            if(!l.temAutor(this)){
                l.addAutor(this);
                System.out.println("OK");
            }
        }
        else {
            System.out.println("Autor já add ao Livro");
        }
    }
}