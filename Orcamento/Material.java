package Orcamento;

import Orcamento.Item;

public class Material extends Item {
    private double precoCompra;
    private double margemLucro; // Exemplo: 0.2 para 20% de lucro

    public Material(String descricao, int qtd, double precoCompra, double margemLucro) {
        super(descricao, qtd);
        this.precoCompra = precoCompra;
        this.margemLucro = margemLucro;
    }

    @Override
    public double getPreco() {
        return qtd * precoCompra * (1 + margemLucro);
    }

    @Override
    public String toString() {
        return super.toString() + ", Preço compra: " + precoCompra + ", Margem lucro: " + margemLucro;
    }
}
