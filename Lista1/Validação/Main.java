import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0.0;

        while (notasValidas < 2) {
            double nota = scanner.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);

        scanner.close();
    }
}
