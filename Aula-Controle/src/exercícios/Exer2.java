package exerc�cios;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		for (int x=2;x<12 && x!=n;) {
		
			if(n%x == 0) {
				System.out.println("O n�mero n�o � primo");
				break;	
			}else {
				System.out.println("O n�mero � primo");
				break;
			}
		}
		
		
	}

}
