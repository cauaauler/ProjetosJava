package exer02;

public class Exer02 {
	
	public static void main(String[] args) {
		
		Correntista c  = new Correntista();
		c.setNome("Rom�rio");
		c.setSaldo(2);
		
		c.credito(3);
		c.debito(4);
		System.out.println(c.getSaldo());
		
	}

}
