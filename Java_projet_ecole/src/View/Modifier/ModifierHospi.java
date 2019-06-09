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
package Vue.Modifier;

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
public class ModifierHospi extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField idMalade= new JTextField("");
    private JTextField codeService= new JTextField("");
    private JTextField noChambre= new JTextField("");
    private JTextField noLits= new JTextField("");
    
    private JButton retour = new JButton("Retour");
    
    private JLabel cs = new JLabel("Code Service         ");
    private JLabel nc = new JLabel("Numero Chambre       ");
    private JLabel nl = new JLabel("Numero Lit           ");

    
    public ModifierHospi(JTextField idMalade)
    {
        this.idMalade=idMalade;
        pan.setLayout(new GridLayout(2,8));
        this.setTitle("Option Modifier");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
          
        
        pan.setBackground(Color.WHITE);
        setContentPane(pan);
        JPanel top = new JPanel();
         // instancier le panneau
        getContentPane().add(top); // ajouter le panneau dans la fenêtre 
        codeService.setPreferredSize(new Dimension(470, 30));
        noChambre.setPreferredSize(new Dimension(470, 30));
        noLits.setPreferredSize(new Dimension(470, 30));


        top.add(cs);
        top.add(codeService);
        top.add(nc);
        top.add(noChambre);
        top.add(nl);
        top.add(noLits);

        

        pan.add(top);    
        submit.addActionListener(this);
        codeService.addActionListener(this);
        noChambre.addActionListener(this);
        noLits.addActionListener(this);
        
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
            Hospi h =new Hospi();
            h.updateHospi(idMalade, codeService, noChambre, noLits);
            InterfaceGraphique g = new InterfaceGraphique();       
        }
        
        if(source==retour)
       {    
           this.dispose();
           ModifierHospibis c = new ModifierHospibis();
       }
    }
    
    
    
}

