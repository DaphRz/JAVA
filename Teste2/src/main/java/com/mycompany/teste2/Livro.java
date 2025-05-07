
package com.mycompany.teste2;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private int ano;
    Editora e;
    
    private List<Autor> as;
    
    public Livro(String t, int a, Editora e){
        titulo = t;
        ano = a;
        this.e = e;
        as = new ArrayList();
    }
    
    public boolean temAutor(Autor a){
        return as.contains(a);
    }
    
    public void addAutor(Autor a){
        
        if(!this.temAutor(a)){
            as.add(a);  
            
            if(!a.temLivro(this)){
                a.addLivro(this);
                System.out.println("OK");
            }
        }
        else{
            System.out.println("Livro já add ao Autor");
        }
    }
    
    // eu nao precisaria desse
    public void setEdit(Editora e){
        
        if(this.e != null){
            System.out.println("Editora já setada");
        }
        else{
            this.e = e;
            System.out.println("OK");
        }
    }
}