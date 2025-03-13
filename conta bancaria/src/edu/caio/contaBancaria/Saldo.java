package edu.caio.contaBancaria;

public class Saldo {
	  private double saldo;
	    private double chequeEspecial;
	    private double chequeUsado;
	    private final double TAXA_CHEQUE_ESPECIAL = 0.2; // 20%

	    public Saldo(double saldoInicial) {
	        this.saldo = saldoInicial;
	        this.chequeEspecial = (saldoInicial <= 500) ? 50 : saldoInicial * 0.5;
	        this.chequeUsado = 0;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public double getChequeEspecial() {
	        return chequeEspecial;
	    }

	    public double getChequeUsado() {
	        return chequeUsado;
	    }

	    public boolean estaUsandoChequeEspecial() {
	        return chequeUsado > 0;
	    }

	    public void depositar(double valor) {
	        if (chequeUsado > 0) {
	            double taxa = chequeUsado * TAXA_CHEQUE_ESPECIAL;
	            double totalDevido = chequeUsado + taxa;

	            if (valor >= totalDevido) {
	                saldo = valor - totalDevido;
	                chequeUsado = 0;
	                System.out.println("Cheque especial quitado! Taxa cobrada: R$ " + taxa);
	            } else {
	                chequeUsado -= valor;
	                System.out.println("Parte do cheque especial foi paga! Ainda deve: R$ " + chequeUsado);
	                return;
	            }
	        } else {
	            saldo += valor;
	        }

	        System.out.println("Depósito realizado! Novo saldo: R$ " + saldo);
	    }

	    public boolean podeSacarOuPagar() {
	        if (chequeUsado > 0) {
	            System.out.println("Você está com dívida no cheque especial! Quita a dívida antes de sacar ou pagar boletos.");
	            return false;
	        }
	        return true;
	    }

	    public boolean sacar(double valor) {
	        if (!podeSacarOuPagar()) return false;

	        if (saldo >= valor) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	            return true;
	        } else if (saldo + chequeEspecial >= valor) {
	            chequeUsado = valor - saldo;
	            saldo = 0;
	            chequeEspecial = 0; // Bloqueia o cheque especial até que seja quitado
	            System.out.println("Saque de R$" + valor + " realizado usando cheque especial!");
	            System.out.println("Novo saldo: R$ 0,00 | Cheque especial usado: R$ " + chequeUsado);
	            return true;
	        } else {
	            System.out.println("Saldo insuficiente! Você não pode mais usar o cheque especial até quitá-lo.");
	            return false;
	        }
	    }
	

}
	
	
	

