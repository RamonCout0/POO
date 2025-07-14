import Orcamento.Orcamento;
import Orcamento.Servico;
import Orcamento.Material;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Orcamento orc = new Orcamento("Cliente A", LocalDateTime.now());

        Servico servico = new Servico("Instalação", 120, 1, 2.5); // 120 minutos, 2.5 por minuto
        Material material = new Material("Parafuso", 10, 0.5, 0.3); // 10 unidades, 0.5 preço compra, 30% lucro

        orc.adicionarItem(servico);
        orc.adicionarItem(material);

        System.out.println(orc);
    }
}
