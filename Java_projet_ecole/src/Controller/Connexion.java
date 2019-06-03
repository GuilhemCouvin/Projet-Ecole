/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//Librairies
import java.sql.*;

public class Connexion{

  private static String url = "jdbc:mysql://localhost/ecole";
  private static String user = "root";
  private static String passwd = "";
  private static Connection connect;
   
  public static Connection getInstance(){
    if(connect == null){
      try {    
        connect = DriverManager.getConnection(url, user, passwd);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }      
    return connect;
  }   
}


  
