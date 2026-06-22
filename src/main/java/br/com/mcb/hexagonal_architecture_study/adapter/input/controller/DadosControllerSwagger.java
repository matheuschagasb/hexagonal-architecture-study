package br.com.mcb.hexagonal_architecture_study.adapter.input.controller;

import br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto.DadosResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;

@Tag(name = "Dados", description = "Operacoes para consulta de dados de clientes e contas")
public interface DadosControllerSwagger {

    @Operation(
            summary = "Busca dados",
            description = "Retorna os dados de clientes e contas disponiveis na aplicacao."
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Dados encontrados com sucesso",
                    content = @Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = DadosResponse.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Erro interno no servidor",
                    content = @Content
            )
    })
    DadosResponse buscarDados();
}
