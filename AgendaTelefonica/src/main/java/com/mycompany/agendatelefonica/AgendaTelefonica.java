/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

import java.util.List;
import java.util.ArrayList;

public class AgendaTelefonica {
    
    private List <Contato> listaAgenda;
        
    public AgendaTelefonica() {
        listaAgenda = new ArrayList();
    }
        
    public void inserir(String nome, String num){
        Contato cntt = new Contato(nome,num);
        
        //if
        //validar nomes iguais
        
        listaAgenda.add(cntt);
    }
    
    public String buscar(String nome){
        
        for (Contato cntt : listaAgenda){
            
            if (cntt.getNome().equalsIgnoreCase(nome)){
                return cntt.getNum();
            }
        }
        return "Contato não encontrado";
    }
    
    
    public void remover(String nome){
        
        Contato removeC = null;
        
        for (Contato cntt : listaAgenda){
            
            if (cntt.getNome().equalsIgnoreCase(nome)){
                
                removeC = cntt;
            }
            
            if (removeC != null){
                listaAgenda.remove(removeC);
                System.out.println("\nContato removido com sucesso.");
            }
            else{
            System.out.println("\nContato não encontrado.");
            }
        }
    }
    
    public int tamanho(){
        return listaAgenda.size();
    }
    
    public void imprimir(){
        
        int i = 1;
        
        if(listaAgenda.isEmpty()){
            System.out.println("Vazio.");
        }
               
        else{
            for (Contato cntt : listaAgenda){
                System.out.println(i + ".");
                System.out.println(cntt);
                i++;
            }
        }
    }
}
