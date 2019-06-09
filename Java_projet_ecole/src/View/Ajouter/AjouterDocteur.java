/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Ajouter;

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
public class AjouterDocteur extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField nom= new JTextField("");
    private JTextField prenom= new JTextField("");
    private JTextField adresse= new JTextField("");
    private JFormattedTextField tel= new JFormattedTextField();
    private JTextField id= new JTextField("");
    private JTextField special= new JTextField("");

    private JButton retour = new JButton("Retour");
    
    private JLabel surname = new JLabel("Nom            ");
    private JLabel name = new JLabel("Prenom            ");
    private JLabel adre = new JLabel("Adresse           ");
    private JLabel numb = new JLabel("Telephone         ");    
    private JLabel ident = new JLabel("ID               ");
    private JLabel spec = new JLabel("Specialite        ");

    
    public AjouterDocteur()
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
        nom.setPreferredSize(new Dimension(460, 30));
        prenom.setPreferredSize(new Dimension(460, 30));
        adresse.setPreferredSize(new Dimension(460, 30));
        id.setPreferredSize(new Dimension(460, 30));
        tel.setPreferredSize(new Dimension(460, 30));
        special.setPreferredSize(new Dimension(460, 30));
        
        top.add(ident);
        top.add(id);
        top.add(surname);
        top.add(nom);
        top.add(name);
        top.add(prenom);
        top.add(adre);
        top.add(adresse);
        top.add(numb);
        top.add(tel);
        top.add(spec);
        top.add(special);

        

        pan.add(top);
      
        submit.addActionListener(this);
        nom.addActionListener(this);
        prenom.addActionListener(this);
        adresse.addActionListener(this);
        id.addActionListener(this);
        tel.addActionListener(this);
        special.addActionListener(this);
        
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
            d.ajouterDocteur(id, nom, prenom, adresse, tel, special);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           Ajouter a = new Ajouter();
       }
    }
    
    
    
}


