/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.HashMap;
import java.util.Map;


public class AgendaTelefonica {
    
    private Map <String, Contato> mapaAgenda;
    
    //private static int tamanho = 0;
    
    public AgendaTelefonica() {
        this.mapaAgenda = new HashMap<>();
    }
        
    public void inserir(String nome, String num){
        Contato cntt = new Contato(nome,num);
        
        //if
        //validar nomes iguais
        
        mapaAgenda.put(nome,cntt);
        
        //tamanho++;
    }
    
    /* public String buscarNumero(String nome){
        Contato cntt = mapaAgenda.get(nome);
        return cntt.getNum(); } */
    
    public String buscar(String nome){
        return mapaAgenda.get(nome).getNum(); }
    
    public void remover(String nome){
        
        if(mapaAgenda.remove(nome) != null){
            System.out.println("\nContato removido.");
        }
        else{
            System.out.println("\nContato não encontrado.");
        }
        
        //mapaAgenda.remove(nome);
        //tamanho--;
    }
    
    public int tamanho(){
        //return tamanho;
        return this.mapaAgenda.size();
    }
    
    public void imprimir(){
        
        if(mapaAgenda.isEmpty()){
            System.out.println("Vazio.");
        }
        else{
            for (String nome : mapaAgenda.keySet()) {
            System.out.println("\nNome: "+nome+" | Número: "+mapaAgenda.get(nome).getNum());
        }
        }
        
        System.out.println("\nTamanho da Agenda Telefônica: "+tamanho());
    }
}