package exer02;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println("Nome da cidade: ");
			String nome = leitor.nextLine();
			
			System.out.println("Quantidade de habitantes: ");
			int habitantes = Integer.parseInt(leitor.nextLine());
			
			Cidade c = new Cidade(nome, habitantes);
		}catch(Exception e) {
			
		}
	
	}
	
	
	

}
