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
public class SupprimerChambre extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField codeService= new JTextField("");
    private JTextField noChambre= new JTextField("");
    private JTextField surveillant= new JTextField("1");
    private JTextField nbLits= new JTextField("1");
    
    private JButton retour = new JButton("Retour");
    
    private JLabel cs = new JLabel("Code Service");
    private JLabel nc = new JLabel("Numero Chambre");

    
    public SupprimerChambre()
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
        codeService.setPreferredSize(new Dimension(150, 30));
        noChambre.setPreferredSize(new Dimension(150, 30));
        
        top.add(cs);
        top.add(codeService);
        top.add(nc);
        top.add(noChambre);
        

        

        pan.add(top);
                
        submit.addActionListener(this);
        codeService.addActionListener(this);
        noChambre.addActionListener(this);
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
            Chambre c =new Chambre();
            c.supprimerChambre(codeService, noChambre, surveillant, nbLits);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           Supprimer s=new Supprimer();
       }
    }
    
    
    
}

