package br.com.bytebank.banco.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Dev");
		cliente.setCpf("23413131");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		

//		Utilizando ObjectInputStream e ObjectOutputStream para gravar no HD ou rede

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		

   }

}
