package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

import View.Ajouter.AjouterPersonne;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceGraphique {

	private JFrame frame;
	private static AjouterPersonne p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGraphique window = new InterfaceGraphique();
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
	public InterfaceGraphique() {
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
		
		JButton btnPersonne = new JButton("Personne");
		btnPersonne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//method ajouter
				p1 = new AjouterPersonne();
			}
		});
		btnPersonne.setBounds(6, 44, 122, 29);
		frame.getContentPane().add(btnPersonne);
	}
}
