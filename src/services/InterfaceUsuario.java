package services;

import entities.Carrinho;
import entities.Cliente;
import entities.Estoque;
import entities.Produto;

import java.util.Scanner;

public interface InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);
    Carrinho carrinho = new Carrinho();
    Produto MouseGamer = new Produto(1, "Mouse Gamer", 80.00);
    Produto Notebook = new Produto(2, "Notebook Gamer", 3000.00);
    Produto CadeiraGamer = new Produto(3, "Cadeira Gamer Mancer", 850.00);
    Estoque estoque = new Estoque<>();

    public default void sistemaEcommerce() {

        //Adicionando os produtos no estoque
        estoque.adicionarProdutoNoEstoque(MouseGamer);
        //PRECISA ATUALIZAR O ESTOQUE E GERAR ERRO CASO O PRODUTO ESTEJA FORA DO ESTOQUE
        estoque.adicionarProdutoNoEstoque(Notebook);
        estoque.adicionarProdutoNoEstoque(CadeiraGamer);


        //Interface do Sistema, com Switch Case
        boolean sistemaLogado = true;

        //SISTEMA DO ECOMMERCE
        while (sistemaLogado) {
            System.out.println("Digite o número da opção que deseja: ");
            System.out.println("1- Listar produtos disponíveis para compra");
            System.out.println("2- Adicionar produto(s) no carrinho");
            System.out.println("3- Verificar o carrinho ");
            System.out.println("4- Efetuar compra dos itens do carrinho ");
            System.out.println("5- Status do(s) pedido(s) ");
            System.out.println("6 - Sair ");
            int respostaSistema = scanner.nextInt();

            //Impede que encerre o programa dentro do Switch case
            scanner.nextLine();

            switch (respostaSistema) {
                case 1:
                    //Lista os produtos disponíveis para a compra
                    System.out.println("Produtos disponíveis: ");
                    estoque.listarEstoque();
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Digite o produto que deseja adicionar ao carrinho: ");
                    String nomeProduto = scanner.nextLine();

                    //Procura o produto no estoque
                    Produto produtoEncontrado = estoque.buscarProdutoPorNome(nomeProduto);

                    //Se o produto foi encontrado, mostra o preço dele, pede para adicionar no carrinho

                    if (produtoEncontrado != null) {
                        System.out.println("Você selecionou: " + produtoEncontrado.getNome());
                        System.out.println("Preço: R$ " + produtoEncontrado.getPreco());
                        System.out.println("Deseja adiciona-lo ao carrinho ? (S/N)");
                        char repostaProduto = Character.toUpperCase(scanner.next().charAt(0));
                        if (repostaProduto == 'S') {
                            carrinho.adicionarProdutoCarrinho(produtoEncontrado);
                            System.out.println("Produto adicionado no carrinho !");
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    // Exibe o conteúdo do carrinho
                    carrinho.exibirCarrinho();

                    // Se estiver vazio, encerra o case
                    if (carrinho.estaVazio()) {
                        System.out.println();
                        break;
                    }

                    System.out.println("Deseja retirar algo do carrinho? (S/N)");
                    char respostaEscolha = Character.toUpperCase(scanner.next().charAt(0));
                    scanner.nextLine(); // limpa o buffer

                    // Se não quiser remover nada, apenas retorna ao menu
                    if (respostaEscolha == 'N') {
                        System.out.println();
                        break;
                    }

                    // Caso o usuário digite algo diferente de S ou N
                    if (respostaEscolha != 'S') {
                        System.out.println("Opção inválida.");
                        System.out.println();
                        break;
                    }

                    // Pergunta se deseja limpar todo o carrinho
                    System.out.println("Deseja limpar o carrinho? (S/N)");
                    char respostaEscolha2 = Character.toUpperCase(scanner.next().charAt(0));
                    scanner.nextLine(); // limpa o buffer

                    // Se desejar limpar tudo
                    if (respostaEscolha2 == 'S') {
                        carrinho.limparCarrinho();
                        System.out.println("O carrinho foi limpo!");
                        System.out.println();
                        break;
                    }

                    // Se não quiser limpar tudo, remove apenas um produto
                    if (respostaEscolha2 == 'N') {
                        System.out.println("Digite o produto que deseja retirar do carrinho:");
                        String nomeProduto2 = scanner.nextLine();

                        // Busca o produto no carrinho
                        Produto produtoEncontrado2 = carrinho.buscarProdutoPorNome(nomeProduto2);

                        if (produtoEncontrado2 != null) {
                            carrinho.removeProdutoCarrinho(produtoEncontrado2);
                            System.out.println("O produto \"" +
                                    produtoEncontrado2.getNome() +
                                    "\" foi removido do carrinho!");
                        } else {
                            System.out.println("Produto não encontrado no carrinho.");
                        }

                        System.out.println();
                        break;
                    }

                    // Caso o usuário digite algo diferente de S ou N
                    System.out.println("Opção inválida.");
                    System.out.println();
                    break;

                        case 4:
                            //PRECISA SER IMPLEMENTADO

                            break;

                        case 5:
                            //PRECISA SER IMPLEMENTADO

                            break;

                        case 6:
                            System.out.println("Saindo...");
                            sistemaLogado = false;
                            break;
            }
        }
    }
}