package com.example.entrega_2_programacao_mobile_pratos;

// Classe usada como molde pra representar um Prato
public class PratoArray {

    // Atributos privados
    private String NomePrato;
    private String DescricaoPrato;

    // Construtor
    public PratoArray(String Nome, String Descricao) {
        this.NomePrato = Nome;
        this.DescricaoPrato = Descricao;
    }

    // Getters
    public String getNomePrato() {
        return NomePrato;
    }

    public String getDescricaoPrato() {
        return DescricaoPrato;
    }

    // Setters
    public void setNomePrato(String NomePrato) {
        this.NomePrato = NomePrato;
    }

    public void setDescricaoPrato(String DescricaoPrato) {
        this.DescricaoPrato = DescricaoPrato;
    }
}