package entities;
import  java.util.ArrayList;
import java.util.List;

public class Carrinho {

    //Lista dos produtos adicionados ao carrinho
    private List<Produto> produtos;

    //Construtor
    public Carrinho() {
        produtos = new ArrayList<>();
    }

    //Adiciona um produto no carrinho
    public void adicionarProdutoCarrinho(Produto produto) {
        produtos.add(produto);
    }

    //Remove um produto do carrinho
    public void removeProdutoCarrinho(Produto produto) {
        produtos.remove(produto);
    }

    //Calcula o valor total do carrinho
    public double calcularTotal() {
        double total = 0;

        for(Produto produto : produtos) {
            total += produto.getPreco();
        }
        return  total;
    }

    //Verifica se o carrinho está vazio
    public boolean estaVazio() {
        return produtos.isEmpty();
    }

    //Exibe os produtos do carrinho
    public void exibirCarrinho() {
        if (estaVazio()) {
            System.out.println("O carrinho está vazio");
        }
        System.out.println("------ Carrinho de Compras ------");
        for(Produto produto : produtos) {
            System.out.println(
                    "Produto: " + produto.getNome() +
                            " | Preço: R$ " + produto.getPreco()
            );
        }
        System.out.printf("Total do carrinho é: R$ %.2f%n", calcularTotal());}

    //Limpar carrinho
    public void limparCarrinho() {
        produtos.clear();
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