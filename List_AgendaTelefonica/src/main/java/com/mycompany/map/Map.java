/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.map;

public class Map {

    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        //Contato c1 = new Contato("Daphne","28 999515636");
        
        System.out.println("\n\t----- AGENDA TELEFÔNICA -----");
        
        agenda.inserir("Daphne","28 999515636");
        agenda.inserir("Maria Carla","28 999008877");
        
        System.out.println("\nO Número é: "+agenda.buscar("Daphne"));
        
        agenda.remover("Maria Carla");
        
        agenda.imprimir();
    }
}