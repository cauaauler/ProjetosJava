package exemplos;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 30, 40};
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		
			}
		String[] nomes = {"Cau�", "Fabricio", "Auler"};
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i]+" ");
		}
		
		double[] d = {20.5, 30, 42.7, 8.63};
		
		double soma = 0;
		for (int i = 0; i < d.length; i++) {
			soma += d[i];
			
			
		}
		System.out.println();
		System.out.println("A soma �: "+soma);
		System.out.println("M�dia: "+ (soma/d.length));
	}
}
