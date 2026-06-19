package br.com.mcb.hexagonal_architecture_study.domain.entity;

import br.com.mcb.hexagonal_architecture_study.domain.valueobject.Cnpj;

public class Cliente {

    private final Cnpj cnpj;
    private final Conta conta;

    public Cliente(Cnpj cnpj, Conta conta) {
        this.cnpj = cnpj;
        this.conta = conta;
    }

    public Cnpj getCnpj() {
        return cnpj;
    }

    public Conta getConta() {
        return conta;
    }
}
