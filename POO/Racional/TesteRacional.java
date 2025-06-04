public class TesteRacional {
    public static void main(String[] args) {
        Racional a = new Racional(2, 3);
        Racional b = new Racional(3);
        Racional c = new Racional();
       // Racional d = new Racional("3 / 7");
        System.out.println("numerador de a:" + a.getNum());
        Racional d = a.vezes(b);

        d = a.vezes(outro:3);
    }
}