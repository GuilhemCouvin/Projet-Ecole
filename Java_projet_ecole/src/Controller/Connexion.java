/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Andrej
 */

//Librairies
import java.sql.*;
import javax.swing.JOptionPane;

public class Connexion{

  private static String url = "jdbc:mysql://localhost/ecole";
  private static String user = "root";
  private static String passwd = "";
  private static Connection connect;
   
  public static Connection getInstance() throws ClassNotFoundException{
    
      try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe nomeClasse - Driver non trovata");
        }


      if(connect == null){
      try {
          
        connect = DriverManager.getConnection(url, user, passwd);
      } catch (SQLException e) {
        System.out.println("Stringa di connessione errata");
      }
    }      
    return connect;
  }   
}
  

        