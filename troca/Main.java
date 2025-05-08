import java.util.Scanner;
import java.util.Arrays;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N[] = new int[20];

        for(int i = 0; i < N.length; i++){
            N[i] = sc.nextInt();
        }
        for(int i = 0; i <N.length / 2; i++){
            int temp = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = temp;
    
        }
        for(int i =0; i < N.length; i++){
            System.out.println("N[" + i + "] = " + N[i]);
        }
    
    }
}