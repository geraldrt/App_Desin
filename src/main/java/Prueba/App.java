package Prueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
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
		
		JLabel lblNewLabel = new JLabel("Buenas tio");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel.setBounds(35, 24, 168, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Vaya telar");
		rdbtnNewRadioButton.setBounds(35, 66, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Vaya telar");
		rdbtnNewRadioButton_1.setBounds(35, 96, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Vaya telar");
		rdbtnNewRadioButton_2.setBounds(35, 130, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(191, 45, 193, 150);
		frame.getContentPane().add(textPane);
	}
}
