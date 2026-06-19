package br.com.mcb.hexagonal_architecture_study.domain.entity;

public class Conta {

    private final Integer agencia;
    private final Integer conta;
    private final Integer digito;

    public Conta(Integer agencia, Integer conta, Integer digito) {
        if (agencia == null || agencia <= 0) {
            throw new IllegalArgumentException("Agencia deve ser positiva.");
        }

        if (conta == null || conta <= 0) {
            throw new IllegalArgumentException("Numero da conta deve ser positivo.");
        }

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
