package exemplos;

import java.util.Random;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		//System.out.println(r.nextInt(2));
		int lancamento = r.nextInt(2);
		
		float um = 0;
		float zero = 0;
		for(int i = 0;i<100000;i++) {
			lancamento = r.nextInt(2);
			if(lancamento == 0) {
				zero++;
			}else {
				um++;
			}
			
		}
		System.out.println("Zero: "+(zero/1000)+"%");
		System.out.println("Um: "+ (um/1000)+"%");
		
	}

}
