package Model;

public class Enseignement {
	
	private int id;
	private int id_classe;
	private int id_discipline;
	private int id_personne;

        public Enseignement() {
		
	}
        
	public Enseignement(int id,int id_classe,int id_discipline,int id_personne) {
		this.setId(id);
		this.setId_classe(id_classe);
		this.setId_discipline(id_discipline);
		this.setId_personne(id_personne);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id_classe
	 */
	public int getId_classe() {
		return id_classe;
	}

	/**
	 * @param id_classe the id_classe to set
	 */
	public void setId_classe(int id_classe) {
		this.id_classe = id_classe;
	}

	/**
	 * @return the id_discipline
	 */
	public int getId_discipline() {
		return id_discipline;
	}

	/**
	 * @param id_discipline the id_discipline to set
	 */
	public void setId_discipline(int id_discipline) {
		this.id_discipline = id_discipline;
	}

	/**
	 * @return the id_personne
	 */
	public int getId_personne() {
		return id_personne;
	}

	/**
	 * @param id_personne the id_personne to set
	 */
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}

}
