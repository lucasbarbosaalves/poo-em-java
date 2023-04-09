package br.com.bytebank.banco.modelo;

// Construtores não são herdados
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // construtor da classe mãe(Conta)
	}

// 	Reescrita de metódo		
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorAScar = valor + 0.2;
		super.saca(valorAScar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "Conta Corrente, " + super.toString();
	}

}
