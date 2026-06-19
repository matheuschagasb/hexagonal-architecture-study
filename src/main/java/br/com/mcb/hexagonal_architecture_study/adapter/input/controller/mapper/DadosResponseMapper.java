package br.com.mcb.hexagonal_architecture_study.adapter.input.controller.mapper;

import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ClienteResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ContaResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.DadosResponse;
import br.com.mcb.hexagonal_architecture_study.domain.entity.DadosCliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadosResponseMapper {

    public DadosResponse toResponse(DadosCliente dadosCliente) {
        return new DadosResponse(
                List.of(
                        new ClienteResponse(dadosCliente.getCliente().getCnpj().getValor()),
                        new ContaResponse(
                                dadosCliente.getCliente().getConta().getAgencia(),
                                dadosCliente.getCliente().getConta().getConta(),
                                dadosCliente.getCliente().getConta().getDigito()
                        )
                )
        );
    }
}
