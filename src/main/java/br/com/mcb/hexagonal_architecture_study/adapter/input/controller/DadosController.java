package br.com.mcb.hexagonal_architecture_study.adapter.input.controller;

import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.DadosResponse;
import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.mapper.DadosResponseMapper;
import br.com.mcb.hexagonal_architecture_study.application.port.input.BuscarDadosUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")
public class DadosController implements DadosControllerSwagger {

    private final BuscarDadosUseCase buscarDadosUseCase;
    private final DadosResponseMapper dadosResponseMapper;

    public DadosController(BuscarDadosUseCase buscarDadosUseCase, DadosResponseMapper dadosResponseMapper) {
        this.buscarDadosUseCase = buscarDadosUseCase;
        this.dadosResponseMapper = dadosResponseMapper;
    }

    @GetMapping
    public DadosResponse buscarDados() {
        return dadosResponseMapper.toResponse(buscarDadosUseCase.buscarDados());
    }
}
