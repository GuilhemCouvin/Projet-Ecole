/**
 * 
 */
package View.Delete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Guilhem
 *
 */
public class SupprimerPersonne extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel pan = new JPanel();
	
	private JButton submit = new JButton("Envoyer");
        private JTextField id= new JTextField("");

        private JLabel ident =   new JLabel("Id           ");

        private JButton retour = new JButton("Retour");
	/**
	 * 
	 */
	public SupprimerPersonne() {
		pan.setLayout(new GridLayout(2,8));
            this.setTitle("Option Supprimer");
            this.setSize(600,600);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);

            pan.setBackground(Color.WHITE);
            setContentPane(pan);
            JPanel top = new JPanel();
             // instancier le panneau
            getContentPane().add(top); // ajouter le panneau dans la fenêtre

            id.setPreferredSize(new Dimension(500, 40));

            top.add(ident);
            top.add(id);

            pan.add(top);

            submit.addActionListener(this);
            id.addActionListener(this);

            JPanel south = new JPanel();
            south.add(retour);
            retour.addActionListener(this);
            pan.add(south, BorderLayout.SOUTH); 
            south.add(submit);
            this.setContentPane(pan);
            this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
