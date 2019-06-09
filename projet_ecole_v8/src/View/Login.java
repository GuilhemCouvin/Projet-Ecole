package View;

import java.awt.EventQueue;
import View.Delete.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import Controller.Connexion;
import Controller.Java_projet;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection conn=null;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 * @throws ClassNotFoundException 
	 */
	public Login() throws ClassNotFoundException {
		initialize();
		conn=Connexion.getInstance();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(99, 83, 88, 16);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(199, 78, 130, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(99, 126, 88, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Login butto
				try {
					String query="SELECT * FROM login WHERE username=? AND password=?";
					PreparedStatement pt = conn.prepareStatement(query);
					pt.setString(1,textField.getText());
					pt.setString(2,passwordField.getText());
					
					ResultSet rs = pt.executeQuery();
					int i=0;
					while(rs.next()) {
						i++;
						String id = rs.getString("username");
						String nom = rs.getString("password");
						frame.dispose();
						Java_projet inter= new Java_projet();
						inter.setVisible(true);
						JOptionPane.showMessageDialog(null,id+" "+nom);
					}
					if(i==1) {
						JOptionPane.showMessageDialog(null, "Bienvenue sur Ecole.net");
					}else {
						JOptionPane.showMessageDialog(null, "Username ou Password incorrect");
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnLogIn.setBounds(136, 179, 117, 29);
		frame.getContentPane().add(btnLogIn);
		
		JLabel lblNewLabel = new JLabel("Ecole.net");
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
		lblNewLabel.setBounds(136, 6, 193, 60);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 116, 130, 31);
		frame.getContentPane().add(passwordField);
	}
}
