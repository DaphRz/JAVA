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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    int opçao;

	    do {
	    
                    // System.out.println("   ____________________________");
		    System.out.println("\n\tMenu da Calculadora\n");
		    // System.out.print("   ____________________________\n");
		
		    System.out.printf("[1] Adição\n");
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
		                break;
		            case 2:
		                 System.out.println("\nOpção escolhida: Subtração [2]");
		                 break;
		            case 3:
		                  System.out.println("\nOpção escolhida: Multiplicação [3]");
		                  break;
		             case 4: 
		                System.out.println("\nOpção escolhida: Divisão [4]");
		                break;
		              default:
		                 System.err.println("\nError. Escolha um número válido (0 a 4)");
		                    break;
	    	        }       
        } while (opçao != 0);
        scan.close();
    }
}
