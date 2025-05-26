
package com.mycompany.petshop;

public class PetShop {

    public static void main(String[] args) {
        
        Animal a = new Cachorro("Daphne","(28)999515636","123.456.789-00",1,"Cindy",9,"Shit Tzhu");
        Animal a1 = new Gato("Yasmin","(28)981878349","987.654.321-00",2,"Choninho",7,"SRD");
        
        System.out.println("\n"+a);
        System.out.println(a1);
        
        System.out.println();
        
        a.brincar();
        a1.brincar();
        
        System.out.println();
        
        // parei na chamada da interface
    }
}
