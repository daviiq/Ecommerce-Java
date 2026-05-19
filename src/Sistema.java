import entities.Carrinho;
import entities.Cliente;
import entities.Estoque;
import entities.Produto;
import services.InterfaceUsuario;

import java.util.Scanner;

public class Sistema implements InterfaceUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Sistema sistema = new Sistema();

        //Entrando no sistema
        System.out.println("Bem vindo a Fast-By");
        System.out.println("Faça o seu cadastro !");
        System.out.println("Digite o seu nome: ");
        String respostaNome = scanner.nextLine();
        cliente.setNomeCliente(respostaNome);

        boolean emailConfirmado = false;

        //Confirmação de email do usuário
        while (!emailConfirmado) {
            System.out.println("Agora digite o seu email: (Sem o @gmail.com)");
            String respostaEmail = scanner.nextLine();

            String emailFormatado = respostaEmail + "@gmail.com";

            System.out.println("O email digitado é: " + emailFormatado);
            System.out.println("Deseja confirmar? (sim/nao)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                cliente.setEmailCliente(emailFormatado);
                emailConfirmado = true;
            } else if (!resposta.equalsIgnoreCase("nao")) {
                System.out.println("Opção inválida.");
            }
        }
        //IMPLEMENTAÇÃO DO MÉTODO SISTEMA, AQUI TA TODA A INTERAÇÃO DO USUÁRIO
        sistema.sistemaEcommerce();
    }
}