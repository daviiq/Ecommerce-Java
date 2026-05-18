package entities;

public class Cliente {

    private String nomeCliente;
    private String emailCliente;
    private String enderecoCliente;

    public Cliente() {}

    public String getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
        if (!emailCliente.contains("@")) {
            throw new RuntimeException("O Email não tem @");
        }
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /*
    public void pagarPedido(ItemPedido pedidoEfetuado) {
    } */
}