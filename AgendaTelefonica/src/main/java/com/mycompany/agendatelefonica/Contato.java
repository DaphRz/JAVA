/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

/**
 *
 * @author alunolab08
 */
public class Contato {
    private String nome, num;
    
    Contato(String nome, String num){
        this.nome = nome;
        this.num = num;
    }
   
    public String getNome(){
        return nome;
    }
    
    public String getNum(){
        return num;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNum(String num){
        this.num = num;
    }
    
    @Override
    
    public String toString(){
        return "Nome: "+nome+" Número: "+num;
    }
}
