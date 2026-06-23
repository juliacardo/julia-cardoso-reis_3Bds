package aulacontabancaria;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciação do Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Instanciação da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        System.out.println("--- CADASTRO DE CONTA BANCÁRIA ---");
        
        // Leitura dos dados do usuário
        System.out.print("Digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        conta.cpf = scanner.nextLine();
        
        System.out.print("Digite o nome do banco: ");
        conta.nomeBanco = scanner.nextLine();
        
        System.out.print("Digite o número da agência: ");
        conta.agencia = scanner.nextInt();
        
        System.out.print("Digite o número da conta: ");
        conta.numeroConta = scanner.nextInt();

        // Exibição dos dados cadastrados e saldo inicial
        System.out.println("\n--- DADOS DA CONTA CADASTRADA ---");
        System.out.println("Cliente: " + conta.nomeCliente);
        System.out.println("CPF: " + conta.cpf);
        System.out.println("Banco: " + conta.nomeBanco);
        System.out.println("Agência: " + conta.agencia + " | Conta: " + conta.numeroConta);
        System.out.println("Saldo Inicial: R$ " + conta.saldo);

        // Operação de Saque
        System.out.print("\nDigite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        
        // Chama o método sacar da classe ContaBancaria
        conta.sacar(valorSaque);

        // Exibe o saldo final atualizado
        System.out.println("Saldo Atualizado: R$ " + conta.saldo);

        // Fechamento do scanner
        scanner.close();
    }
}