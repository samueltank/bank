package br.senai.sp.jandira.bc.test.app;

import br.senai.sp.jandira.bc.test.list.Bancos;
import br.senai.sp.jandira.bc.test.list.TipoConta;
import br.senai.sp.jandira.bc.test.model.NovaAgencia;
import br.senai.sp.jandira.bc.test.model.Cliente;
import br.senai.sp.jandira.bc.test.model.Conta;

public class App
{
    public static void main(String[] args)
    {
        // criar a cliente Maria

        Cliente clienteMaria = new Cliente();
        clienteMaria.setName("Maria Antonieta");
        clienteMaria.setEmail("mariaantonieta@gmail.com");
        clienteMaria.setSalario(2500.25);

        // criar agência da Maria:

        NovaAgencia agenciaMaria = new NovaAgencia();
        agenciaMaria.setBanco(Bancos.BANCO_ITAU);
        agenciaMaria.setNumeroAgencia("1234-5");
        agenciaMaria.setGerenteAgencia("Jogger Sebastião");
        agenciaMaria.setTelefoneAgencia("(11)4164-2547");


        // criar conta da Maria:

        Conta contaMaria = new Conta("1254-8"); // criação de objeto pela palavra-chave 'new';
        contaMaria.setTitular(clienteMaria); // o ponto simboliza uma seta que aponta para os atributos do objeto;
        contaMaria.setAgencia(agenciaMaria);
        contaMaria.setTipo(TipoConta.SALARIO);
        contaMaria.depositar(5000);

        System.out.println(contaMaria.getTipo());

        /*
         Conta teste = contaMaria;  // teste recebe o endereço de memória do objeto contaMaria;
         System.out.println(teste); // retorna a referência da memória RAM (em hexadecimal);
        */

        // criação do cliente Pedro:

        Cliente clientePedro = new Cliente();
        clientePedro.setName("Pedro Rodolfo");
        clientePedro.setEmail("pedrorodol@gmail.com");
        clientePedro.setSalario(2564.52);

        // criar a agência Pedro:

        NovaAgencia agenciaPedro = new NovaAgencia();
        agenciaPedro.setBanco(Bancos.BANCO_ITAU);
        agenciaPedro.setNumeroAgencia("1234-5");
        agenciaPedro.setGerenteAgencia("Jogger Sebastião");
        agenciaPedro.setTelefoneAgencia("(11)4164-2547");

        // criar a conta do Pedro:

        Conta contaPedro = new Conta("2541-9");
        contaPedro.setTitular(clientePedro);
        contaPedro.setTipo(TipoConta.POUPANCA);
        contaPedro.setAgencia(agenciaPedro);
        contaPedro.depositar(500);

        // criar a cliente Ana:
        Cliente clienteAna = new Cliente();
        clienteAna.setName("Ana Cristina");
        clienteAna.setEmail("anacristina@gmail.com");
        clienteAna.setSalario(2564.58);

        // criar a agência da Ana:

        NovaAgencia agenciaAna = new NovaAgencia();
        agenciaAna.setBanco(Bancos.BANCO_ITAU);
        agenciaAna.setNumeroAgencia("1234-5");
        agenciaAna.setGerenteAgencia("Jogger Sebastião");
        agenciaAna.setTelefoneAgencia("(11)4164-2547");

        // criar a conta da Ana;
        Conta contaAna = new Conta("2541-6");
        contaAna.setTitular(clienteAna);
        contaAna.setTipo(TipoConta.SALARIO);
        contaAna.setAgencia(agenciaAna);
        contaAna.depositar(600);


        contaMaria.exibirDetalhes();
        contaPedro.exibirDetalhes();
        contaAna.exibirDetalhes();
    }
}
