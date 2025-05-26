
package com.mycompany.petshop;

public class Gato extends Animal implements ConsultaMedica {
    
    public Gato(String nomeDono, String t, String c,int i,String n, int idd, String r){
        super(nomeDono,t,c,i,n,idd,r);
    }
    
    @Override
    public void brincar(){
        System.out.println("Brincando com varinha isca...");
    }
    
    @Override
    public void consulta(){
        System.out.println("Animal examinado $70");
    }
}
