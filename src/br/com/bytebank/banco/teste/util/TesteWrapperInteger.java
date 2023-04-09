package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		
		// Autoboxing - > Conversão automática do tipo primitivo em object
		int idade = 29; // Integer
		System.out.println(idade);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
		
		Integer  idadeRef = Integer.valueOf(29); // Método para criar object a partir do primitivo
		int valor = idadeRef.intValue();
		System.out.println(valor);
		
		List <Integer> numeros = new ArrayList<>();
		numeros.add(idadeRef);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
