package exemplos;

import javax.swing.JOptionPane;

public class Exemplo04 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "ola pessoal");
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		if((nome == null) || (nome.length() == 0)) {
			nome = "an�nimo";
		}
		if(nome.equals("admin")) {
			nome = "Administrador";
		}
		
		JOptionPane.showMessageDialog(null, "Ol� " + nome);
	}
	
}
