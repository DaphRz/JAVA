
package com.mycompany.eletronicos;

public class Produto {
    private int id;
    private String nome, marca;
    private double preco;
    
    public Produto(int i, String n, String m, float p){
        id = i;
        nome = n;
        marca = m;
        preco = p;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getId(){
        return id;
    }
    
    @Override
    public String toString (){
        return id+". "+nome+" | "+marca+" | $"+preco;
    }
}
