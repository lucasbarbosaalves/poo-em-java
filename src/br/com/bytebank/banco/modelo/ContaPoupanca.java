package br.com.bytebank.banco.modelo;

// Construtores não são herdados
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public String toString() {

		return "Conta Corrente, " + super.toString();
	}

}
