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
        
        // posso declarar todos os objetos aqui: nome, numero, ...
        
        conta.limite1 = 800;
        conta.limite2 = 10;
    
        System.out.println("\n\tMenu da Conta\n");
        
        System.out.print("Digite seu Nome: ");
        conta.nome = scan.nextLine();
        
        if(conta.nome.equalsIgnoreCase("Daphne")){
        }
        else {
            System.out.println("\nError. Digite um Nome Válido!");
            
            System.exit(0);
        }
        
        System.out.print("Digite o Número da sua Conta: ");
        
        try {
            conta.numero = scan.nextInt();
            
            if (conta.numero == 1 || conta.numero == 2) {
                System.out.println("\n\tOK. Conta Válida");
            }
            else {
                System.out.println("\nError. Digite uma Conta Válida!");
                System.exit(0);
            }
        }
        catch (Exception e) {
            System.out.println("\nError. Digite uma Conta Válida!");
            System.exit(0);
        }
    
        System.out.print("\nDigite o Valor do seu Saldo: ");
        conta.saldo = scan.nextDouble();
    
        System.out.print("Digite o valor do Saque: ");
        double saque = scan.nextDouble();
        
        conta.verificacaoSaque(saque);
        
                                                                                 /* if (saque >= 0 && saque <= conta.limite1 && saque <= conta.limite2) {
                                                                                        conta.sacar(saque); }
                                                                                    else if (saque > conta.limite1 && conta.numero == 1) {
                                                                                        System.out.println("\nError! Seu Limite de Saque é de R$800,00.");
                                                                                        System.exit(0); }
                                                                                    else if (saque > conta.limite2 && conta.numero == 2) {
                                                                                        System.out.println("\nError! Seu Limite de Saque é de R$10,00.");
                                                                                        System.exit(0); }
                                                                                    else {
                                                                                        System.out.println("\nError. Digite um Valor Válido!");
                                                                                        System.exit(0); } */
                
        System.out.println("\nValor da Conta Atualizado: "+ conta.saldo);
        
        System.out.print("\nDigite o valor do Depósito: ");
        conta.deposito = scan.nextDouble();
        
                                                                                 /* if (conta.deposito >= 0) {
                                                                                        conta.depositar(conta.deposito); }
                                                                                    else {
                                                                                        System.out.println("\nError. Digite um Valor Válido!");
                                                                                        System.exit(0); } */
        
        conta.verificacaoDeposito();
        
        System.out.println("\nValor da Conta Atualizado: "+ conta.saldo);
        
        System.out.print("\nDigite o valor do Saque: ");
        saque = scan.nextDouble();
        
        conta.verificacaoSaque(saque);
        
        System.out.println("\nValor da Conta Atualizado: "+ conta.saldo);
        
        System.out.print("\nDigite o valor do Depósito: ");
        conta.deposito = scan.nextDouble();
        
        conta.verificacaoDeposito();

        System.out.println("\nValor da Conta Atualizado: "+ conta.saldo);
        System.out.println("\n\tConcluído!");
        
        scan.close();
    }
}
