package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a estrutura de uma conta
 * 
 * @author Lucas Alves
 *
 */

// Classe abstrata - > não pode ser instanciada
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

// 	Atributos da classe que foram instanciados - > pertencem aos objetos
	protected double saldo; // Somente as classes filhas possuem acesso a esse atributo
	private int agencia; // modificando o acesso do atributo apenas a essa classe
	private int numero;
	private transient Cliente titular; // composição
	private static int total; // static - > atributo pertence a classe

	/**
	 * Construtor - Solicitando agencia e numero da conta pelos parâmetros
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("Criando uma conta: " + this.numero);
	}

// 	Comportamentos - Metodos da classe
	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {

		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo:" + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	/* Metodos GETTER e SETTERS */
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (novoNumero <= 0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

//	Metodo pertence a classe(static)
	public static int getTotal() {
		return total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta c = (Conta) ref;
		
		if(this.agencia != c.agencia) {
			return false;
		}
		if(this.numero != c.numero) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}
	
//	Comparando saldos (ordem natural) - implementação da interface Comparable
	@Override
	public int compareTo(Conta outra) {
	        return Double.compare(this.saldo, outra.saldo);
	}

}
