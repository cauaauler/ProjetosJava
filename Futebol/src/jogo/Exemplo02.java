package jogo;

import jogo.misc.Bola;
import jogo.misc.Quadra;
import jogo.pessoas.Jogador;
import jogo.pessoas.Juiz;
import jogo.pessoas.Treinador;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		Treinador t1 = new Treinador("Renato");
		
		Jogador j11 = new Jogador("Parede");
		Jogador j12 = new Jogador("Porta");
		Jogador j13 = new Jogador("Romaldo");
		Jogador j14 = new Jogador("Nilson");
		Jogador j15 = new Jogador("Maom�");
		
		Equipe mandante = new Equipe("Napoli", t1, j11, j12, j13, j14, j15);
		
		
		Treinador t2 = new Treinador("golias");
		
		Jogador j21 = new Jogador("lampada");
		Jogador j22 = new Jogador("sovaco");
		Jogador j23 = new Jogador("deide");
		Jogador j24 = new Jogador("costa");
		Jogador j25 = new Jogador("gordo");
		
		Equipe visitante = new Equipe("Milan", t2, j21, j22, j23, j24, j25);

		Bola b = new Bola("Acer");
		Quadra q = new Quadra(40, 20);
		Juiz j = new Juiz("Julio C�sar");
	
		Futebol f = new Futebol(j, q, b, mandante, visitante);
		
		System.out.println(f.getMandante().getTreinador().getNome());
		System.out.println(f.getQuadra().getLargura());
		System.out.println(f.getVisitante().getGoleiro().getNome());
	}

}
