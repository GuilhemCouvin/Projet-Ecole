/**
 * 
 */
package View.Ajouter;

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

import Model.Bulletin;

/**
 * @author Guilhem
 *
 */
public class AjouterBulletin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;



	private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField id= new JTextField("");
    private JTextField id_trimestre= new JTextField("");
    private JTextField id_inscription= new JTextField("");
    private JTextField appreciation= new JTextField("");

    private JButton retour = new JButton("Retour");
    
    private JLabel ident =  new JLabel("Id               ");
    private JLabel trim =   new JLabel("Trimestre(ID)    ");
    private JLabel inscri = new JLabel("Inscription(ID)  ");
    private JLabel appre =  new JLabel("Appreciation     ");

	
	/**
	 * Constructor
	 */
    
    public AjouterBulletin()
    {
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

        id.setPreferredSize(new Dimension(500, 40));
        id_trimestre.setPreferredSize(new Dimension(500, 40));
        id_inscription.setPreferredSize(new Dimension(500, 40));
        appreciation.setPreferredSize(new Dimension(500, 40));
        
        top.add(ident);
        top.add(id);
        top.add(trim);
        top.add(id_trimestre);
        top.add(inscri);
        top.add(id_inscription);
        top.add(appre);
        top.add(appreciation);
        

        pan.add(top);
      
        submit.addActionListener(this);
        id.addActionListener(this);
        id_trimestre.addActionListener(this);
        id_inscription.addActionListener(this);
        appreciation.addActionListener(this);
        
        JPanel south = new JPanel();
        south.add(retour);
        retour.addActionListener(this);
        pan.add(south, BorderLayout.SOUTH); 
        south.add(submit);
        this.setContentPane(pan);
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
        if (source == submit) 
        {   
            this.dispose();
            Bulletin a = new Bulletin();
            try {
				a.ajouterBulletin(id,id_trimestre,id_inscription,appreciation);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Add with success!");
        }
        
    }

}
