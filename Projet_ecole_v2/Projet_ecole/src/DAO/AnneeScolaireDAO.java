package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.*;

public final class AnneeScolaireDAO extends DAO<AnneeScolaire> {
	
	private int resultat;

	public AnneeScolaireDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(AnneeScolaire obj) {
		try {
			setResultat(this.connect.createStatement(
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			        ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO annee_scolaire VALUES ('" +obj.getId() +"')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(AnneeScolaire obj) {
		try{
            setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM `annee_scolaire` WHERE `id` = '" + obj.getId()+"'"));           
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
		return false;
	}

	@Override
	public boolean update(AnneeScolaire obj) {
		try{
			setResultat(this.connect.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE annee_scolaire SET id= '"+  obj.getId()+ "'"));              
        }
        catch (SQLException e) {
            e.printStackTrace();
            }
		return false;
	}

	@Override
	public AnneeScolaire find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

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
