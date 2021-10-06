package br.senai.sp.jandira.bc.test.model;

import br.senai.sp.jandira.bc.test.list.TipoConta;

public class Conta
{
    // atributos da classe:

    private TipoConta tipo; // como boa prática todos os atributos devem ser privados;
    private String numero;
    private String numeroAgencia;
    private Cliente titular;
    private double saldo;

    // construtor da classe (é iniciado quando o objeto for criado):

    public Conta(String numero)
    {
        this.numero = numero;
    }

    // métodos de acesso e atribuição:

    // atribuidores(setters):

    public void setTipo(TipoConta tipo)
    {
        this.tipo = tipo;
    }

    public void setNumeroAgencia(String numeroAgencia)
    {
        this.numeroAgencia = numeroAgencia;
    }

    public  void setTitular(Cliente titular)
    {
        this.titular = titular;
    }

    // acessores(getters):

    public Enum<TipoConta> getTipo()
    {
        return this.tipo;
    }

    public String getNumeroAgencia()
    {
        return this.numeroAgencia;
    }

    public String getNumero()
    {
        return this.numero;
    }

    public Cliente getTitular()
    {
        return this.titular;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public boolean depositar(double valorDeposito)
    {
        if (valorDeposito > 0)
        {
            saldo += valorDeposito;
            System.out.println("Valor depositado!");
            return true;
        }
        else
        {
            System.out.println("Valor não depositado!");
            return false;
        }
    }

    public boolean depositar(int valorDeposito)
    {
        if (valorDeposito > 0)
        {
            saldo += valorDeposito;
            System.out.println("Valor depositado!");
            return true;
        }
        else
        {
            System.out.println("Valor não depositado!");
            return false;
        }
    }


    public boolean sacar(double valorSaque)
    {
        if (valorSaque > 0 && valorSaque <= saldo)
        {
            saldo -= valorSaque;
            exibirDetalhes();
            System.out.println("Saque permitido!");
            return true;
        }
        else
        {
            exibirDetalhes();
            System.out.println("Valor de saque não permitido!");
            return false;
        }

    }

    public void trasferir(Conta contaDestino, double valorEnvio)
    {
        boolean resultado = sacar(valorEnvio);
        if (resultado)
        {
            contaDestino.depositar(valorEnvio);
            System.out.println("Transferência realizado com sucesso!");
        }
        else
        {
            System.out.println("Não foi possível realizar a transferência!");
        }
    }

    public void exibirDetalhes()
    {
        System.out.println();
        System.out.println("------------------------------------");
        System.out.printf("Titular: %s\n", titular.getName());
        System.out.printf("E-mail: %s\n", titular.getEmail());
        System.out.printf("Número: %s\n" , getNumero());
        System.out.printf("Agência: %s\n", getNumeroAgencia());
        System.out.printf("Tipo de Conta: %s\n", getTipo());
        System.out.printf("Saldo: %s\n", getSaldo());
    }
}
