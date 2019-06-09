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
public class Requete5 extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextArea affd= new JTextArea();
    private JButton retour = new JButton("Retour");
    private JScrollPane scroll = new JScrollPane(affd);
    
    
    public Requete5()
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
        
        DAO<Infirmier> infirmierDao = new infirmierDAO(Connexion.getInstance());
        float R =0f;
        float CR=0f;
        float CG=0f;
        int a=0, b =0, c =0;
        
        for (int i=1; i<300; i++)
        {
        Infirmier infirmier = infirmierDao.find(i);
        if(infirmier.getId()!=0)
        {   
            
            if("REA".equals(infirmier.getCodeService()))
            {
                
                R+=infirmier.getSalaire();
                a++;

                
            }
            if("CAR".equals(infirmier.getCodeService()))
            {
                
                CR+=infirmier.getSalaire();
                b++;

            }
            if("CHG".equals(infirmier.getCodeService()))
            {
            
                CG+=infirmier.getSalaire();
                c++;

            }
        }
        
        }
        R=R/a;
        CR=CR/b;
        CG=CG/c;
        affd.append("REA " + R+" "+ "\n********************************\n" 
                + "CAR " + CR+" "+"\n********************************\n"+
                        "CHG " + CG+" "+
                         "\n********************************\n");
                
        
        
             

        
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


