import java.util.Scanner;

public class Leds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ledsPorDigito = { 6, 2,  5,  5,  4,  5, 6, 3, 7, 6  };

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String numero = scanner.next();
            int totalLeds = 0;

            for (int j = 0; j < numero.length(); j++) {
                int digito = numero.charAt(j) - '0';
                totalLeds += ledsPorDigito[digito];
            }

            System.out.println(totalLeds + " leds");
        }

        scanner.close();
    }
}
