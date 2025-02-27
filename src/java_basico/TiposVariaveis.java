package java_basico;

public class TiposVariaveis {
	
	public static void main (String[] args) {
		int idade; 
		int dataFabricacao = 2001;
		long cpf = 98944462107L;
		double salarioMinimo = 2500.00;
		final float PI = 3.14f;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		//short numeroCurto2 = numeroNormal;
		
		//não é possivel uma variável short receber int, pois a memoria do int é maior
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from int to short
		
		//solução
		
		short numeroCurto2 = (short)numeroNormal; //saida: 1
		//faz o casting transformando em short
		
		
	}
}
