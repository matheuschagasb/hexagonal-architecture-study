package br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto;

import java.util.List;

public record DadosResponse(List<DadosItemResponse> dados) {
}
