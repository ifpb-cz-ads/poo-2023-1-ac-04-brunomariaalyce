package CarvalhoTeixeira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeUsuarioConta;
        int numeroConta;
        double saldoConta;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de usuário: ");
        nomeUsuarioConta = scanner.nextLine();
        System.out.println("Informe o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Informe o saldo da conta se houver, caso contrario digite zero: ");
        saldoConta = scanner.nextDouble();

        Conta conta = new Conta(nomeUsuarioConta, numeroConta, saldoConta);

        int opcao = 0;
        while (opcao != 3) {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Informe quanto desejar depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Valor a ser depositado: R$ " + valorDeposito);
                    System.out.println("\n\nDeposito realizado com sucesso! Valor atual: R$ " + conta.getSaldo());
                    break;
                }
                case 2: {
                    System.out.println("Informe quantia que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    System.out.println("Valor a ser sacado: R$ " + valorSaque);

                    if (conta.sacar(valorSaque)) {
                        System.out.println("\nSaque efetuado com sucesso!!\n");
                    } else {
                        System.out.println("Saque não efetuado por falta de saldo.");
                    }
                    System.out.println("Saldo atual da conta: R$ " + conta.getSaldo());
                    break;
                }
                case 3: {
                    System.out.println("Encerrando...");
                }
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("---- MENU ----");
        System.out.println("OPÇOES DA CONTA, ESCOLHA UMA: ");
        System.out.println("(1) - DEPOSITAR");
        System.out.println("(2) - SACAR");
        System.out.println("(3) - SAIR");
        System.out.println("SELECIONAR: ");
    }
}