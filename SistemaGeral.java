package SistemaPadaria;

import java.util.Scanner;

public class SistemaGeral {

	public static void main(String[] args) {
		Produto paozinho = new Produto();
		Scanner scanner = new Scanner(System.in);
		
		paozinho.Registrar();
		paozinho.getPreco();
		
		
		scanner.close();
	}
}
