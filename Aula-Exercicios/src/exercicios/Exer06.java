package exercicios;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("         CARD�PIO    ");
		System.out.println("Especifica��o 	      C�digo    Pre�o\n"
						+ "Cachorro Quente 	1   	R$ 10,50\n"
						+ "Bauru Simples   	2   	R$ 22,50\n"
						+ "Bauru com Ovo   	3   	R$ 25,50\n"
						+ "Hamb�rguer      	4   	R$ 18,00\n"
						+ "Cheeseburguer   	5   	R$ 18,00\n"
						+ "Refrigerante    	6   	R$ 6,00");
		
		double[] pre�os = {10.50 , 22.50 , 22.50 , 18.00 , 18.00 , 6.00};
		String[] nomes = {"Cachorro Quente","Bauru Simples","Bauru com Ovo","Hamb�rguer","Cheeseburguer","Refrigerante"};
		
		boolean x = true;
		
		while(x) {
		System.out.println("N�mero do pedido ou 0 para sair: ");
		int n = Integer.parseInt(leitor.nextLine());
		if (n == 0) {
			System.out.println("Obrigado pela compra!");
			break;
		}else {
			
		}
		
		}
		
	}
	

}
