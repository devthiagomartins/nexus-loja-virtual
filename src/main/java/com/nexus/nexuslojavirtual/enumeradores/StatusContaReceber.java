package com.nexus.nexuslojavirtual.enumeradores;

public enum StatusContaReceber {

    COBRANCA("A Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private final String descricao;

    private StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
