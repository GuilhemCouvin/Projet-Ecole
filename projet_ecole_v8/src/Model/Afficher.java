/**
 * 
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.Connexion;

/**
 * @author Guilhem
 *
 */
public class Afficher {
	Connection conn=null;
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * 
	 */
	public ArrayList<String> Recherche_afficher(String obj,int id) throws SQLException, ClassNotFoundException {
		conn=Connexion.getInstance();
		String query="SELECT * FROM "+obj+"WHERE id='"+id+"'";
		PreparedStatement pt = conn.prepareStatement(query);
		ResultSet rs = pt.executeQuery();
		while(rs.next()) {
			
		}
		return null;
		// TODO Auto-generated constructor stub
	}

}
