package exemplos;

import java.util.Arrays;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
        String[] palavras = {"hoje", "quando", "abc", "bba", "aab", "acb", "aaaa"};
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.printf(" %s ", palavras[i]);
		}
		Arrays.sort(palavras);
		System.out.println();
		for (int i = 0; i < palavras.length; i++) {
			System.out.printf(" %s ", palavras[i]);
		}
	}

}
