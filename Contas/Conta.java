package Contas;

    
public interface Conta {
        void depositar(double valor);
        void sacar(double valor);
        void getSaldo();
}

class ContaCorrente implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    