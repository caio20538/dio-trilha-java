package edu.caio.petshop;

import java.util.Scanner;
	
public class Petshop {
	private final static Scanner scan = new Scanner(System.in);
	
	private final static PetMachine petMachine = new PetMachine();
	
	public static void main(String[] args) {
		//corrigir algms msg e logica
		var option = "-1";
		
		do {
			System.out.println("===Escolha uma das opções===");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4- Verificar a água da máquina");
			System.out.println("5- Verificar o shampoo da máquina");
			System.out.println("6- Verificar se tem pet no banho");
			System.out.println("7- Colocar pet na máquina");
			System.out.println("8- Retirar pet da máquina");
			System.out.println("9- Limpar máquina");
			System.out.println("0- Sair");
			
			option = scan.next();
			
			switch (option) {
			case "1" -> petMachine.takeAShower();
			case "2" -> setWater();
			case "3" -> setShampoo();
			case "4" -> verifyWatter();
			case "5" -> verifyShampoo();
			case "6" -> checkIfHasPetInMachine();
			case "7" -> setPetInPetMachine();
			case "8" -> petMachine.removePet();
			case "9" -> petMachine.wash();
			case "0" -> exit();
			default -> System.out.println("Opção Inválida");
			}
			
		} while (true);
	}

	//lógica 
	
	private static void exit() {
		System.out.println("Programa finalizado!");
		System.exit(0);
	}
	
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addShampoo();
	}
	

	private static void setWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addWater();
	}
	
	private static void verifyShampoo() {
		var amount = petMachine.getShampoo();
		System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo");
	}
	
	private static void verifyWatter() {
		var amount = petMachine.getWater();
		System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
	}
	
	private static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na máquina" : "Não há pet na máquina");
	}
	
	
	public static void setPetInPetMachine() {
		var hasPet = petMachine.hasPet();
		var name = "";
		
		if (hasPet) {
			System.out.println("Tem pet na máquina");
			return;
		}
		
		while(name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet");
			//isso permite que possa usar nome composto
			 scan.nextLine(); // Consumir a quebra de linha pendente antes de capturar a entrada
		     name = scan.nextLine();
		}
		var pet = new Pet(name);
		petMachine.setPet(pet);
		
		
	}
}
