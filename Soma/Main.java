import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insere o valor A: ");
        int a = scanner.nextInt();
        System.out.print("Insere o valor B: ");
        int b = scanner.nextInt();


        int r = a + b;

        System.out.print("SOMA = " + r);

    }
}