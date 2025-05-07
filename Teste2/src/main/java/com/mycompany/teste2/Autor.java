
package com.mycompany.teste2;

import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome, abreviatura;
    
    private List<Contato> cntt = new ArrayList();
    private List<Livro> ls;
    
    public Autor(String n, String ab){
        nome = n;
        abreviatura = ab;
    }
    
    public void addCntt(String t, String c){
        Contato cntt = new Contato(t,c);
        this.cntt.add(cntt);
        System.out.println("OK");
    }
    
    public void addLivro(Livro l){
        ls = new ArrayList();
        ls.add(l);
    }
}