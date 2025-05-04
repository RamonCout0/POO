import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < casos; i++) {
            String nome = scanner.nextLine();
            String sobrenome = scanner.nextLine();

            StringBuilder nomeCompleto = new StringBuilder();

            int indiceNome = 0;
            int indiceSobrenome = 0;

            while (indiceNome < nome.length() || indiceSobrenome < sobrenome.length()) {
                // Adiciona até 2 caracteres do nome
                for (int j = 0; j < 2 && indiceNome < nome.length(); j++) {
                    nomeCompleto.append(nome.charAt(indiceNome));
                    indiceNome++;
                }

                // Adiciona até 2 caracteres do sobrenome
                for (int j = 0; j < 2 && indiceSobrenome < sobrenome.length(); j++) {
                    nomeCompleto.append(sobrenome.charAt(indiceSobrenome));
                    indiceSobrenome++;
                }
            }

            System.out.println(nomeCompleto.toString());
        }

        scanner.close();
    }
}
