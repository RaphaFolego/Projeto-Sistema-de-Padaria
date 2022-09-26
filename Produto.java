package SistemaPadaria;

import java.util.Random;

public class Produto {
	
	/* 
	 * Attributes, constructors, getters and setters, other methods
	 */
	
	//attributes
	private String Id; 
	private double preco;
	private String unidade;
	private String nome;
	private boolean confirmar = false;
	
	//constructors
	Produto() {
		this.unidade = "Kg";
	}
	
	//getters and setters
	public void getId(String Id) {
		this.Id = Id ;
	}
	public void getPreco(double preco) {
		this.preco = preco;
	}
	public void getNome(String nome) {
		this.nome = nome;
	}
	public void getUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	public String setId(String Id) {
		
		return this.Id;
	}
	public double setPreco(double preco) {
		return this.preco;
	}
	public String setNome(String nome) {
		return this.nome;
	}
	public String setUnidade(String unidade) {
		return this.unidade;
	}

	//methods
	public void Alterar() {
		
	}
	public void Excluir(boolean confirmar) {
		if(confirmar = true) {
			System.out.println("O produto foi excluido");
			
		}
	}
	public void Consultar(String Id) {
		if() {
			System.out.println(
				"O produto consultado é: " + nome +
				"\npreço: " + preco +
				"\nunidade: " + unidade);
		}
	}
	public void Registrar(String Id, String nome) {
		this.Id = Id;
		this.nome = nome;
		if(confirmar = true) {
			System.out.println("O produto foi registrado");
		}else {
			System.out.println("Tente novamente");
		}
	}
	public static void log(Object objeto) {
		System.out.println(String.valueOf(objeto));
	}

}

