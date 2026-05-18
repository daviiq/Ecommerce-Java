package services;

public class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento com Pix: R$ " + valor);
    }
}
