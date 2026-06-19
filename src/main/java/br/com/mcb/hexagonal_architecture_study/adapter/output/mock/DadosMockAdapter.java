package br.com.mcb.hexagonal_architecture_study.adapter.output.mock;

import br.com.mcb.hexagonal_architecture_study.application.port.output.BuscarDadosOutputPort;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Cliente;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Conta;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadosMockAdapter implements BuscarDadosOutputPort {

    @Override
    public List<Object> buscarDados() {
        return List.of(
                new Cliente("123142141"),
                new Conta(1234, 56789, 0)
        );
    }
}
