
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
    }
    
    public void addAutor(Autor a){
        as = new ArrayList();
        as.add(a);
        System.out.println("OK");
    }
}