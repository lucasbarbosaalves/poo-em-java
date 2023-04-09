package br.com.bytebank.banco.teste;  

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
//		FQN = Full Qualified Name - nome completo da clase compostopelo nome do pacote
		ContaCorrente conta = new ContaCorrente(123, 3232);
		
		conta.deposita(200.0);
		try {
		conta.saca(210);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}
}
