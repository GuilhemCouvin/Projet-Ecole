/**
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Model.Personne;

/**
 * @author Guilhem
 *
 */
public abstract class DAO<T> {
	
	  protected Connection conn;
	  protected Statement st;
	  protected ResultSet rs; 
	   
	  public DAO(){
	    try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver OK");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole?useSSL=false","root","");
			if(conn==null)
				System.out.println("not working !");
			st = conn.createStatement();
			
		}catch(Exception ex) {
			System.out.println("Error :"+ex);
		}
	    
	  }

	  public abstract boolean create(T obj);

	  public abstract boolean delete(T obj);

	  public abstract boolean update(T obj);
	  
	  public abstract ResultSet display(T obj);

	  public abstract T find(int id);
	}
