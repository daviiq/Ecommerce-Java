package services;

public class Cartao implements Pagamento{
    public void pagar(double valor) {
        System.out.println("Pagamento com Cartão: R$ " + valor);
    }
}
