package exercicios;

import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Valor do sal�rio m�nimo: ");
		double salario_min = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Valor do seu sal�rio: ");
		double salario = Double.parseDouble(leitor.nextLine());
		
		double conta = salario/salario_min;
		
		System.out.print("Voc� recebe "+conta+" sal�rios m�nimos");
	}

}