/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Afficher;


import java.awt.BorderLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Modele.*;
import DAO.*;
import Controleur.*;
import Vue.InterfaceGraphique;


/**
 *
 * @author Andrej
 */
public class AfficherHospi extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextArea affd= new JTextArea();
    private JButton retour = new JButton("Retour");
    private JScrollPane scroll = new JScrollPane(affd);
    
    
    public AfficherHospi()
    {
        //pan.setLayout(new GridLayout(2,8));
        scroll.setBounds(5, 5, 100, 100);
        this.setTitle("Option Ajouter");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
          
        
        pan.setBackground(Color.WHITE);
        pan.setLayout(new BorderLayout());
        
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setContentPane(pan);
        
        
             for(int i=1; i<200; i++)
             {
             DAO<Hospi> hospiDao= new hospitalisationDAO(Connexion.getInstance());
             Hospi hospi= hospiDao.find(i);
             if(hospi.getNbMalade()!=0)
             {
                 
                 affd.append(Integer.toString(hospi.getNbMalade())+" "+ hospi.getCodeService() +" " + Integer.toString(hospi.getNumeroChambre())+" "+Integer.toString(hospi.getNumeroLit())+
                         "\n****************************************************"+"\n");
                 
                 
               
                 
                  
             }
             }

        
        pan.add(scroll);
        retour.addActionListener(this);
        
      
        this.getContentPane().add(retour, BorderLayout.SOUTH);
        
      
        
        this.setContentPane(pan);
        this.setVisible(true);
             
             
    }

    
    

    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
       
       if(source==retour)
       {    
           this.dispose();
           Afficher a =new Afficher();
       }
        
    }
    
    
    
}


