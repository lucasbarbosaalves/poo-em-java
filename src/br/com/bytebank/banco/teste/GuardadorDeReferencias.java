package br.com.bytebank.banco.teste;

public class GuardadorDeReferencias {

	private Object[] referencias; // guardando qualquer tipo de referência (Conta, cliente
	private int posicaoLivre;

	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQntd() {
		return this.posicaoLivre;
	}

	public Object getReferencias(int pos) {
		return this.referencias[pos];
	}
}
