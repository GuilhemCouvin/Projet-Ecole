/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AjouterService extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField codeService= new JTextField("");
    private JTextField nom= new JTextField("");
    private JTextField batiment= new JTextField("");
    private JTextField directeur= new JTextField("");
    
    private JButton retour = new JButton("Retour");
    
    private JLabel cs = new JLabel("Code Service");
    private JLabel name = new JLabel("Nom Service");
    private JLabel bat = new JLabel("Batiment");
    private JLabel dir = new JLabel("Directeur Service");

    
    public AjouterService()
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
        codeService.setPreferredSize(new Dimension(470, 30));
        nom.setPreferredSize(new Dimension(470, 30));
        batiment.setPreferredSize(new Dimension(470, 30));
        directeur.setPreferredSize(new Dimension(470, 30));

        top.add(cs);
        top.add(codeService);
        top.add(name);
        top.add(nom);
        top.add(bat);
        top.add(batiment);
        top.add(dir);
        top.add(directeur);

        

        pan.add(top);
                
        submit.addActionListener(this);
        codeService.addActionListener(this);
        nom.addActionListener(this);
        batiment.addActionListener(this);
        directeur.addActionListener(this);
        
        JPanel south = new JPanel();
        south.add(retour);
        south.add(submit);
        retour.addActionListener(this);
        pan.add(south, BorderLayout.SOUTH); 
        
        this.setContentPane(pan);
        this.setVisible(true);
         
              
           
           
             

    }

    
    

    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
        if (source == submit) 
        {   
            this.dispose();
            Service s =new Service();
            s.ajouterService(codeService, nom, batiment, directeur);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           Ajouter a = new Ajouter();
       }
    }
    
    
    
}

