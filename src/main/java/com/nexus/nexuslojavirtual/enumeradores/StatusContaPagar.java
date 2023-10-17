package com.nexus.nexuslojavirtual.enumeradores;

public enum StatusContaPagar {

    COBRANCA("A Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    NEGOCIADA("Negociada");

    private final String descricao;

    private StatusContaPagar(String descricao) {
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
