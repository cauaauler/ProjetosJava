package exemplo01;

public class Pessoa {
	private String nome;
	private int idade;
	private Pet pet;
	
	//NAO COLOCAR PRINT DENTRO DO GET E SET
	
	//set inserir um valor em um atributo, void, par�metro do tipo/classe do atributo
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	//get ler o valor de um atributo, possui retorno tipo/classe do atributo, n�o possui par�metro
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
		}
		
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Pet getPet() {
		return this.pet;
	}
	

}
