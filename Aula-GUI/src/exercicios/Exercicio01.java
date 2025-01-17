package exercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio01 {

	private JFrame frame;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textSoma;
	private JTextField textSubtracao;
	private JTextField textMultiplicacao;
	private JTextField textDivisao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio01 window = new Exercicio01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textN1 = new JTextField();
		textN1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textN1.setBounds(91, 36, 86, 20);
		frame.getContentPane().add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textN2.setBounds(247, 36, 86, 20);
		frame.getContentPane().add(textN2);
		textN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(91, 11, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(247, 11, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double Soma = Double.parseDouble(textN1.getText()) + Double.parseDouble(textN2.getText());
			
			}
		});
		btnNewButton.setBounds(167, 67, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Soma");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(41, 136, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Subtra\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(41, 161, 86, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Multiplica\u00E7\u00E3o");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(41, 186, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Divis\u00E3o");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(41, 211, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textSoma = new JTextField();
		textSoma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textSoma.setBounds(132, 135, 86, 20);
		frame.getContentPane().add(textSoma);
		textSoma.setColumns(10);
		
		textSubtracao = new JTextField();
		textSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textSubtracao.setBounds(132, 160, 86, 20);
		frame.getContentPane().add(textSubtracao);
		textSubtracao.setColumns(10);
		
		textMultiplicacao = new JTextField();
		textMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textMultiplicacao.setBounds(132, 185, 86, 20);
		frame.getContentPane().add(textMultiplicacao);
		textMultiplicacao.setColumns(10);
		
		textDivisao = new JTextField();
		textDivisao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDivisao.setBounds(132, 210, 86, 20);
		frame.getContentPane().add(textDivisao);
		textDivisao.setColumns(10);
	}

}
