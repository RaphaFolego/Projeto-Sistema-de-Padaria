package SistemaPadaria;
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
	
	//getters and setters
	public void getPreco(double preco) {
		System.out.println("O valor do produto é -->" + preco);
		this.preco = preco;
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
		if(this.Id = Id) {
			System.out.println("O produto consultado é: " + nome +
					"\npreço: " + preco +
					"\nunidade: " + unidade);
		}
	}
	public void Registrar(String Id, String nome) {
		this.Id = Id;
		this.nome = nome;
	}
	

}
