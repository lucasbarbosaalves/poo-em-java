package br.com.bytebank.banco.teste;

// import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22); // Polimorfismo - > Referencia mais generica
//		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		
		
	}
}
