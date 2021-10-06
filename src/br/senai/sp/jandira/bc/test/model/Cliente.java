package br.senai.sp.jandira.bc.test.model;

public class Cliente // class que descreve o cliente;
{
    private String name;
    private String email;
    private double salario;

    public void setName(String name)
    {
        this.name = name; // sempre acrescentar o this.(atributeName) como boa prática;
    }

    public String getName()
    {
        return this.name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double getSalario()
    {
        return this.salario;
    }
}
