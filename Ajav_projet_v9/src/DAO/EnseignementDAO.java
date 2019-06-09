/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Enseignement;

/**
 * @author Guilhem
 *
 */
public class EnseignementDAO extends DAO<Enseignement> {
	
	private int resultat;

	public EnseignementDAO( ) {
		super();
	}

	@Override
	public boolean create(Enseignement obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO enseignement VALUES ('" +obj.getId() +"', '"+ obj.getId_classe()+ obj.getId_discipline()+ obj.getId_personne()+"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		try{
            setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `enseignement` WHERE `id` = '" + id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Enseignement obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE enseignement SET classe_id ='"+obj.getId_classe()+ "', discipline_id ='"+obj.getId_discipline()+ "', personne_id ='"+obj.getId_personne()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}
	
	@Override
	public ArrayList<String> display() {
		ArrayList<String> array = new ArrayList<String>();
		try{
			rs = st.executeQuery("SELECT * FROM enseignement");
			while(rs.next()) {
				String id = rs.getString("id");
				String classe_id = rs.getString("classe_id");
				String personne_id = rs.getString("personne_id");
				String discipline_id = rs.getString("discipline_id");
				String s = "ID: "+id+"Classe ID : "+classe_id+"Personne ID: "+personne_id+"Discipline ID: "+discipline_id;
				array.add(s);	
			}
                        
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return array;
	}
	
	//**********************************
			@Override
			public ArrayList<String> find(String id1) {
				ArrayList<String> array = new ArrayList<String>();
				try{
					String query="SELECT * FROM enseignement WHERE id="+id1;
					PreparedStatement pt = conn.prepareStatement(query);
					ResultSet rs = pt.executeQuery();
					int i=0;
					while(rs.next()) {
						i++;
						String id = rs.getString("id");
						String nom = rs.getString("nom");
						String s = "ID: "+id+"  Nom : "+nom;
						array.add(s);
					}if(i==1) {
						JOptionPane.showMessageDialog(null, "Recherche réussi !");
					}else {
						JOptionPane.showMessageDialog(null, "Recherche introuvable !");
					}          
		        }
		        catch (SQLException e) {
		            e.printStackTrace();
		            }
				return array;
			}
		//**********************************
	
	/**
	 * @return the resultat
	 */
	public int getResultat() {
		return resultat;
	}

	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
}
