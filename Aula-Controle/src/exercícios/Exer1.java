package exerc�cios;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("N�mero de turmas: ");
		int turmas = Integer.parseInt(leitor.nextLine());
		
		int total = 0;
		int x = 0;
		while(x < turmas) {
			
			System.out.print("Quantidade de alunos da turma "+(x+1)+": ");
			int alunos = Integer.parseInt(leitor.nextLine());
				if (alunos > 32) {
					System.out.println("O n�mero m�ximo de alunos � 32");
				}else {
					x++;
					total = alunos + total;
				}			
		}
		int media = total/turmas;
		System.out.println("A m�dia de alunos por turma �: "+media);
	}
}
