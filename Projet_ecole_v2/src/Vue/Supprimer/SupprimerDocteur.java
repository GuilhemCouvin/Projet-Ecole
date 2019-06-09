/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Supprimer;

import java.awt.BorderLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Modele.*;

import Vue.InterfaceGraphique;

/**
 *
 * @author Andrej
 */
public class SupprimerDocteur extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField nom= new JTextField("a");
    private JTextField prenom= new JTextField("a");
    private JTextField adresse= new JTextField("a");
    private JFormattedTextField tel= new JFormattedTextField("0123456789");
    private JTextField id= new JTextField("");
    private JTextField special= new JTextField("Generaliste");
    
    private JButton retour = new JButton("Retour");

    
    private JLabel ident = new JLabel("ID");

    
    public SupprimerDocteur()
    {
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
        id.setPreferredSize(new Dimension(150, 30));
        
        top.add(ident);
        top.add(id);

        

        pan.add(top);
      
        submit.addActionListener(this);
        nom.addActionListener(this);
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
            Docteur d =new Docteur();
            d.supprimerDocteur(id, nom, prenom, adresse, tel, special);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           Supprimer s=new Supprimer();
       }
    }
    
    
    
}

