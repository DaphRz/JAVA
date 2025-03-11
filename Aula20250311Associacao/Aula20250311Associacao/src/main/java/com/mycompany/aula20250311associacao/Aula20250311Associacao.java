package com.mycompany.aula20250311associacao;

public class Aula20250311Associacao {

    public static void main(String[] args) {
        System.out.println("BANCO");

        Conta c1 = new Conta();
        c1.numero = 10;
        c1.saldo = 1000;
        c1.limite = 500;
        
        //OPÇÃO 1
        Cliente cli1 = new Cliente();
        cli1.cpf = "123456789-10";
        cli1.nome = "Cassio";
        cli1.sobrenome = "Capucho";
        
        c1.titular = cli1;
        
        Cliente cli2 = new Cliente();
        cli2.cpf = "1242342789-10";
        cli2.nome = "Michel";
        cli2.sobrenome = "B";
        
        cli1.Casar(cli2);
        
        System.out.println(c1.titular.conjuge.nome);
        
        //OPÇÃO 2
        /*c1.titular = new Cliente();
        c1.titular.cpf = "123456789-10";
        c1.titular.nome = "Cassio";
        c1.titular.sobrenome = "Capucho";*/
        
        
    }
}
