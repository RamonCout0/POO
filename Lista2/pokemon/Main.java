import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> capturados = new HashSet<>();
        for(int i = 0; i < n; i++){
            String nome = sc.nextLine();
            capturados.add(nome);
        }
        int Total = capturados.size();
        int falta = 151 - Total;

        System.out.println("Falta(m) " + falta + " pomekon(s).");
        sc.close();
    }
}