package Contas;
import Contas.Conta;
public class main {
    Conta ContaCorrente() = new ContaCorrente();
    ContaCorrente().depositar(100);
    try{
        cc.sacar(50);
    } catch (Exception e) {
        System.out.println("Erro ao sacar: " + e.getMessage());
    }
    
}
