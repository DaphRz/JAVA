
package com.mycompany.teste2;

public class Teste2 {

    public static void main(String[] args) {
        Editora e = new Editora("daphne","daph@gmail");
        Editora e1 = new Editora("cassio","css@gmail");
        
        Livro l = new Livro("moana",2023,e);
        Livro l1 = new Livro("fantasmas",1951,e1);
        
        Autor a = new Autor("yasmin","yas");
        Autor a1 = new Autor("carol","ca");
        
        l.addAutor(a);
        l1.addAutor(a1);
        
        System.out.println();
        
        a.addCntt("cell", "28999");
        a.addCntt("cell", "28888");
        
        System.out.println();
        
        l.setEdit(e);
        l1.setEdit(e1);
        
        System.out.println();
        
        a.addLivro(l);
        a1.addLivro(l1);
    }
}