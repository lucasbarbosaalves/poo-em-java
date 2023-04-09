package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQntd();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(0); // pegando oelemento da primeira posicao
		
		System.out.println(ref.getNumero());
	
	
	}
}
