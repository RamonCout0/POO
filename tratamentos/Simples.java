package tratamentos;

public class Simples {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");      
        
        }
    }
}
