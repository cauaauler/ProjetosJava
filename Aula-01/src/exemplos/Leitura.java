package exemplos;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Ol� " + nome);
		
		System.out.print("Informe a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("A idade � " + idade);
	}

}