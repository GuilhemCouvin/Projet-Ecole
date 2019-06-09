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

/**
 *
 * @author alex_
 */
public class AjouterTrimestre extends JFrame implements ActionListener {
    
	private static final long serialVersionUID = 1L;



	private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
   
    
    private JTextField id= new JTextField("");
    private JTextField numero= new JTextField("");
    private JTextField debut= new JTextField("");
    private JTextField fin= new JTextField("");
    private JTextField annee= new JTextField("");

    private JButton retour = new JButton("Retour");
    
    private JLabel ident =   new JLabel("Id           ");
    private JLabel num = new JLabel("Numero        ");
    private JLabel deb =    new JLabel("Debut       ");
    private JLabel fi =      new JLabel("Fin         ");
    private JLabel ann =      new JLabel("Annee         ");


    
    public AjouterTrimestre()
    {
        pan.setLayout(new GridLayout(2,8));
        this.setTitle("Option Ajouter");
        this.setSize(600,800);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
           
        
        pan.setBackground(Color.WHITE);
        setContentPane(pan);
        JPanel top = new JPanel();
         // instancier le panneau
        getContentPane().add(top); // ajouter le panneau dans la fenêtre 

        numero.setPreferredSize(new Dimension(500, 40));
        debut.setPreferredSize(new Dimension(500, 40));
        fin.setPreferredSize(new Dimension(500, 40));
        annee.setPreferredSize(new Dimension(500, 40));
        id.setPreferredSize(new Dimension(500, 40));
        
        top.add(ident);
        top.add(id);
        top.add(num);
        top.add(numero);
        top.add(deb);
        top.add(debut);
        top.add(fi);
        top.add(fin);
        top.add(ann);
        top.add(annee);

        

        pan.add(top);
      
        submit.addActionListener(this);
        numero.addActionListener(this);
        debut.addActionListener(this);
        fin.addActionListener(this);
        annee.addActionListener(this);
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
            Trimestre d = new Trimestre();
            try {
				d.ajouterTrimestre(id, numero, debut, fin, annee);
				System.out.println(id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Add with success!");
        }
         if(source==retour)
       {    
           this.dispose();
           Ajouter a = new Ajouter();
       }
        
    }
    
    
}
