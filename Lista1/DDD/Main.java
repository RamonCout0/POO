import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int DDD = sc.nextInt;

       String resultado = switch(DDD){
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };

        System.out.println(resultado);
        sc.close();
    }
}