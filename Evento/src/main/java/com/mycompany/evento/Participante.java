/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evento;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Participante {
    private String nome, email;
    
    public Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override
    public boolean equals(Object obj){
        
        if (this == obj) return true;
        
        if (!(obj instanceof Participante)) return false;
        
        Participante p = (Participante) obj;
        
        return Objects.equals(email,p.email);   // Identifica o participante por e-mail
    }
    
    @Override   // O método hashCode() é usado pelo Java para gerar um número inteiro que representa o objeto
    public int hashCode(){
        return Objects.hash(email);
    }
    
    @Override
    public String toString(){
        return nome+" | "+email;
    }
}