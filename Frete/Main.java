package Frete;

abstract class Frete {
    protected double distancia;
    protected double peso;

    public Frete(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    public abstract double GetFrete();

    public abstract String toString();
}

class FreteTerrestre extends Frete {

    public FreteTerrestre(double distancia, double peso) {
        super(distancia, peso);
    }

    @Override
    public double GetFrete() {
        return distancia * peso * 0.01;
    }

    @Override
    public String toString() {
        return String.format("Frete Terrestre - Distancia: %.2f Km, Peso: %.2f Kg, Valor Frete: R$ %.2f", 
                             distancia, peso, GetFrete());
    }
}

class FreteAereo extends Frete {
    private double seguro;

    public FreteAereo(double distancia, double peso, double seguro) {
        super(distancia, peso);
        this.seguro = seguro;
    }

    @Override
    public double GetFrete() {
        double freteTerrestre = distancia * peso * 0.01;
        return 2 * freteTerrestre + 0.01 * seguro;
    }

    @Override
    public String toString() {
        return String.format("Frete Aéreo - Distancia: %.2f Km, Peso: %.2f Kg, Seguro: R$ %.2f, Valor Frete: R$ %.2f", 
                             distancia, peso, seguro, GetFrete());
    }
}

public class Main {
    public static void main(String[] args) {
        FreteTerrestre freteTerrestre = new FreteTerrestre(100, 50); // 100 Km, 50 Kg
        FreteAereo freteAereo = new FreteAereo(100, 50, 1000); // 100 Km, 50 Kg, seguro R$1000

        System.out.println(freteTerrestre.toString());
        System.out.println(freteAereo.toString());
    }
}
