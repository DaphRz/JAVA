
package com.mycompany.petshop;

public abstract class Animal {
    protected String nome;
    protected int id;
    protected int idade;
    protected String raca;
    
    private Dono dono;
    
    public Animal(String nomeDono, String t, String c,int i,String n, int idd, String r){
        nome = n;
        id = i;
        idade = idd;
        raca = r;
        dono = new Dono(nomeDono,t,c);
    }
    
    public void comer(){
        System.out.println("Comendo ração...");
    }
    
    public abstract void brincar();
    
    @Override
    public String toString(){
        return id+". "+dono.getNome()+". "+getClass().getSimpleName() + ": "+nome+ " - "+raca+" | "+idade+" anos. ";
    }
}
