public class Blocos {
    public static int parseAndDivide(String a, String b) {
        try {
            int numA = Integer.parseInt(a);
            int numB = Integer.parseInt(b);
            return numA / numB;
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }
        return 0;
    }
}