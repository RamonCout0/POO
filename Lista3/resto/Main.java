import java.io.IOException;
import java.util.Scanner;
 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= 10000; i++){
            if( i % i == 2 ){
                System.out.println(i);
            }
        }

        sc.close();
    }

}