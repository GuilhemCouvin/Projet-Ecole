/**
 * 
 */
package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Classe;

/**
 * @author Guilhem
 *
 */
public class ClasseDAO extends DAO<Classe> {

	private int resultat;

	public ClasseDAO() {
		super();
	}

	@Override
	public boolean create(Classe obj) {
		try {
			setResultat(this.conn.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO classe VALUES ('" +obj.getId() +"', '"+ obj.getNom()+"', '"+ obj.getId_ecole()+"', '"+ obj.getId_annee()+"')"));
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
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `classe` WHERE `id` = '" +id+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(Classe obj) {
		try{
            
			setResultat(this.conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE classe SET nom ='"+obj.getNom()+ "', ecole_id ='"+obj.getId_ecole()+ "', annee_scolaire_id ='"+obj.getId_annee()+ "' WHERE id = '" + obj.getId()+ "'"));
                        
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
			rs = st.executeQuery("SELECT * FROM bulletin");
			while(rs.next()) {
				String id = rs.getString("id");
				String nom = rs.getString("nom");
				String ecole_id = rs.getString("ecole_id");
				String annee_scolaire_id = rs.getString("annee_scolaire_id");
				String s = "ID: "+id+"Nom : "+nom+"Ecole ID: "+ecole_id+"Annee Scolaire ID: "+annee_scolaire_id;
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
					String query="SELECT * FROM bulletin WHERE id="+id1;
					PreparedStatement pt = conn.prepareStatement(query);
					ResultSet rs = pt.executeQuery();
					int i=0;
					while(rs.next()) {
						i++;
						String id = rs.getString("id");
						String nom = rs.getString("nom");
						String ecole_id = rs.getString("ecole_id");
						String annee_scolaire_id = rs.getString("annee_scolaire_id");
						String s = "ID: "+id+"Nom : "+nom+"Ecole ID: "+ecole_id+"Annee Scolaire ID: "+annee_scolaire_id;
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
