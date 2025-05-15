import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();
            String nome = "";
            
            switch(mes){
            case 1 :
            nome = "January";
            break;

            case 2 :
            nome = "February";
            break;
            
            case 3 :
            nome = "March";
            break;

            case 4: 
            nome = "April";
            break;

            case 5:
            nome = "May";
            break;

            case 6:
            nome = "June";
            break;

            case 7:
            nome = "july";
            break;

            case 8:
            nome = "August";
            break;

            case 9:
            nome = "September";
            break;

            case 10:
            nome = "October";
            break;

            case 11:
           nome = "November";
            break;

            case 12:
            nome = "December";
            break;

            default :
            System.out.println("Mes invalido tente novamente");
            
        }
        System.out.println(nome);
        sc.close();
        

    }
}