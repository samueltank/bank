package br.senai.sp.jandira.bc.test.model;

import br.senai.sp.jandira.bc.test.list.Bancos;

public class NovaAgencia extends Agencia {
    public void setBanco(Bancos banco) {
        this.banco = banco;
    }

    public Enum<Bancos> getBanco() {
        return this.banco;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setGerenteAgencia(String gerenteAgencia) {
        this.gerenteAgencia = gerenteAgencia;
    }

    public String getGerenteAgencia() {
        return this.gerenteAgencia;
    }

    public void setTelefoneAgencia(String telefoneAgencia) {
        this.telefoneAgencia = telefoneAgencia;
    }

    public String getTelefoneAgencia() {
        return this.telefoneAgencia;
    }
}
