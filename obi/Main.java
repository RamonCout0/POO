import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] palavras = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            String palavra = palavras[i];

            if (palavra.length() == 3) {
                if (palavra.startsWith("OB")) {
                    palavra = "OBI";
                } else if (palavra.startsWith("UR")) {
                    palavra = "URI";
                }
            }

            System.out.print(palavra);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}