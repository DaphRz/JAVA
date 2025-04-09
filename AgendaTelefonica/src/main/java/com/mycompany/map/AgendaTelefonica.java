/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.HashMap;
import java.util.Map;


public class AgendaTelefonica {
    private Map <String, Contato> mapaAgenda = new HashMap<>();
    
    private static int tamanho = 0;
        
    public void inserir(String nome, String num){
        Contato cntt = new Contato(nome,num);
        mapaAgenda.put(nome,cntt);
        
        tamanho++;
    }
    
    public String buscarNumero(String nome){
        Contato cntt = mapaAgenda.get(nome);
        return cntt.getNum();
    }
    
    public void remover(String nome){
        mapaAgenda.remove(nome);
        tamanho--;
    }
    
    public int tamanho(){
        return tamanho;
    }
    
    public void imprimir(){
        System.out.println("\n"+mapaAgenda);
        System.out.println("\nTamanho da Agenda Telefônica: "+tamanho);
    }
}