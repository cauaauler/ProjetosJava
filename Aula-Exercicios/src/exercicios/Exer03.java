package exercicios;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < 1; i++) {
			
		System.out.print("Primeiro n�mero: ");
		n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Segundo n�mero: ");
		n2 = Integer.parseInt(leitor.nextLine());
		
		if(n1 > n2) {
			System.out.println("O valor do primeiro n�mero precisa ser menor que o do segundo!");
			i--;
		}
		}
		int soma = 0;
		int somaTotal = 0;
		for (int i = n1; i < n2; i++) {
			soma = i+(i+1);
			somaTotal+=soma;
			System.out.println(soma);
			
			
		}
		System.out.println("Total: "+somaTotal);
	}

}
