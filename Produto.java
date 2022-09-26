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
		returni this.Id;
	}
	public void getPreco(double preco) {
		returni this.preco;
	}
	public void getNome(String nome) {
		returni this.nome;
	}
	public void getUnidade(String unidade) {
		returni this.unidade;
	}
	
	public String setId(String Id) {	
		this.Id = Id;
	}
	public double setPreco(double preco) {
		this.preco = preco;
	}
	public String setNome(String nome) {
		this.nome = nome;
	}
	public String setUnidade(String unidade) {
		this.unidade = unidade;
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

