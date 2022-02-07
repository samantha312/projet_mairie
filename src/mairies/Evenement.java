package mairies;

abstract class Evenement implements InterfaceAffichage {
	 
	private Date date;
	private String metier;
	private String lieu;
	private String nomMairie="Mairie de Paris";
	
	public void afficher() {
		
		System.out.println(this.toString());
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

	public String getNomMairie() {
		return nomMairie;
	}

	public void setNomMairie(String nomMarie) {
		this.nomMairie = nomMarie;
	}

	@Override
	public String toString() {
		return "Evenement : \ndate = " + date +"\nlieu = " + lieu + "\nnom Mairie = " + nomMairie+"\n" ;
	}

	
	
     
}
