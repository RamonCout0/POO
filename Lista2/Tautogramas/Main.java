import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
       
    while (true){

        String frase = sc.nextLine();
        
        if(frase.equals("*")){ //aqui fez um if que só vai acabar a frase quando ele utilizar o * para terminar o programa, ou seja o programa vai rodar até que se utilize *//
            break;
        }
    
        String[] palavras = frase.split(" ");//aqui é para separar as frases, eu desobri a pouco tempo//

        char p1 = Character.toLowerCase(palavras[0].charAt(0));

        boolean Taugrama = true;

        for(int i = 1; i < palavras.length; i++){
            if(Character.toLowerCase(palavras[i].charAt(0)) != p1){
                Taugrama = false;
                break;
            } //essa parte do codigo ele declara p1 para ser o indice 0 da frase, assim um for para pecorrer a frase toda identificando se 
            //a frase é um tautograma ou não. Caso ele for falso, ele quebará o while. Achei interessante.
        }
        if(Taugrama){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
     

        


        sc.close();
    }
}



/** Agora que eu entendi o que é Tautograma, é um frase 
 * que consiste na primeira letra se repete.
 * Basicamente tenho que criar um programa e checar se ele é um
 * tautograma ou não. a palavra tem que ter 20 letras
 * e a frase 50 tanto faz sendo maiuscula ou não.
 * 
 */