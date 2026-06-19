package br.com.mcb.hexagonal_architecture_study.domain.entity;

public class Cliente {

    private final String cnpj;

    public Cliente(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
