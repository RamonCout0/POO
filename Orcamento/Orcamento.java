package Item;
import Item.Item;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private String cliente;
    private LocalDateTime data;
    private List<Item> itens;

    public Orcamento(String cliente, LocalDateTime data) {
        this.cliente = cliente;
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double total() {
        double soma = 0;
        for (Item item : itens) {
            soma += item.getPreco();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orçamento para: ").append(cliente).append("\n");
        sb.append("Data: ").append(data).append("\n");
        sb.append("Itens:\n");
        for (Item item : itens) {
            sb.append(item.toString()).append(", Preço: ").append(item.getPreco()).append("\n");
        }
        sb.append("Total do orçamento: ").append(total()).append("\n");
        return sb.toString();
    }
}
