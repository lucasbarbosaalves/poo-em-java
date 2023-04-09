package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

//		Declarando array de forma clássica com "new"
		Object[] referencias = new Object[5]; // Inicializando array e determinando o tamanho
		
		ContaCorrente cc1 = new ContaCorrente(22, 232);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(232, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		System.out.println(referencias[1].getNumero()); - > não compila
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; // type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero()); 
		
		
	}
}
