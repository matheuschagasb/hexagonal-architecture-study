package br.com.mcb.hexagonal_architecture_study.adapter.output.mock;

import br.com.mcb.hexagonal_architecture_study.application.port.output.BuscarDadosOutputPort;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Cliente;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Conta;
import br.com.mcb.hexagonal_architecture_study.domain.entity.DadosCliente;
import br.com.mcb.hexagonal_architecture_study.domain.valueobject.Cnpj;
import org.springframework.stereotype.Component;

@Component
public class DadosMockAdapter implements BuscarDadosOutputPort {

    @Override
    public DadosCliente buscarDados() {
        return new DadosCliente(
                new Cliente(
                        new Cnpj("12345678000199"),
                        new Conta(1234, 56789, 0)
                )
        );
    }
}
