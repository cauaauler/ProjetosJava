package classes;

public class Testar {

	public static void main(String[] args) {
		
		Disciplina Matematica = new Disciplina();
		
		Disciplina Portugues = new Disciplina();
		Aluno Jorge = new Aluno("Jorge", "123");
		Aluno Renan = new Aluno("Renan", "321");
		Professor Roberto = new Professor();
		Professor Adalberto = new Professor();
		
		
		
		System.out.println(Matematica.alunos[0].nome);
		Saldo aluno01 = new Saldo();
		aluno01.aluno = Jorge;
		//aluno01.disciplina = Matematica;
		aluno01.saldo += 20;
		
		System.out.println(aluno01.saldo);
		
		
		
		
		
	}

}
