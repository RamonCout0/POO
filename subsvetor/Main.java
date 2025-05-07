import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];

        while(true){
            for(int i = 0; i < X.length; i++){
            
            int valor = sc.nextInt();
            if( valor <= 0){
                X[i] =1;
            }else{
                X[i] = valor;
            }

                
            System.out.println("X[" + i +"] = " + X[i]);

      
        }
        break;
        }
        
        sc.close();
    }
       
    }