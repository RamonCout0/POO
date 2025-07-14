package Orcamento;
import Orcamento.Item;

public class Servico extends Item {
    private int tempo; // tempo em minutos
    private double valorPorMinuto;

    public Servico(String descricao, int tempo, int qtd, double valorPorMinuto) {
        super(descricao, qtd);
        this.tempo = tempo;
        this.valorPorMinuto = valorPorMinuto;
    }

    @Override
    public double getPreco() {
        return tempo * valorPorMinuto * qtd;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tempo: " + tempo + " min, Valor por minuto: " + valorPorMinuto;
    }
}
