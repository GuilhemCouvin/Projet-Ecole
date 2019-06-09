/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Afficher;
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
public class Afficher extends JFrame implements ActionListener{
         
           private JPanel pan = new JPanel();
           private JLabel label = new JLabel();
           private JButton personne = new JButton("Personne");
           private JButton classe = new JButton("Classe");
           private JButton annee = new JButton("Annee");
           private JButton bulletin = new JButton("Bulletin");
           private JButton discipline = new JButton("Discipline");
           private JButton enseignement = new JButton("Enseignement");
           private JButton evaluation = new JButton("Evaluation");
           private JButton inscription = new JButton("Inscription");
           private JButton niveau = new JButton("Niveau");
           private JButton trimestre = new JButton("Trimestre");
           
           
            private JButton retour = new JButton("Retour");
           private AfficherAnnee fenetre1;
           private AfficherPersonne fenetre2;
           private AfficherClasse fenetre3;
           private AfficherBulletin fenetre4;
           private AfficherEnseignement fenetre5;
           private AfficherDiscipline fenetre6;
           private AfficherEnseignement fenetre7;
           private AfficherEvaluation fenetre8;
           private AfficherInscription fenetre9;
           private AfficherNiveau fenetre10;
           private AfficherTrimestre fenetre11;
           
           public Afficher(){
           pan.setLayout(new BorderLayout());
           this.setTitle("Option Ajouter");
           this.setSize(600,600);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setLocationRelativeTo(null);
        
           pan.setBackground(Color.WHITE);
           label.setText("salut nous somme ds la fenetre Afficher");
         
           pan.add(label);   
           JPanel top = new JPanel();
           top.add(personne);
           top.add(classe);
           top.add(annee);
           top.add(bulletin);
           top.add(discipline);
           top.add(enseignement);
           top.add(evaluation);
           top.add(inscription);
           top.add(niveau);
           top.add(trimestre);
           
           personne.addActionListener(this);
           classe.addActionListener(this);
           annee.addActionListener(this);
           bulletin.addActionListener(this);
           discipline.addActionListener(this);
           enseignement.addActionListener(this);
           evaluation.addActionListener(this);
           inscription.addActionListener(this);
           niveau.addActionListener(this);
           trimestre.addActionListener(this);
           
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
        
        
        if (source == personne) {
            this.dispose();
            
            fenetre1= new AfficherAnnee();
            
            
                      
        }
        
        if (source == personne) {
            this.dispose();
            
            fenetre2=new AfficherPersonne();
            
            
                      
        }

        if (source == classe) {
            this.dispose();
            fenetre3=new AfficherClasse();
            
            
        }
        
        if (source == annee) {
            this.dispose();
            fenetre1=new AfficherAnnee();
            
        }
        
        if (source == bulletin) {
            this.dispose();
            fenetre4=new AfficherBulletin();
            
        }
        
        if (source == discipline) {
            this.dispose();
            fenetre6=new AfficherDiscipline();
           
        }
        
        if (source == enseignement) {
            this.dispose();
            
            fenetre7=new AfficherEnseignement();
            
                      
        }
        if (source == evaluation) {
            this.dispose();
            fenetre8=new AfficherEvaluation();
           
        }
        
        if (source == inscription) {
            this.dispose();
            fenetre9=new AfficherInscription();
           
        }
        
        if (source == niveau) {
            this.dispose();
            fenetre10=new AfficherNiveau();
           
        }
        
        if (source == trimestre) {
            this.dispose();
            fenetre10=new AfficherTrimestre();
           
        }
        
        if(source==retour)
       {    
           this.dispose();
           InterfaceGraphique g=new InterfaceGraphique();
       }
        
        
        
        
    }
    
    
    
    

    
    
    
   
                
} 
    

