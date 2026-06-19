package br.com.mcb.hexagonal_architecture_study.adapter.input.controller.mapper;

import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ClienteResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ContaResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.DadosResponse;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Cliente;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Conta;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DadosResponseMapper {

    public DadosResponse toResponse(List<Object> dados) {
        return new DadosResponse(
                dados.stream()
                        .map(this::toResponse)
                        .toList()
        );
    }

    private Object toResponse(Object dado) {
        if (dado instanceof Cliente cliente) {
            return new ClienteResponse(cliente.getCnpj());
        }

        if (dado instanceof Conta conta) {
            return new ContaResponse(conta.getAgencia(), conta.getConta(), conta.getDigito());
        }

        throw new IllegalArgumentException("Tipo de dado nao suportado: " + dado.getClass().getName());
    }
}
