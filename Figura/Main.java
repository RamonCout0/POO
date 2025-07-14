package Figura;


// Classe abstrata
abstract class Figura3D {
    public abstract double GetVolume();
}

// Classe Esfera
class Esfera extends Figura3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double GetVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}

// Classe Cubo
class Cubo extends Figura3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double GetVolume() {
        return Math.pow(lado, 3);
    }
}

// Programa para utilizar as classes
public class Main {
    public static void main(String[] args) {
        Esfera esfera = new Esfera(3);
        Cubo cubo = new Cubo(2);

        System.out.printf("Volume da esfera: %.2f\n", esfera.GetVolume());
        System.out.printf("Volume do cubo: %.2f\n", cubo.GetVolume());
    }
}
