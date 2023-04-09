package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
	
		String nome = "Alura"; // object literal - imutável
//		String outro = new String("Alura");
		
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		String OutroVazio = vazio.trim();
		System.out.println(OutroVazio.isEmpty());
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		
		int posicao = nome.indexOf("ur");
		System.out.println(posicao);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		
//		char c = 'A';
//		char d = 'a';
		
		
//		String outro = nome.replace(c, d);
		
		// nome.toLowerCase();
	
		System.out.println(nome);
//		System.out.println(outro);

	}

}
