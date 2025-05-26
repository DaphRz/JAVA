
package com.mycompany.petshop;

public class Cachorro extends Animal implements Banho,Tosa,ConsultaMedica {
    
    public Cachorro(String nomeDono, String t, String c,int i,String n, int idd, String r){
        super(nomeDono,t,c,i,n,idd,r);
    }
    
    @Override
    public void brincar(){
        System.out.println("Buscar bolinha...");
    }
    
    @Override
    public void banho(){
        System.out.println("Dando banho... $50");
    }
    
    @Override
    public void tosa(){
        System.out.println("Tosando... $60");
    }
    
    @Override
    public void consulta(){
        System.out.println("Animal examinado $100");
    }
}
