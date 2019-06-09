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
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import DAO.PersonneDAO;
import Model.Personne;

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
    private JTextField id1= new JTextField("");
    
    private JLabel ident =   new JLabel("Id           ");
    
    private JLabel id2 =   new JLabel("Id: ");
    private JLabel name =   new JLabel("Nom: ");
    private JLabel firstname =   new JLabel("Prenom: ");
    private JLabel type =   new JLabel("Type: ");
    //private JLabel row = new JLabel();
    
    private JButton retour = new JButton("Retour");
    PersonneDAO p = new PersonneDAO();
    
    JTextArea area = new JTextArea();
    
	/**
	 * @throws SQLException 
	 * 
	 */
	public SupprimerPersonne() throws SQLException {
		pan.setLayout(new GridLayout(2,8));
        this.setTitle("Option Ajouter");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        pan.setBackground(Color.WHITE);
        setContentPane(pan);
        JPanel top = new JPanel();
         // instancier le panneau
        getContentPane().add(top); // ajouter le panneau dans la fenêtre
        
        id1.setPreferredSize(new Dimension(500, 40));
        
        top.add(ident);
        top.add(id1);
        
        //JLabel id = new JLabel(p.display().getString("id"));
    	//top.add(id2);
    	//top.add(id);

        
        for(int i = 0;i<p.display().size();i++) {
        	System.out.println(p.display().get(i));
        }
        
        /**
        while(p.display().next()) {
        	JLabel id = new JLabel(p.display().getString("id"));
        	top.add(id2);
        	top.add(id);
        	JLabel nom = new JLabel(p.display().getString("nom"));
			top.add(name);
			top.add(nom);
			JLabel prenom = new JLabel(p.display().getString("prenom"));
			top.add(firstname);
			top.add(prenom);
			JLabel type = new JLabel(p.display().getString("type"));
			top.add(this.type);
			top.add(type);
			System.out.println("ID: "+id+"  nom:"+nom+"  prenom:"+prenom+"  type:"+type);
		}**/

        
        
        pan.add(top);
        
        submit.addActionListener(this);
        id1.addActionListener(this);
        
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
		Object source = e.getSource();
        if (source == submit) 
        {   
            this.dispose();
            Personne d = new Personne();
            try {
				d.supprimerPersonne(id1);
				System.out.println(id1+"Deleted with success!");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
		
	}

}
