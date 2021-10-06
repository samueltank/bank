package br.senai.sp.jandira.bc.test.app;

import br.senai.sp.jandira.bc.test.list.TipoConta;
import br.senai.sp.jandira.bc.test.model.Cliente;
import br.senai.sp.jandira.bc.test.model.Conta;
import com.sun.security.ntlm.Client;

import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        // criar o cliente Maria

        Cliente clienteMaria = new Cliente();
        clienteMaria.setName("Maria Antonieta");
        clienteMaria.setEmail("mariaantonieta@gmail.com");
        clienteMaria.setSalario(2500.25);


        // criação conta da Maria
        Conta contaMaria = new Conta("1254-8"); // criação de objeto pela palavra-chave 'new';
        contaMaria.getTitular(); // o ponto simboliza uma seta que aponta para os atributos do objeto;
        contaMaria.setNumeroAgencia("5465-8");
        contaMaria.setTipo(TipoConta.SALARIO);
        contaMaria.depositar(5000);

        System.out.println(contaMaria.getTipo());


//        Conta teste = contaMaria;  // teste recebe o endereço de memória do objeto contaMaria;
//        System.out.println(teste); // retorna a referência da memória RAM (em hexadecimal);
//        System.out.println(teste.saldo);

        // criação do cliente Prdro;
        Cliente clientePedro = new Cliente();
        clientePedro.setName("Pedro Rodolfo");
        clientePedro.setEmail("pedroro");
        clientePedro.setSalario(2564.52);

        // criação conta do Pedro;
        Conta contaPedro = new Conta("2541-9");
        contaPedro.getTitular();
        contaPedro.setTipo(TipoConta.POUPANCA);
        contaPedro.setNumeroAgencia("4214-9");
        contaPedro.depositar(500);

        // criação do cliente Ana;
        Cliente clienteAna = new Cliente();
        clienteAna.setName("Ana Cristina");
        clienteAna.setEmail("anacristina@gmail.com");
        clienteAna.setSalario(2564.58);

        // criação conta da Ana;
        Conta contaAna = new Conta("2541-6");
        contaAna.getTitular();
        contaAna.setTipo(TipoConta.SALARIO);
        contaAna.setNumeroAgencia("4884-9");
        contaAna.depositar(600);

        // exibir os detalhes da conta:
//        contaMaria.exibirDetalhes();
//        contaPedro.exibirDetalhes();
//        contaAna.exibirDetalhes();

        // depositar 100 reais na conta da Maria:
//        contaMaria.depositar(100);
//        contaMaria.exibirDetalhes();

        // sacar 100 reais da conta da Ana:
//        contaAna.sacar(50);
//        contaAna.exibirDetalhes();

        // depositar na conta do Pedro:
//        contaPedro.depositar(500);
//        contaPedro.exibirDetalhes();

        // sacar -100 da conta da Maria:
//        contaMaria.sacar(500);

        // trasferir 100 reais da conta do Pedro para a conta da Maria:
        //contaPedro.trasferir(contaMaria, 150);

        contaMaria.exibirDetalhes();
        contaPedro.exibirDetalhes();
        contaAna.exibirDetalhes();
    }
}
