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
public class SupprimerMalade extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField nom= new JTextField("a");
    private JTextField prenom= new JTextField("a");
    private JTextField adresse= new JTextField("a");
    private JFormattedTextField tel= new JFormattedTextField("0123456798");
    private JTextField mutuelle= new JTextField("a");
    private JTextField id= new JTextField("");
    private JTextField docS= new JTextField("1");
    
    private JButton retour = new JButton("Retour");

    

    private JLabel ident = new JLabel("ID");

    
    public SupprimerMalade()
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
        nom.setPreferredSize(new Dimension(150, 30));
        prenom.setPreferredSize(new Dimension(150, 30));
        adresse.setPreferredSize(new Dimension(150, 30));
        id.setPreferredSize(new Dimension(150, 30));
        mutuelle.setPreferredSize(new Dimension(150, 30));
        tel.setPreferredSize(new Dimension(150, 30));
        docS.setPreferredSize(new Dimension(150, 30));
        
        top.add(ident);
        top.add(id);

        

        pan.add(top);
      
        submit.addActionListener(this);
        nom.addActionListener(this);
        prenom.addActionListener(this);
        adresse.addActionListener(this);
        id.addActionListener(this);
        tel.addActionListener(this);
        mutuelle.addActionListener(this);
        docS.addActionListener(this);
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
            Malade m =new Malade();
            
            m.supprimerMalade(id, nom, prenom, adresse, tel, mutuelle, docS);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           Supprimer s=new Supprimer();
       }
    }
    
    
    
}
