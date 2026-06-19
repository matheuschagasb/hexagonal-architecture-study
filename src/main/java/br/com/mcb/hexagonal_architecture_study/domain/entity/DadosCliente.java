package br.com.mcb.hexagonal_architecture_study.domain.entity;

public class DadosCliente {

    private final Cliente cliente;

    public DadosCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
