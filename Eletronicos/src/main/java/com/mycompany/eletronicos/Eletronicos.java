
package com.mycompany.eletronicos;

public class Eletronicos {

    public static void main(String[] args) {
        
        Produto p = new Produto(0,"Escova","Colgate",4);
        Produto p1 = new Produto(1, "Smartphone", "Samsung", 2000);
        Produto p2 = new Produto(2, "Notebook", "Dell", 4900);
        Produto p3 = new Produto(3, "Fone de Ouvido", "Sony", 300);
        Produto p4 = new Produto(4, "TV", "Samsung", 2800);
        
        Loja l = new Loja();
        
        System.out.println();
        
        l.addProduto(p);
        l.addProduto(p1);
        l.addProduto(p2);
        l.addProduto(p3);
        l.addProduto(p4);
        
        System.out.println();
        
        System.out.println(l.buscarID(0));
        System.out.println(l.buscarID(1));
        
        System.out.println();
        
        l.exibirPorCategoria("colgate");
        
        System.out.println();
        
        l.exibirPorCategoria("samsung");
        
        System.out.println();
        
        l.listarCateg();
    }
}
