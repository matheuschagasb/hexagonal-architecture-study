package br.com.mcb.hexagonal_architecture_study.domain.entity;

public class Conta {

    private final Integer agencia;
    private final Integer conta;
    private final Integer digito;

    public Conta(Integer agencia, Integer conta, Integer digito) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }

    public Integer getDigito() {
        return digito;
    }
}
