package pagamento;

public class Main {
    public void main(String[] args) {
        MetodoPagamento m1 = new MetodoPagamento();
        MetodoPagamento m2 = new MetodoPagamento();
        MetodoPagamento m3 = new MetodoPagamento();

        try { 
            m1.pagar(200);
            m2.pagar(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao pagar: " + e.getMessage());
        }
        
    }
    


