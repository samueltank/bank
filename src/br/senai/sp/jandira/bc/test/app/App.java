package br.senai.sp.jandira.bc.test.app;

import br.senai.sp.jandira.bc.test.model.Conta;

public class App
{
    public static void main(String[] args)
    {
        // criação conta da Maria
        Conta contaMaria = new Conta(); // criação de objeto pela palavra-chave 'new';

        contaMaria.titular = "Maria Antonieta"; // o ponto simboliza uma seta que aponta para os atributos do objeto;
        contaMaria.numero = "7845-8"; // o atributo número da conta Maria recebe o valor descrito;
        contaMaria.numeroAgencia = "5465-8";
        contaMaria.saldo = 500.0;
        contaMaria.tipo = "Corrente";

        System.out.println(contaMaria.titular);


        Conta teste = contaMaria;  // teste recebe o endereço de memória do objeto contaMaria;
        System.out.println(teste); // retorna a referência da memória RAM (em hexadecimal);
        System.out.println(teste.saldo);

        // criação conta do Pedro;
        Conta contaPedro = new Conta();
        contaPedro.titular = "Pedro Cabral";
        contaPedro.numero = "6547-6";
        contaPedro.saldo = 200.0;
        contaPedro.tipo = "Poupança";
        contaPedro.numeroAgencia = "4214-9";

        // criação conta da Ana;
        Conta contaAna = new Conta();
        contaAna.titular = "Ana Caroline";
        contaAna.numero = "6610-6";
        contaAna.saldo = 600.0;
        contaAna.tipo = "Poupança";
        contaAna.numeroAgencia = "4884-9";

        // exibir os detalhes da conta:
        contaMaria.exibirDetalhes();
        contaPedro.exibirDetalhes();
        contaAna.exibirDetalhes();

    }
}
