package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frmCalculadora;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldMult;
	private JTextField textFieldSub;
	private JTextField textFieldDiv;
	private JTextField textFieldSoma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 334, 475);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Soma");
		lblNewLabel.setBounds(45, 231, 46, 14);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1.setBounds(195, 118, 60, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o");
		lblNewLabel_2.setBounds(195, 287, 46, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Multiplica\u00E7\u00E3o");
		lblNewLabel_3.setBounds(45, 287, 60, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Subtra\u00E7\u00E3o");
		lblNewLabel_4.setBounds(195, 231, 60, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00FAmero 1");
		lblNewLabel_5.setBounds(45, 118, 60, 14);
		frmCalculadora.getContentPane().add(lblNewLabel_5);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textFieldN1.getText());
				int n2 = Integer.parseInt(textFieldN2.getText());
				int soma = n1 + n2;
				int sub = n1 - n2;
				int mult = n1 * n2;
				int div = n1 / n2;
				textFieldSoma.setText(""+soma);
				textFieldSub.setText(""+sub);
				textFieldMult.setText(""+mult);
				textFieldDiv.setText(""+div);
			}
		});
		btnCalc.setBounds(108, 197, 89, 23);
		frmCalculadora.getContentPane().add(btnCalc);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBounds(45, 143, 86, 20);
		frmCalculadora.getContentPane().add(textFieldN1);
		textFieldN1.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.setBounds(195, 143, 86, 20);
		frmCalculadora.getContentPane().add(textFieldN2);
		textFieldN2.setColumns(10);
		
		textFieldMult = new JTextField();
		textFieldMult.setEditable(false);
		textFieldMult.setBounds(45, 310, 86, 20);
		frmCalculadora.getContentPane().add(textFieldMult);
		textFieldMult.setColumns(10);
		
		textFieldSub = new JTextField();
		textFieldSub.setEditable(false);
		textFieldSub.setBounds(195, 256, 86, 20);
		frmCalculadora.getContentPane().add(textFieldSub);
		textFieldSub.setColumns(10);
		
		textFieldSoma = new JTextField();
		textFieldSoma.setEditable(false);
		textFieldSoma.setBounds(45, 256, 86, 20);
		frmCalculadora.getContentPane().add(textFieldSoma);
		textFieldSoma.setColumns(10);
		
		textFieldDiv = new JTextField();
		textFieldDiv.setEditable(false);
		textFieldDiv.setBounds(195, 310, 86, 20);
		frmCalculadora.getContentPane().add(textFieldDiv);
		textFieldDiv.setColumns(10);
	}
}
