package Orcamento;

public abstract class Item {
    protected String descricao;
    protected int qtd;

    public Item(String descricao, int qtd) {
        this.descricao = descricao;
        this.qtd = qtd;
    }

    public abstract double getPreco();

    @Override
    public String toString() {
        return "Descrição: " + descricao + ", Quantidade: " + qtd;
    }
}
