package exercícios;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva uma quantidade de segundos: ");
		int segundos = Integer.parseInt(leitor.nextLine());
		
		int horas = 0;
		int minutos = 0;
		int x = segundos;
		while(x>0) {
			if (segundos>=3600) {
				horas = segundos/3600;
				segundos = segundos-horas*3600;
				x = segundos-horas*3600;
			}
			if(segundos>=60) {
				minutos = segundos/60;
				segundos = segundos-minutos*60;	
				x = segundos-minutos*60;	
			}
			System.out.println(horas+" hora(s)");
			System.out.println(minutos+" minuto(s)");
			System.out.println(segundos+" segundo(s)");
			
		}
		
	}

}
