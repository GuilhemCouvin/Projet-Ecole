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


/**
 *
 * @author Andrej
 */
public class ModifierHospibis extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();

    
    
    private JButton submit = new JButton("Envoyer");
    private JTextField idMalade= new JTextField("");
    private JTextField codeService= new JTextField("aaa");
    private JTextField noChambre= new JTextField("1");
    private JTextField noLits= new JTextField("1");
    
    private JButton retour = new JButton("Retour");
    
    private JLabel im = new JLabel("Numero Malade");


    
    public ModifierHospibis()
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
        idMalade.setPreferredSize(new Dimension(150, 30));
        noLits.setPreferredSize(new Dimension(150, 30));

        top.add(im);
        top.add(idMalade);


        

        pan.add(top);      
        submit.addActionListener(this);
        idMalade.addActionListener(this);
        
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
            ModifierHospi h =new ModifierHospi(idMalade);
        }
        
        if(source==retour)
       {    
           this.dispose();
           Modifier m = new Modifier();
       }
    }
    
    
    
}

