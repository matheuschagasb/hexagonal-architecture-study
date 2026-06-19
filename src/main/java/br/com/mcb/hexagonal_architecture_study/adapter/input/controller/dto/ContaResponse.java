package br.com.mcb.hexagonal_architecture_study.adapter.input.controller.dto;

public record ContaResponse(
    Integer agencia, 
    Integer conta, 
    Integer digito) {
}
