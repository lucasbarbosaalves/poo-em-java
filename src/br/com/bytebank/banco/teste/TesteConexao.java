package br.com.bytebank.banco.teste;  

import br.com.bytebank.banco.modelo.*;

public class TesteConexao {
	public static void main(String[] args) {
//		FQN = Full Qualified Name - nome completo da clase compostopelo nome do pacote
		// Simplicificado - inicializando direto no try - try-with-resources
		try(Conexao con = new Conexao()) {
			con.leDados();
		} catch(Exception ex) {
			System.out.println("Deu erro na conexão");
		}
		
//		-----------------------------------------------------------------------------
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (Exception ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			con.close();
//		}
	}

 }
