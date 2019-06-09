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
public class Requete8 extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextArea affd= new JTextArea();
    private JTextArea affd2= new JTextArea();
    private JTextArea affd3= new JTextArea();
    private JButton retour = new JButton("Retour");
    private JScrollPane scroll = new JScrollPane(affd);
    
    
    public Requete8()
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
        DAO<Malade> maladeDao = new maladeDAO(Connexion.getInstance());
        DAO<Hospi> hospiDao = new hospitalisationDAO(Connexion.getInstance());

        float a=0, b =0, c =0, d=0, e=0, f=0;
        float cmpt1=0f, cmpt2 =0f, cmpt3=0f;
        
        for (int i=1; i<300; i++)
        {
        Infirmier infirmier = infirmierDao.find(i);
        Malade malade = maladeDao.find(i);
        if(infirmier.getId()!=0)
        {   
            if("REA".equals(infirmier.getCodeService()))
            {
            a=a+1;
            }
            if("CHG".equals(infirmier.getCodeService()))
            {
            b=b+1;
            }
            if("CAR".equals(infirmier.getCodeService()))
            {
                c=c+1;
            }
            
        }
        Hospi hospi = hospiDao.find(malade.getID());
        if(hospi.getNbMalade()!=0)
        {
            if("REA".equals(hospi.getCodeService()))
            {
            d=d+1;
            }
            if("CHG".equals(hospi.getCodeService()))
            {
            e=e+1;
            }
            if("CAR".equals(hospi.getCodeService()))
            {
            f=f+1;
            }  
        }
        }
        
        cmpt1=(a/d);
        cmpt2=(b/e);
        cmpt3=(c/f);
        affd.append("Reanimation "+ cmpt1+"\n************************************\n"
		+"Chirurgie Générale " +cmpt2+"\n************************************\n"
		+"Cardiologie " +cmpt3+"\n************************************\n");


        
        
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


