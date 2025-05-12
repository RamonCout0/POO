import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[1000];

        for (int i = 0; i < 1000; i++) {
            N[i] = i % T;
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        sc.close();
    }
}
