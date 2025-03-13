package edu.caio.contaBancaria;

public class Transacao {
	
	private Saldo conta;

    public Transacao(Saldo conta) {
        this.conta = conta;
    }

    public void pagarBoleto(double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Boleto de R$" + valor + " pago com sucesso!");
        } else {
            System.out.println("Não foi possível pagar o boleto!");
        }
    }

}
