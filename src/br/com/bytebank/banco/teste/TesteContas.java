package br.com.bytebank.banco.teste;  

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

//		FQN = Full Qualified Name - nome completo da clase composto pelo nome do pacote
		
		ContaEspecial ce = new ContaEspecial(123, 23232);
		ce.deposita(299);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		 ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo() + " CP: " + cp.getSaldo());
		
		
	}
}
