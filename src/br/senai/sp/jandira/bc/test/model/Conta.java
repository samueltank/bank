package br.senai.sp.jandira.bc.test.model;

public class Conta
{
    public String tipo;
    public String numero;
    public String numeroAgencia;
    public String titular;
    public double saldo;

    public void depositar(double valorDeposito)
    {
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque)
    {
        saldo -= valorSaque;
    }

    public void trasferir()
    {

    }
    public void exibirDetalhes()
    {
        System.out.println();
        System.out.println("------------------------------------");
        System.out.printf("Titular: %s\n",titular);
        System.out.printf("Número: %s\n" ,numero);
        System.out.printf("Titular: %s\n",numeroAgencia);
        System.out.printf("Titular: %s\n",tipo);
        System.out.printf("Titular: %s\n",saldo);
    }
}
