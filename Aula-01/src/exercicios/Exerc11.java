package exercicios;

import java.util.Scanner;

public class Exerc11 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("N�mero: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		int antecessor = n-1;
		int sucessor = n+1;
		
		System.out.print("O antecessor do n�mero �: "+antecessor);
		System.out.print("O sucessor do n�mero �: "+sucessor);
		
	
}
}