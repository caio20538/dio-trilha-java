package edu.caio.contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		String validar = "S";
		
		System.out.println("Bem Vindo ao contador! Por favor insira o primeiro numero sendo menor que o segundo.");
		System.out.println();
		
		do {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
		
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
				System.out.println("Deseja fazer uma nova contagem? (S/N)");
				validar = terminal.next().toUpperCase();
			
			}catch (ParametrosInvalidosException e) {
				System.out.println("O primeiro numero: " + parametroUm + " é maior que o segundo numero: " + parametroDois);
			}
			
			
		}while(validar.equals("S"));
		
		terminal.close(); 
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} 
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
		
	}
}
