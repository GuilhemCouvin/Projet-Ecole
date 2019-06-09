/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Requetes;
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
public class Requetes extends JFrame implements ActionListener{
         
           private JPanel pan = new JPanel();
           private JLabel label = new JLabel();
           private JButton R1 = new JButton("R1");
           private JButton R2 = new JButton("R2");
           private JButton R3 = new JButton("R3");
           private JButton R4 = new JButton("R4");
           private JButton R5 = new JButton("R5");
           private JButton R6 = new JButton("R6");
           private JButton R7 = new JButton("R7");
           private JButton R8 = new JButton("R8");
           private JButton R9 = new JButton("R9");
           private JButton R10 = new JButton("R6");
           private JButton retour = new JButton("Retour");
           private Requete1 fenetre;
           private Requete2 fenetre2;
           private Requete3 fenetre3;
           private Requete5 fenetre5;
           private Requete6 fenetre6;
           private Requete8 fenetre8;
           
           
           public Requetes(){
           pan.setLayout(new BorderLayout());
           this.setTitle("Option Requete");
           this.setSize(600,600);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setLocationRelativeTo(null);
        
           pan.setBackground(Color.WHITE);
           label.setText("salut nous somme ds la fenetre Requete");
         
           pan.add(label);   
           JPanel top = new JPanel();
           top.add(R1);
           top.add(R2);
           top.add(R3);
           top.add(R4);
           top.add(R5);
           top.add(R6);
           top.add(R7);
           top.add(R8);
           top.add(R9);
           top.add(R10);
           R1.addActionListener(this);
           R2.addActionListener(this);
           R3.addActionListener(this);
           R4.addActionListener(this);
           R5.addActionListener(this);
           R6.addActionListener(this);
           R7.addActionListener(this);
           R8.addActionListener(this);
           R9.addActionListener(this);
           R10.addActionListener(this);
           
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
        if (source == R1) {
            this.dispose();
            fenetre=new Requete1();
            
                      
        }

        if (source == R2) {
            this.dispose();
            fenetre2=new Requete2();
            
            
            
        }
        
        if (source == R3) {
            this.dispose();
            fenetre3=new Requete3();
            
        }
        
        if (source == R4) {
            this.dispose();
            Requetes r = new Requetes();
        }
        
        if (source == R5) {
            this.dispose();
            fenetre5=new Requete5();
            
            
        }
        
        if (source == R6) {
            this.dispose();
            fenetre6=new Requete6();
            
                      
        }
        if (source == R7) {
            this.dispose();
            Requetes r = new Requetes();
            
                      
        }
        if (source == R8) {
            this.dispose();
            fenetre8=new Requete8();
            
                      
        }
        if (source == R9) {
            this.dispose();
            Requetes r = new Requetes();
            
                      
        }
        if (source == R10) {
            this.dispose();
            Requetes r = new Requetes();
            
                      
        }
        
        if(source==retour)
       {    
           this.dispose();
           InterfaceGraphique g=new InterfaceGraphique();
       }
        
        
        
        
    }
    
    
    
    

    
    
    
   
                
} 
    

