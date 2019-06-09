/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Requetes;


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
public class Requete6 extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextArea affd= new JTextArea();
    private JTextArea affd2= new JTextArea();
    private JTextArea affd3= new JTextArea();
    private JButton retour = new JButton("Retour");
    private JScrollPane scroll = new JScrollPane(affd);
    
    
    public Requete6()
    {
        //pan.setLayout(new GridLayout(2,8));
        scroll.setBounds(5, 5, 100, 100);
        this.setTitle("Option Requete2");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
          
        
        pan.setBackground(Color.WHITE);
        pan.setLayout(new BorderLayout());
        
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setContentPane(pan);
        
        String a = "REA";
        String b= "CHG";
        String c= "CAR";
        String bat = "A";
        float R=0;
        float C=0;
        float CA=0;
        int cmpt1 =0;
        int cmpt2=0;
        int cmpt3=0;
        for(int i=1; i<500; i++)
        {
          DAO<Service> serviceDao = new serviceDAO(Connexion.getInstance());
          Service service = serviceDao.find(i);
          if(service.getIdDirecteur() !=0)
          {   
              
              DAO2<Chambre> chambreDao = new chambreDAO(Connexion.getInstance());
              
              for(int j=0; j<500; j++)
              {
              
              if("A".equals(bat))
              {
              Chambre chambre = chambreDao.find(j,a);
              Chambre chambre2 = chambreDao.find(j,b);
              if("REA".equals(service.getCode()) && "REA".equals(chambre.getCodeService()) )
              {   

                  if(chambre.getNbChambre()!=0)
                     {
                       R+=chambre.getNbLits();
                       cmpt1++;
                     }
              
              }
              if("CHG".equals(service.getCode()) && "CHG".equals(chambre2.getCodeService()) )
              {   

                  if(chambre2.getNbChambre()!=0)
                     {
                       C+=chambre2.getNbLits();
                       cmpt2++;
                     }
              
              }
              }
              if("B".equals(bat))
              {
                  Chambre chambre3 = chambreDao.find(j,c);
                  if("CAR".equals(service.getCode()) && "CAR".equals(chambre3.getCodeService()) )
              {   

                  if(chambre3.getNbChambre()!=0)
                     {
                       CA+=chambre3.getNbLits();
                       cmpt3++;
                     }
              
              }
              }
              }
                 
          }
        }

        R=R/cmpt1;
        C=C/cmpt2;
	        affd.append("REA " + R+ "\n********************************\n" +
                        "CHG " + C+ "\n********************************\n");

        
        /*if(CA!=0)
        {
        CA=CA/cmpt3;
	affd3.append("CAR " + CA+ "\n********************************\n");
        }*/
                
        
        
             

        
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
           Requetes r=new Requetes();
       }
        
    }
    
    
    
}


