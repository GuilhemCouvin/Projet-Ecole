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
public class Requete3 extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextArea affd= new JTextArea();
    private JButton retour = new JButton("Retour");
    private JScrollPane scroll = new JScrollPane(affd);
    
    
    public Requete3()
    {
        //pan.setLayout(new GridLayout(2,8));
        scroll.setBounds(5, 5, 100, 100);
        this.setTitle("Option Requete3");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
          
        
        pan.setBackground(Color.WHITE);
        pan.setLayout(new BorderLayout());
        
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setContentPane(pan);
        
        for(int i=1; i<300; i++)
        {
	DAO<Service> serviceDao = new serviceDAO(Connexion.getInstance());
	Service service = serviceDao.find(i);
	if (service.getIdDirecteur() != 0)
        {
            DAO<Docteur> docteurDao = new docteurDAO(Connexion.getInstance());
            Docteur docteur = docteurDao.find(service.getIdDirecteur());
            DAO<Employe> employeDao = new employeDAO(Connexion.getInstance());
            Employe employe = employeDao.find(docteur.getId());
            System.out.println(service.getNom()+" "+service.getBatiment()+" "+employe.getPrenom()+" "+employe.getNom()+" "+ docteur.getSpecial() );
            affd.append(service.getNom()+" "+service.getBatiment()+" "+employe.getPrenom()+" "+employe.getNom()+" "+ docteur.getSpecial()+
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
           Requetes r=new Requetes();
       }
        
    }
    
    
    
}


