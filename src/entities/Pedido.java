package entities;

import services.Status;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Cliente> listaClientes = new ArrayList<>();
    private List<ItemPedido> listaItens =  new ArrayList<>();
    private Status status;

    public void adicionarProduto(ItemPedido item) {
        listaItens.add(item);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}