package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    List<String> produtos = new ArrayList<>();

    private String nome;
    private int id;
    private double preco;
    private static int quantidadeEstoque = 0;

    public Produto() {}

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
