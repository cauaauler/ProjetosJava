package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Primeiro n�mero: ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Segundo n�mero: ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		for (int i = (n1+1); i < n2; i++) {
			System.out.print((i)+" ");
			
		}
	}

}
