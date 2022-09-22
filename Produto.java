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
	public String setId() {
		return this.Id;
	}
	public String setNome() {
		return this.nome;
	}
	public double setPreco() {
		return this.preco;
	}
	
	public void getPreco() {
		this.preco = preco;
	}
	public void getNome() {
		this.nome = nome;
	}
	public void getId() {
		this.Id = Id;
	}
	
	//methods
	public void Alterar() {
		if(confirmar = true) {
			System.out.println("Informe o número de Identificação do produto: ");
			this.Id = Id;
		}
	}
	public void Excluir(boolean confirmar) {
		if(confirmar = true) {
			System.out.println("O produto foi excluido");
		}else{
			System.out.println("Para cancelar a operação digite 1");		
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
