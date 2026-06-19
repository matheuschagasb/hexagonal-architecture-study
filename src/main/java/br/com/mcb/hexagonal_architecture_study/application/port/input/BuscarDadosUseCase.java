package br.com.mcb.hexagonal_architecture_study.application.port.input;

import br.com.mcb.hexagonal_architecture_study.domain.entity.DadosCliente;

public interface BuscarDadosUseCase {

    DadosCliente buscarDados();
}
