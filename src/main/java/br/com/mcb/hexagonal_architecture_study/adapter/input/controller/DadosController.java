package br.com.mcb.hexagonal_architecture_study.adapter.input.controller;

import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ClienteResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.ContaResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.DadosResponse;
import br.com.mcb.hexagonal_architecture_study.application.port.input.BuscarDadosUseCase;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Cliente;
import br.com.mcb.hexagonal_architecture_study.domain.entity.Conta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DadosController {

    private final BuscarDadosUseCase buscarDadosUseCase;

    public DadosController(BuscarDadosUseCase buscarDadosUseCase) {
        this.buscarDadosUseCase = buscarDadosUseCase;
    }

    @GetMapping("/dados")
    public DadosResponse buscarDados() {
        List<Object> dados = buscarDadosUseCase.buscarDados()
                .stream()
                .map(this::toResponse)
                .toList();

        return new DadosResponse(dados);
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
