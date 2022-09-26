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
	public String getId(String Id) {
		return this.Id;
	}
	public double getPreco(double preco) {
		return this.preco;
	}
	public String getNome(String nome) {
		return this.nome;
	}
	public String getUnidade(String unidade) {
		return this.unidade;
	}
	
	public void setId(String Id) {	
		this.Id = Id;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setUnidade(String unidade) {
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

}

