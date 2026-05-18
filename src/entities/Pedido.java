package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Cliente> listaClientes = new ArrayList<>();
    private List<ItemPedido> listaItens =  new ArrayList<>();

    public void adicionarProduto(ItemPedido item) {
        listaItens.add(item);
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }



}