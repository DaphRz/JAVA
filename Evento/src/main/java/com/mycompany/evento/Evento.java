
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
    
       /*  public void adicionar(Participante p){
            boolean retorno = participantes.add(p);
        
            if (retorno == true){
                System.out.println("Participante Adicionado.");
            }
            else{
                System.out.println("Participante já Cadastrado.");
            }} */
    
    /* public boolean remover(String email){
        return participantes.removeIf(p -> p.getEmail().equals(email)); } */
    
    public void remover(Participante p){
        boolean retorno = participantes.remove(p);
        
        if(retorno == true){
            System.out.println("\nParticipante Removido");
        }
        else{
            System.out.println("Participante não Encontrado");
        }
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