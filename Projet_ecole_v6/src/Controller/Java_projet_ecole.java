/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;

import View.Ajouter.*;
import View.Delete.*;
import Vue.Afficher.Afficher;

/**
 *
 * @author alex_
 */
public class Java_projet_ecole {

    private static AjouterPersonne p1;
    private static SupprimerPersonne p2;
    private static Afficher p3;

	/**
     * @param args the command line arguments
	 * @throws SQLException 
     */
    
    public static void main(String[] args) throws SQLException {
    	//p1 = new AjouterPersonne();
    	//p2 = new SupprimerPersonne();
        p3= new Afficher();
    }
    
}
