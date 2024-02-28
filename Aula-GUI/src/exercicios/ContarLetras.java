package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class ContarLetras {

	private JFrame frmContarLetras;
	private JTextField textFieldCaracteres;
	private JTextField textFieldFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContarLetras window = new ContarLetras();
					window.frmContarLetras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContarLetras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContarLetras = new JFrame();
		frmContarLetras.setTitle("Contar Letras");
		frmContarLetras.setBounds(100, 100, 450, 300);
		frmContarLetras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContarLetras.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Frase");
		lblNewLabel.setBounds(32, 43, 46, 14);
		frmContarLetras.getContentPane().add(lblNewLabel);
		
		textFieldFrase = new JTextField();
		textFieldFrase.setBounds(32, 68, 231, 20);
		frmContarLetras.getContentPane().add(textFieldFrase);
		textFieldFrase.setColumns(10);
		
		textFieldCaracteres = new JTextField();
		textFieldCaracteres.setBounds(32, 169, 264, 20);
		frmContarLetras.getContentPane().add(textFieldCaracteres);
		textFieldCaracteres.setColumns(10);
		
		JButton btnAnalisar = new JButton("ANALISAR");
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String frase = textFieldFrase.getText();
			String newFrase = frase.replace(" ", "");
			String[] palavras = frase.split(" ");
			
			textFieldCaracteres.setText(palavras.length + " palavra(s) e " + newFrase.length() + " caracter(es)"  );

			}
		});
		btnAnalisar.setBounds(29, 117, 111, 23);
		frmContarLetras.getContentPane().add(btnAnalisar);
	}
}
