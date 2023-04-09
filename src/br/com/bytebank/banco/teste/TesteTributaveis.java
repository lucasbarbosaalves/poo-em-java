package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		
//		FQN = Full Qualified Name - nome completo da clase compostopelo nome do pacote
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto imposto = new CalculadorImposto();
		imposto.registra(cc);
		imposto.registra(seguro);
		
		System.out.println(imposto.getTotalImposto());
		
		
	}

}
