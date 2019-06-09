/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//Librairies
import java.sql.*;

import javax.swing.JOptionPane;

public class Connexion{

  private static String url = "jdbc:mysql://localhost/ecole";
  private static String user = "root";
  private static String passwd = "";
  private static Connection connect;
   
  public static Connection getInstance() throws ClassNotFoundException{
    if(connect == null){
      try { 
    	Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole?useSSL=false","root","");
        JOptionPane.showMessageDialog(null,"Vous êtes connecté à la base de données!");
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }      
    return connect;
  }   
}


  
