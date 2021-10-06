package br.senai.sp.jandira.bc.test.model;

import br.senai.sp.jandira.bc.test.list.Bancos;

public abstract class Agencia

{
    protected Enum banco; // futuramente será alterado(para o tipo Banco, da classe Bancos)
    protected String numeroAgencia;
    protected String gerenteAgencia;
    protected String telefoneAgencia;

    public abstract void setBanco(Bancos banco);
    public abstract void setNumeroAgencia(String numeroAgencia);
    public abstract void setGerenteAgencia(String gerenteAgencia);
    public abstract void setTelefoneAgencia(String telefoneAgencia);


    public abstract Enum getBanco();
    public abstract String getNumeroAgencia();
    public abstract String getGerenteAgencia();
    public abstract String getTelefoneAgencia();
}

class Agencias extends Agencia
{
    public void setBanco(Bancos banco)
    {
        this.banco = banco;
    }

    public Enum<Bancos> getBanco()
    {
        return this.banco;
    }

    public void setNumeroAgencia(String numeroAgencia)
    {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroAgencia()
    {
        return this.numeroAgencia;
    }

    public void setGerenteAgencia(String gerenteAgencia)
    {
        this.gerenteAgencia = gerenteAgencia;
    }

    public String getGerenteAgencia()
    {
        return this.gerenteAgencia;
    }

    public void setTelefoneAgencia(String telefoneAgencia)
    {
        this.telefoneAgencia = telefoneAgencia;
    }

    public String getTelefoneAgencia()
    {
        return this.telefoneAgencia;
    }
}
