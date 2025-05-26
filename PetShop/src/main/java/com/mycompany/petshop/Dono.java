
package com.mycompany.petshop;

import java.util.List;
import java.util.ArrayList;

public class Dono {
    private String nome;
    private String telefone;
    private String cpf;
    
    private List <Animal> pets;
    
    public Dono(String n, String t, String c){
        nome = n;
        telefone = t;
        cpf = c;
        pets = new ArrayList<>();
    }
    
    public List <Animal> getPets(){
        return pets;
    }
    
    public String getNome(){
        return nome;
    }
}
