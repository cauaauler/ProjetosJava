package exerc�cios;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("N�meros a serem informados: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		int maior = 0;
		int menor = 1000000;
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+"� n�mero: ");
			int n1 = Integer.parseInt(leitor.nextLine());
			if(n1> maior && n1<menor) {
				maior = n1;
				menor = n1;				
			}
			else if(n1> maior ) {
				maior = n1;
			}
			else{
				menor = n1;
				
			}
		}
		System.out.println("maior n�mero: "+maior);
		System.out.println("menor n�mero: "+menor);
	}

}
