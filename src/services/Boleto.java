package services;

public class Boleto implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento com Boleto: R$ " + valor);
    }
}
