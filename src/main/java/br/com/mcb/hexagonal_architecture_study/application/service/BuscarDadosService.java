package br.com.mcb.hexagonal_architecture_study.application.service;

import br.com.mcb.hexagonal_architecture_study.application.port.input.BuscarDadosUseCase;
import br.com.mcb.hexagonal_architecture_study.application.port.output.BuscarDadosOutputPort;
import br.com.mcb.hexagonal_architecture_study.domain.entity.DadosCliente;
import org.springframework.stereotype.Service;

@Service
public class BuscarDadosService implements BuscarDadosUseCase {

    private final BuscarDadosOutputPort buscarDadosOutputPort;

    public BuscarDadosService(BuscarDadosOutputPort buscarDadosOutputPort) {
        this.buscarDadosOutputPort = buscarDadosOutputPort;
    }

    @Override
    public DadosCliente buscarDados() {
        return buscarDadosOutputPort.buscarDados();
    }
}
