package entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque <T> {

    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {}

    //Adiciona o produto no estoque
    public void adicionarProdutoNoEstoque(Produto produto) {
        produtos.add(produto);
        Produto.atualizaEstoque(1);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    //Retira o produto do estoque:
    public void retirarProdutoDoEstoque(Produto produto) {
        produtos.remove(produto);
        Produto.atualizaEstoque(-1);
        System.out.println("Produto retirado: " + produto.getNome());
    }

    //Pega os produtos do estoque atual
    public void listarEstoque() {
        System.out.println("--- Estoque Atual de Produtos ---");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " " + "R$: " + produto.getPreco());
        }
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}