/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula_25_02;

/**
 *
 * @author alunolab08
 */
public class Aula_25_02 {

    public static void main(String[] args) {
        System.out.println("Exemplo de Classe:");
        
        NewClass_SoDados dados;
        dados = new NewClass_SoDados();  // Instanciando o Objeto - Separando Memória
        
        dados.i = 10;
        dados.f = 100;
        dados.b = true;
        
        dados.imprimir();
        
        // System.out.println("Int: "+ dados.i);
        // System.out.println("Float: "+ dados.f);
        // System.out.println("Boolean: "+ dados.b);

    }
}
