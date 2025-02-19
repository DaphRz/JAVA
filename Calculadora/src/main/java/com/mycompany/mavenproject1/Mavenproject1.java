/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */

import java.util.Scanner;

public class Mavenproject1 {
    
    /* public static void Funçao() {
        System.out.println("\nFunção OK");} */
    
    public static float Soma(float num1, float num2){
        float soma = num1 + num2;
        return soma;
    }
    
    public static float Menos(float num1, float num2) {
        float sub = num1 - num2;
        return sub;
    }
    
    public static float Vezes(float num1, float num2){
        float mult = num1 * num2;
        return mult;
    }
    
    public static float Div(float num1, float num2) {
        float div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        
        // Funçao(); - chamada da função
        
        Scanner scan = new Scanner(System.in);
	int opçao;
        float num1;
        float num2;
        // float soma;
        // float sub;
        // float mult;
        // float div;

	    do {
	    
                    System.out.println("   ____________________________");
		    System.out.println("\n\tMenu da Calculadora");
		    System.out.print("   ____________________________\n");
		
		    System.out.printf("\n[1] Adição\n");
		    System.out.println("[2] Subtração");
		    System.out.println("[3] Multiplicação");
		    System.out.printf("[4] Divisão\n");
		    System.out.println("[0] Sair");
		
		    System.out.printf("\nEscolha uma opção: ");
		    opçao = scan.nextInt();
		
		    // System.out.printf("\nA opção escolhida foi: %d\n", opçao);
		    // scan.close(); -- Quebra o looping
		
		        switch (opçao){
		            case 0:
		                System.out.println("\nSaindo...");
		                break;
                                
		            case 1:
		                System.out.println("\nOpção escolhida: Adição [1]");
                                
                                System.out.printf("\nDigite o Primeiro Número: ");
                                num1 = scan.nextFloat();
                                
                                System.out.printf("Digite o Segundo Número: ");
                                num2 = scan.nextFloat();
                                
                                // soma = num1 + num2;
                                
                                System.out.printf("\nA Soma foi: %.2f\n\n", Soma(num1, num2));
		                break;
                                
		            case 2:
		                System.out.println("\nOpção escolhida: Subtração [2]");
                                 
                                System.out.printf("\nDigite o Primeiro Número: ");
                                num1 = scan.nextFloat();
                                 
                                System.out.printf("Digite o Segundo Número: ");
                                num2 = scan.nextFloat();
                                 
                                // sub = num1 - num2;
                                 
                                System.out.printf("\nA Subtração foi: %.2f\n\n", Menos(num1, num2));
		                break;
                                 
		            case 3:
		                System.out.println("\nOpção escolhida: Multiplicação [3]");
                                  
                                System.out.printf("\nDigite o Primeiro Número: ");
                                num1 = scan.nextFloat();
                                  
                                System.out.printf("Digite o Segundo Número: ");
                                num2 = scan.nextFloat();
                                  
                                // mult = num1 * num2;
                                  
                                System.out.printf("\nA Multiplicação foi: %.2f\n\n", Vezes(num1, num2));
		                break;
                                  
		             case 4: 
                                System.out.println("\nOpção escolhida: Divisão [4]");
                                
                                System.out.printf("\nDigite o Primeiro Número: ");
                                num1 = scan.nextFloat();
                                
                                System.out.printf("Digite o Segundo Número: ");
                                num2 = scan.nextFloat();
                                
                                if (num2 == 0){
                                    System.out.println("\nA Divisão por 0 não é válida.");
                                    break;
                                }
                                
                                // div = num1 / num2;
                                
                                System.out.printf("\nA Divisão foi: %.3f\n\n", Div(num1,num2));
                                break;
                                    
		              default:
                                System.err.println("\nError. Escolha um número válido (0 a 4)");
                                break;
	    	        }       
        } while (opçao != 0);
            
        scan.close();
    }
}