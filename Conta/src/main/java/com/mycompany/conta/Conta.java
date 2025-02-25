/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;

import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class Conta {

    public static void main(String[] args) {
        
        ClasseConta conta;
        conta = new ClasseConta();
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\n\tMenu da Conta\n");
        
        System.out.print("Digite seu Nome: ");
        conta.nome = scan.nextLine();
        
        if(conta.nome.equals("Daphne") || conta.nome.equals("daphne")){
        }
        else {
            System.out.println("\nError. Digite um Nome Válido!");
            
            System.exit(0);
        }
        
        System.out.print("Digite o Número da sua Conta: ");
        
        try {
            conta.numero = scan.nextInt();
            System.out.println("\n\tOK. Conta Válida");
        }
        catch (Exception e) {
            System.out.println("Error. Digite uma Conta Válida");
        }
    
        System.out.print("Digite o Valor do seu Saldo: ");
        conta.saldo = scan.nextDouble();
    
        System.out.print("Digite o valor do Saque: ");
        double saque = scan.nextDouble();
        
        conta.sacar(saque);
        
        System.out.println("\nValor da Conta Atualizado: "+ conta.saldo);
        
        System.out.print("\nDigite o valor do Depósito: ");
        conta.deposito = scan.nextDouble();
        
        conta.depositar(conta.deposito);
        
        System.out.printf("\nValor da Conta Atualizado: "+ conta.saldo);
        
        scan.close();

    }
}
