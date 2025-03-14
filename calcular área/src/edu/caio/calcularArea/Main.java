package edu.caio.calcularArea;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int option;
		GeometricArea geometricArea = null;
		
		while (true) {
			System.out.println("Escolha a forma geométrica para calcular a área");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Circulo");
			System.out.println("4 - Sair do programa.");
			option = scan.nextInt();
			
			switch (option) {
				case 1 -> geometricArea =createSquare();
				case 2 -> geometricArea =createRectangle();
				case 3 -> geometricArea = createCircle();
				case 4 -> {
					System.out.println("Encerrando o programa...");
					return;
				}
				default -> System.err.println("Escolha inválida");
			}
			
			 if (option >= 1 && option <=3) System.out.println("O resultado do calculo é : " + geometricArea.getArea());
		}
	}
	
	private static GeometricArea createSquare() {
		System.out.println("Informe os tamanhos dos lados: ");
		var side = scan.nextDouble();
		return new Square(side);
	}
	
	private static GeometricArea createRectangle() {
		System.out.println("Informe a base: ");
		var h = scan.nextDouble();
		System.out.println("Informe a altura: ");
		var base = scan.nextDouble();
		return new Rectangle(h, base);
	}
	
	private static GeometricArea createCircle() {
		System.out.println("Informe o raio: ");
		var radius = scan.nextDouble();
		return new Circle(radius);
	}
}
