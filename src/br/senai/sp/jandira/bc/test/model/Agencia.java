package br.senai.sp.jandira.bc.test.model;

import br.senai.sp.jandira.bc.test.list.Bancos;

public abstract class Agencia // classe abstrata publica;

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

