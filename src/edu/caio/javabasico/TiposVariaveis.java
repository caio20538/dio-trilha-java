package edu.caio.javabasico;

public class TiposVariaveis {
	public static void main (String[] args) {
		
		//variáveis, são armazenadas em um espaço da memória, associados a um nome, que pode armazenar
		//valores de um determminado tipo
		int idade; 
		int dataFabricacao = 2001;
		long cpf = 98944462107L;
		double salarioMinimo = 2500.00;
		float pi = 3.14f;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		//short numeroCurto2 = numeroNormal;
		
		//não é possivel uma variável short receber int, pois a memoria do int é maior
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to short
		
		//solução
		
		short numeroCurto2 = (short)numeroNormal; //saida: 1
		//faz o casting transformando em short
		
		//constantes, similar as variáveis, mas não podem ser modificadas depois de declaradas
		final float VALOR_DE_PI = 3.14f;
		
		
	}
}
