import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < casos; i++) {
            String nome = sc.nextLine();
            String sobrenome = sc.nextLine();

            StringBuilder nomeCompleto = new StringBuilder();

            int indiceNome = 0;
            int indiceSobrenome = 0;

            while (indiceNome < nome.length() || indiceSobrenome < sobrenome.length()) {
                for (int j = 0; j < 2 && indiceNome < nome.length(); j++) {
                    nomeCompleto.append(nome.charAt(indiceNome));
                    indiceNome++;
                }

                for (int j = 0; j < 2 && indiceSobrenome < sobrenome.length(); j++) {
                    nomeCompleto.append(sobrenome.charAt(indiceSobrenome));
                    indiceSobrenome++;
                }
            }

            System.out.println(nomeCompleto.toString());
        }

        sc.close();
    }
}
