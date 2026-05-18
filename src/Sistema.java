import entities.Cliente;
import entities.Estoque;
import entities.Produto;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        Estoque estoque = new Estoque<>();

        //Entrando no sistema
        System.out.println("Bem vindo a Fast-By");
        System.out.println("Faça o seu cadastro !");
        System.out.println("Digite o seu nome: ");
        String respostaNome = scanner.nextLine();
        cliente.setNomeCliente(respostaNome);

        System.out.println("Agora digite o seu email:  (Sem o @gmail.com)"  );
        String respostaEmail = scanner.nextLine();
        String emailFormatado = String.format(respostaEmail + "@gmail.com");
        System.out.println("O email digitado é: " + emailFormatado);
        System.out.println("Deseja confirmar ? (sim/nao) ");
        String respostaEmail2 = scanner.nextLine().toLowerCase();
        if (respostaEmail2.equalsIgnoreCase("sim")) {

            //Utiliza o método para determinar o email do cliente
            cliente.setEmailCliente(emailFormatado);

            //Lista os produtos disponíveis para a compra
            System.out.println("Produtos disponíveis: ");
            estoque.listarEstoque();
            System.out.println("Digite o produto que deseja comprar: ");
            String nomeProduto = scanner.nextLine();

            Produto produtoEncontrado = estoque.buscarProdutoPorNome(nomeProduto);

            if (produtoEncontrado != null) {
                System.out.println("Você selecionou: " + produtoEncontrado.getNome());
                System.out.println("Preço: R$ " + produtoEncontrado.getPreco());
            } else {
                System.out.println("Produto não encontrado.");
            }

        } else if (respostaEmail2.equalsIgnoreCase("nao")) {
            System.out.println("Digite o email novamente:  (Sem o @gmail.com)");
            String respostaEmail3 = scanner.nextLine();
            String emailFormatado2 = String.format(respostaEmail3 + "@gmail.com");
            cliente.setEmailCliente(emailFormatado2);
        }
        else {
            throw new RuntimeException("Digite uma opção válida");
        }

        /*
        Pedido p = new Pedido();

        /*
        Aqui está ferindo o processo de ocultamento de informação colocando
        dados diretamente no atributo do objeto.

        p.clienteNome = "Maria";
        p.clienteEmail = "maria@email.com";
        p.clienteEndereco = "SC";


        p.adicionarItem("Notebook", 3000, 1);
        p.adicionarItem("Mouse", 100, 2);

        p.finalizar();

        // Novamente ferindo o processo de ocultamento de informação.
        BancoDeDados.salvarLog("Sistema finalizado");

        RelatorioService r = new RelatorioService();
        r.gerar(p);

        System.out.println("Frete: " + p.frete);
        System.out.println("services.Status: " + p.status);
        */
    }
}