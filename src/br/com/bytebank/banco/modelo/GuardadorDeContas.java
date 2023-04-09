package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Object[] referencias; // guardando qualquer tipo de referência (Conta, cliente
	private int posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQntd() {
		return this.posicaoLivre;
	}

	public Conta getReferencias(int pos) {
		return (Conta) this.referencias[pos];
	}
}
