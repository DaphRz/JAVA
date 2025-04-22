/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evento;

import java.util.HashSet;
import java.util.Set;

public class Evento {
    private String nome;
    private Set<Participante> participantes;
    
    public Evento(String nome){
        this.nome = nome;
        this.participantes = new HashSet<>();
    }
    
    public boolean adicionar(Participante p){
        return participantes.add(p);
    }
    
    public boolean remover(String email){
        return participantes.removeIf(p -> p.getEmail().equals(email));
    }
    
    public void exibir(){
        
        if(participantes.isEmpty()){
            System.out.println("\nNenhum Participante Cadastrado no Evento: "+nome+"\n");
        }
        else {
            System.out.println("Evento: "+nome+"\n");
            
            int i = 1;
            
            for(Participante p : participantes){
                System.out.println(i+". "+p);
                i++;
            }
        }
    }
}