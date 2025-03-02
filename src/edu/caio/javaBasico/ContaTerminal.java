package edu.caio.javaBasico;

import java.util.Scanner;

/**
 * Exercício para praticar a base do java, usando a classe Scanner
 * 
 */
public class ContaTerminal {
	
	public static void main(String[] args) {
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		//TODO:Conhecer e importar classe Scanner
		Scanner scan = new Scanner(System.in);
		//Exibir as mensagens para nosso usuário
		System.out.println("Seja bem vindo ao banco, siga as instruções para que possa cadastrar um novo cliente");
		System.out.println();
		
		//Obter pela scanner os valores digitados pelo terminal
		System.out.println("por favor insira o nome do cliente");
		nomeCliente = scan.next();
		
		System.out.println("por favor insira o nome da agecia");
		agencia = scan.next();
		
		System.out.println("por favor insira o numero da conta");
		numero = scan.nextInt();
		
		System.out.println("por favor insira o saldo da conta");
		saldo = scan.nextDouble();
		
		//Exibir a mensagem da conta criada
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +" e seu saldo " + saldo + " já está disponível para saque.");
	}
}
