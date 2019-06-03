/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vue.*;

/**
 *
 * @author alex_
 */
public class Java_projet_ecole extends JFrame implements ActionListener {

    private InterfaceGraphique fenetre;
    private JPanel pan = new JPanel();
    private JTextField JTF = new JTextField("");
    private JLabel ID = new JLabel("Identifiant");
    private JTextField JTF2 = new JTextField("");
    private JLabel MDP = new JLabel("Mot de Passe");
    private JButton bouton1 = new JButton("Se connecter");

    public Java_projet_ecole() {
        
        this.setTitle("Bienvenue à l'Hopital Necker");
        this.setSize(700, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        pan.setBackground(Color.white);
        pan.setLayout(new BorderLayout());

        JPanel top = new JPanel();

        Font police = new Font("Arial", Font.BOLD, 14);
        JTF.setFont(police);
        JTF.setPreferredSize(new Dimension(150, 30));
        JTF.setForeground(Color.BLACK);
        top.add(ID);
        top.add(JTF);

        JTF2.setFont(police);
        JTF2.setPreferredSize(new Dimension(150, 30));
        JTF2.setForeground(Color.BLACK);
        top.add(MDP);
        top.add(JTF2);
        
        bouton1.setPreferredSize(new Dimension(150, 30));
        top.add(bouton1);
        
        

        setContentPane(pan);
        JTF.addActionListener(this);
        JTF2.addActionListener(this);
        bouton1.addActionListener(this);
        this.setVisible(true);

        pan.add(top, BorderLayout.NORTH);

        this.setContentPane(pan);
        this.setVisible(true);
    }
     
   
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();


            if("root".equals(JTF.getText()) && "".equals(JTF2.getText()))
        {
            this.dispose();
            fenetre = new InterfaceGraphique();
        }
        
            else
            {
                JOptionPane jop3 = new JOptionPane();
                jop3.showMessageDialog(null, "Identifiant ou Mot de Passe incorrect", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        
        
            
    }
     
     
    public String getID()
    {
        String a = JTF.getText();
        return a;
    }
    public String getMDP()
    {
        String b = JTF2.getText();
        return b;
    }

   
    public static void main(String[] args) {
        Java_projet_ecole fenetre = new Java_projet_ecole();
       
    }

}