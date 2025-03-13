package edu.caio.contaBancaria;

import java.util.Scanner;

public class ContaBancaria {
	private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco! Digite o valor do depósito inicial:");
        double depositoInicial = scan.nextDouble();

        Saldo conta = new Saldo(depositoInicial);
        Transacao transacao = new Transacao(conta);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar Uso do Cheque Especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Saldo atual: R$" + conta.getSaldo());
                case 2 -> System.out.println("Cheque especial disponível: R$" + conta.getChequeEspecial());
                case 3 -> depositar(conta);
                case 4 -> sacar(conta);
                case 5 -> pagarBoleto(transacao);
                case 6 -> verificarCheque(conta);
                case 0 -> System.out.println("Obrigado por usar o banco!");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scan.close();
    }

	private static void verificarCheque(Saldo conta) {
		if (conta.estaUsandoChequeEspecial()) {
		    System.out.println("Você está usando R$" + conta.getChequeUsado() + " do cheque especial.");
		} else {
		    System.out.println("Você não está usando cheque especial.");
		}
	}

	private static void pagarBoleto(Transacao transacao) {
		System.out.print("Digite o valor do boleto: ");
		double valor = scan.nextDouble();
		transacao.pagarBoleto(valor);
	}

	private static void sacar(Saldo conta) {
		System.out.print("Digite o valor do saque: ");
		double valor = scan.nextDouble();
		conta.sacar(valor);
	}

	private static void depositar(Saldo conta) {
		System.out.print("Digite o valor do depósito: ");
		double valor = scan.nextDouble();
		conta.depositar(valor);
	}
}
