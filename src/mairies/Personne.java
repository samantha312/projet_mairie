package mairies;


abstract class Personne implements InterfaceAffichage {
	
	private int id;
	private String nom;
	private String prenom;
	private Date date;
	private String sexe;
	private String etatCivil;
	private String nomUsage;
	private int idConjoint;
	

	public void afficher(){
		
	}
    public Personne(){}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEtatCivil() {
		return etatCivil;
	}
	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}
	
	public String getNomUsage() {
		return nomUsage;
	}
	public void setNomUsage(String nomUsage) {
		this.nomUsage = nomUsage;
	}
	
	public int getIdConjoint() {
		return idConjoint;
	}
	
	public void setIdConjoint(int idConjoint) {
		this.idConjoint=idConjoint;
	}
	@Override
	public String toString() {
		return "\nIndentifiant = " + id + "\nNom = " + nom + "\nPrenom = " + prenom + "\nDate de naissance = " + date + "\nSexe = " + sexe
				+ "\nEtatCivil = " + etatCivil + "\nNomUsage = " + nomUsage + "\nIdConjoint = " + idConjoint+"\n\n  ";
	}
	
	


}
