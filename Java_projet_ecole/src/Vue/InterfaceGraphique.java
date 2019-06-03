        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Vue.Requetes.Requetes;
import Vue.Supprimer.Supprimer;
import Vue.Modifier.Modifier;
import Vue.Ajouter.Ajouter;
import Vue.Afficher.Afficher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aksou
 */
public class InterfaceGraphique extends JFrame implements ActionListener {

    private JPanel pan = new JPanel();
    private JLabel label = new JLabel();
    private JButton jr1 = new JButton("Ajouter");
    private JButton jr2 = new JButton("Modifier");
    private JButton jr3 = new JButton("Supprimer");
    private JButton jr5 = new JButton("Afficher");
    private JButton jr4 = new JButton("Autres Requetes");

    private Ajouter fenetre1;
    private Modifier fenetre2;
    private Supprimer fenetre3;
    private Requetes fenetre4;
    private Afficher fenetre5;
    private ButtonGroup bg = new ButtonGroup();

    public InterfaceGraphique() {
        pan.setLayout(new BorderLayout());
        this.setTitle("Choisir Mouvement");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        pan.setBackground(Color.white);

        
        label.setText("Fais ton choix Morray");

        pan.add(label);
        JPanel top = new JPanel();
        jr1.addActionListener(this);
        jr2.addActionListener(this);
        jr3.addActionListener(this);
        jr4.addActionListener(this);
        jr5.addActionListener(this);
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        bg.add(jr5);
        bg.add(jr4);
        top.add(jr1);
        top.add(jr2);
        top.add(jr3);
        top.add(jr5);
        top.add(jr4);
        

        pan.add(top, BorderLayout.NORTH);
        

        setContentPane(pan);
        


        this.setContentPane(pan);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        //Lorsque nous cliquons sur notre bouton, on passe a l'autre fenétre

        Object source = e.getSource();
        if (source == jr1) {
            this.dispose();
            fenetre1 = new Ajouter();           
        }

        if (source == jr2) {
            this.dispose();
            fenetre2 = new Modifier();
        }
        
        if (source == jr3) {
            this.dispose();
            fenetre3 = new Supprimer();
        }
        
        if (source == jr4) {
            this.dispose();
            fenetre4 = new Requetes();
        }
        
        if (source == jr5) {
            this.dispose();
            fenetre5 = new Afficher();
        }
        
        
    }
}


