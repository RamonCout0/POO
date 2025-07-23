package pagamento;

public class Metodo {
    public interface InnerMetodo {
        void pagar(double valor);
        
    }
    class abstract Pagamento implements InnerMetodo {
        private double valor;

        public Pagamento(double valor) {
            this.valor = valor;
        }

        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento de " + valor + " realizado.");
        }

        public double getValor() {
            return valor;
        }
    }
    class CartaoCredito extends Pagamento {
        public CartaoCredito(double valor) {
            super(valor);
        }

        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento com cartão de crédito de " + valor + " realizado.");
        }
    }
    
    class Boleto extends Pagamento {
        public Boleto(double valor) {
            super(valor);
        }

        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento com boleto de " + valor + " realizado.");
        }
    }
    class Pix extends Pagamento {
        public Pix(double valor) {
            super(valor);
        }

        @Override
        public void pagar(double valor) {
            System.out.println("Pagamento com Pix de " + valor + " realizado.");
        }
    }
}

