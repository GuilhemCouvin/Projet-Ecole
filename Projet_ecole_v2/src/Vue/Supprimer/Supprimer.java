/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Supprimer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modele.*;
import Vue.InterfaceGraphique;


/**
 *
 * @author aksou
 */
public class Supprimer extends JFrame implements ActionListener{
         
           private JPanel pan = new JPanel();
           private JLabel label = new JLabel();
           private JButton docteur = new JButton("Docteur");
           private JButton infirmier = new JButton("Infirmier");
           private JButton malade = new JButton("Malade");
           private JButton chambre = new JButton("Chambre");
           private JButton hospi = new JButton("Hospitalisation");
           private JButton service = new JButton("Service");
           private JButton retour = new JButton("Retour");
           private SupprimerMalade fenetre1;
           private SupprimerDocteur fenetre2;
           private SupprimerInfirmier fenetre3;
           private SupprimerChambre fenetre4;
           private SupprimerHospi fenetre5;
           private SupprimerService fenetre6;
           
           public Supprimer(){
           pan.setLayout(new BorderLayout());
           this.setTitle("Option Supprimer");
           this.setSize(600,600);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setLocationRelativeTo(null);
        
           pan.setBackground(Color.WHITE);
           label.setText("salut nous somme ds la fenetre Supprimer");
         
           pan.add(label);   
           JPanel top = new JPanel();
           top.add(docteur);
           top.add(infirmier);
           top.add(malade);
           top.add(chambre);
           top.add(hospi);
           top.add(service);
           docteur.addActionListener(this);
           infirmier.addActionListener(this);
           malade.addActionListener(this);
           chambre.addActionListener(this);
           hospi.addActionListener(this);
           service.addActionListener(this);
           
           JPanel south = new JPanel();
           south.add(retour);
           retour.addActionListener(this);
           
           setContentPane(pan);
           pan.add(top, BorderLayout.NORTH); 
           pan.add(south, BorderLayout.SOUTH); 
           this.setVisible(true);                             
        }

    public void actionPerformed(ActionEvent e) {
        //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre

        Object source = e.getSource();
        if (source == docteur) {
            this.dispose();
            fenetre2=new SupprimerDocteur();
                      
        }

        if (source == infirmier) {
            this.dispose();
            fenetre3=new SupprimerInfirmier();
            
            
        }
        
        if (source == malade) {
            this.dispose();
            fenetre1=new SupprimerMalade();
        }
        
        if (source == chambre) {
            this.dispose();
            fenetre4=new SupprimerChambre();
        }
        
        if (source == hospi) {
            this.dispose();
            fenetre5=new SupprimerHospi();
        }
        
        if (source == service) {
            this.dispose();
            fenetre6=new SupprimerService();
                      
        }
        
        if(source==retour)
       {    
           this.dispose();
           InterfaceGraphique g=new InterfaceGraphique();
       }
        
        
        
        
    }
    
    
    
    

    
    
    
   
                
} 
    

