package exemplos;

import java.util.ArrayList;

public class TesteArrayList02 {

	public static void main(String[] args) {

		ArrayList<Pessoa> turma = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Maria",20);
		turma.add(p1);
		
		turma.add(new Pessoa("Joaquim",23));
		
		for (int i = 0; i < turma.size(); i++) {
			System.out.println("------------");
			System.out.println(turma.get(i).getNome());
			System.out.println(turma.get(i).getIdade());
		}
	}

}
