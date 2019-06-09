/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Afficher;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Andrej
 */
public class AfficherChambrebis extends JFrame implements ActionListener{
    
    private JPanel pan = new JPanel();
    private JTextField codeService= new JTextField("");
    private JButton submit = new JButton("Rechercher");
    private JLabel cs = new JLabel("Code Service");
    private AfficherChambre fenetre;
    
    public AfficherChambrebis()
    {
        pan.setLayout(new BorderLayout());
        this.setTitle("Option Ajouter");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        codeService.setPreferredSize(new Dimension(150, 30));
        pan.setBackground(Color.WHITE);  
        JPanel top = new JPanel();
        top.add(cs);
        top.add(codeService);
        top.add(submit);
        codeService.addActionListener(this);
        submit.addActionListener(this);
        setContentPane(pan);
        pan.add(top, BorderLayout.NORTH);    
        this.setVisible(true);
        
    }
    
    public JTextField getCodeService()
    {
        return codeService;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == submit) {
            this.dispose();
            
            fenetre=new AfficherChambre(codeService);
            
            
                      
        }
        
    }
    
}
