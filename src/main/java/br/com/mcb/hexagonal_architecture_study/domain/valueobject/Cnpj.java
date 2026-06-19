package br.com.mcb.hexagonal_architecture_study.domain.valueobject;

public class Cnpj {

    private final String valor;

    public Cnpj(String valor) {
        if (valor == null || !valor.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ precisa ter 14 numeros.");
        }

        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
