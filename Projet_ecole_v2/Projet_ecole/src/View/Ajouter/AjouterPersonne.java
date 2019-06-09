/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Ajouter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Model.*;


public class AjouterPersonne extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField id= new JTextField("");
    private JTextField nom= new JTextField("");
    private JTextField prenom= new JTextField("");
    private JTextField type= new JTextField("");

    private JButton retour = new JButton("Retour");
    
    private JLabel ident =   new JLabel("Id           ");
    private JLabel surname = new JLabel("Nom          ");
    private JLabel name =    new JLabel("Prenom       ");
    private JLabel ty =      new JLabel("Type         ");


    
    public AjouterPersonne()
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

        nom.setPreferredSize(new Dimension(500, 40));
        prenom.setPreferredSize(new Dimension(500, 40));
        type.setPreferredSize(new Dimension(500, 40));
        id.setPreferredSize(new Dimension(500, 40));
        
        top.add(ident);
        top.add(id);
        top.add(surname);
        top.add(nom);
        top.add(name);
        top.add(prenom);
        top.add(ty);
        top.add(type);

        

        pan.add(top);
      
        submit.addActionListener(this);
        nom.addActionListener(this);
        prenom.addActionListener(this);
        type.addActionListener(this);
        id.addActionListener(this);
        
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
            Personne d = new Personne();
            try {
				d.ajouterPersonne(id, nom, prenom, type);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Add with success!");
        }
        
    }

	/**
	 * @return the ty
	 */
	public JLabel getTy() {
		return ty;
	}

	/**
	 * @param ty the ty to set
	 */
	public void setTy(JLabel ty) {
		this.ty = ty;
	}

	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}


