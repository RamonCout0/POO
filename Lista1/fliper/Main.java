import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
           
           Scanner sc = new Scanner(System.in);

            int P = sc.nextInt();
            int R = sc.nextInt();
            
            if( P == 0 && R == 0){
                System.out.println("A");

            }else if (P == 0 && R == 1){
                System.out.println("B");

            }else if (P == 1 && R == 0){
                System.out.println("C");
                
            }else if (P ==1 && R ==1){
                System.out.println("B");
            }
            sc.close();
            
        }
}

/*apesar do meu codigo estiver certo, infelizmente o Beecrowd n aceita.. Pesquisei no chagpt e n resolveu.. Tive que procurar no deepSeek e que ele me enviou faz sentido mesmo.. 
    Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();

        if (P == 0) {
            System.out.println("C");
        } else if (R == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
            e o codigo fica mais simples.. FIQUEI estressado demais, só um desabafo.. Pq mano é a mesma coisa só que o beecrowd só aceita coisa extremamente especifico.. Quando forem fazer algo
            nesse site lembre que nem sempre é pq vc errou seu modo de pensar e codar com isso. É esse site que da uma doideira de vez em quando.. finalmente resolvi essa bomba de 2454.
 
*/