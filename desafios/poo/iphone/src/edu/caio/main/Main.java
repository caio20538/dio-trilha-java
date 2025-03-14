package edu.caio.main;

import java.util.Scanner;

import edu.caio.iphone.Iphone;
import edu.caio.iphone.MusicPlayer;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Iphone iphone = new Iphone();
	
	public static void main(String[] args) {
		int acao;
		do {
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Abrir o aplicativo de música");
			System.out.println("2 - Abrir o aplicativo de telefone");
			System.out.println("3 - Abrir o aplicativo Web");
			System.out.println("4 - Desligar o celular");
			
			acao = scanner.nextInt();
			
			switch (acao) {
				case 1 -> playerMusic();
				case 2 -> userPhone();
				case 3 -> Browser();
				case 4 -> System.out.println("Desligando o telefone");
				default -> System.err.println("Opção inválida");
			}
		} while (acao != 4);
		
	}
		
		static void playerMusic() {
			int acao;
			String music = null;
			do {
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Tocar música");
				System.out.println("2 - Pausar música");
				System.out.println("3 - Escolher música");
				System.out.println("0 - Sair do aplicativo");
				acao = scanner.nextInt();
				if (acao == 3) {
			        System.out.println("Insíra o nome da música");
			        music = scanner.next();
			    } 
				
				iphone.playerMusic(acao, music);
				
			} while (acao != 0);
		}
		
		static void userPhone() {
			int acao;
			String ligar = null;
			do {
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Ligar");
				System.out.println("2 - Atender");
				System.out.println("3 - Iniciar correio de voz");
				System.out.println("0 - Sair");
				acao = scanner.nextInt();
				if (acao == 1) {
			        System.out.println("Insíra o número de telefone");
			        ligar = scanner.next();
			    } 
				iphone.userPhone(acao, ligar);
				
			} while (acao != 0);
		}
		
		static void Browser() {
			int acao;
			String pagina = null;
			do {
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Pesquisar página");
				System.out.println("2 - Abrir nova aba");
				System.out.println("3 - Atualizar página");
				System.out.println("0 - Sair");
				acao = scanner.nextInt();
				if (acao == 1) {
			        System.out.println("Insíra URL da página");
			        pagina = scanner.next();
			    } 
				iphone.Browser(acao, pagina);
				
			} while (acao != 0);
		}
}
