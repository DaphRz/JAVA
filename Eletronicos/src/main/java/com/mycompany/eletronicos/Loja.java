
package com.mycompany.eletronicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Loja {
    
    private List <Produto> estoque;
    private Set <String> categorias;
    private Map <Integer, Produto> mapaProdutos;
    
    public Loja(){
        estoque = new ArrayList();
        categorias = new HashSet();
        mapaProdutos = new HashMap();
    }
    
    public boolean temProduto(Produto p){
        return estoque.contains(p);
    }
    
    public void addProduto(Produto p){
        
        if(!this.temProduto(p)){
            
            estoque.add(p);
            categorias.add(p.getMarca());
            mapaProdutos.put(p.getId(),p);
            
            System.out.println("Produto add à Loja: "+p);
        }
        else{
            System.out.println("Produto já contido");
        }
    }
    
    public Produto buscarID(int id){
        
        if(mapaProdutos.containsKey(id)){
            return mapaProdutos.get(id);
        }
        else{
            return null;
        }
    }
    
    public void exibirPorCategoria(String marca){
        
        System.out.println("Produtos da marca: " + marca);
        
        for(Produto p : estoque){
            if(p.getMarca().equalsIgnoreCase(marca)){
                System.out.println(p);
            }
        }
    }
    
    public void listarCateg(){
        for(String marca : categorias){
            System.out.println("- " + marca);
        }
    }
}
