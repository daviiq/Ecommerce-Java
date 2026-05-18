package entities;

public class Produto {
    private String nome;
    private int id;
    private double preco;
    private static int quantidadeEstoque = 0;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public static int getQuantidade() {
        return quantidadeEstoque;
    }

    public static void atualizaEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }
}