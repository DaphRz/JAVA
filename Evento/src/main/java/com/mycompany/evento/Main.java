/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evento;

public class Main {

    public static void main(String[] args) {
        Evento e = new Evento("Festa");
        Evento e1 = new Evento("Formatura");
        
        Participante p = new Participante("Daphne","daphne@email.com");
        Participante p1 = new Participante("Carol","carol@email.com");
        Participante p2 = new Participante("Vanusa","vanusa@email.com");
                
        e.exibir();
        e.adicionar(p);
        e.adicionar(p1);
        
        e.exibir();
        e1.exibir();
        
        e1.adicionar(p);
        e1.adicionar(p2);
        e1.exibir();
        
        //e1.remover("daphne@email.com");
        e1.remover(p);
        e1.remover(p);
        
        //e1.exibir();
    }
}