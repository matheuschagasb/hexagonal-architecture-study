package br.com.mcb.hexagonal_architecture_study.application.port.output;

import br.com.mcb.hexagonal_architecture_study.domain.entity.DadosCliente;

public interface BuscarDadosOutputPort {

    DadosCliente buscarDados();
}
