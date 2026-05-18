package entities;

import repositories.BancoDeDados;
import services.Boleto;
import services.Cartao;
import services.Pagamento;
import services.Pix;

import java.util.List;

public class FinalizarPedido {

    private double total;
    private double frete;
    private String status;

    public void executar(Pedido pedido, Cliente cliente , String tipoPagamento) {
        List<ItemPedido> listaItens = pedido.getListaItens();

        total = 0;
        for (int i = 0; i < listaItens.size(); i++) {
            total += listaItens.get(i).getPreco() * listaItens.get(i).getQuantidade();
        }

        if (total > 500) {
            total *= 0.85;
        } else if (total > 200) {
            total *= 0.9;
        }

        if (cliente.getEnderecoCliente().equalsIgnoreCase("sc")) {
            frete = total * 0.05;
        } else {
            frete = total * 0.15;
        }

        for (ItemPedido item: listaItens) {
            System.out.println("Atualizando estoque de: " + item.getNome());
        }

        Pagamento pagamento;

        if (tipoPagamento.equalsIgnoreCase("pix")) {
            pagamento = new Pix();
            pagamento.pagar(total);
        } else if (tipoPagamento.equalsIgnoreCase("cartao")) {
            pagamento = new Cartao();
            pagamento.pagar(total);
        } else if (tipoPagamento.equalsIgnoreCase("boleto")) {
            pagamento = new Boleto();
            pagamento.pagar(total);
        }

        System.out.println("E-mail enviado para " + cliente.getEmailCliente());

        System.out.println("Relatório do pedido: ");
        for (ItemPedido item: listaItens) {
            System.out.println(item.getNome());
        }
        System.out.println("Total: " + total);

        BancoDeDados.salvarPedido(pedido);
        BancoDeDados.salvarLog("Pedido salvo: " + cliente.getNomeCliente());


    }

    /*
    obter subtotal do pedido
    aplicar desconto
    calcular frete a partir do endereço do cliente
    calcular total final (subtotal com desconto + frete)
    processar pagamento (conforme tipo)
    atualizar estoque (para cada item)
    notificar cliente
    salvar pedido + salvar log
    atualizar status para FINALIZADO
    gerar relatório (se fizer parte do caso de uso)
    * */

}
