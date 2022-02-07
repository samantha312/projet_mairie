package mairies;

public class Deces extends Evenement {
	
	private Citoyen citoyen;
	
	public void afficher() {
		System.out.println(this.toString());
	}

	public Deces(Citoyen citoyen,Date date,String lieu,String nomMairie) {
		this.citoyen = citoyen;
		this.setDate(date);
		this.setLieu(lieu);
		this.setNomMairie(nomMairie);
	}
	
	public Deces() {}

	@Override
	public String toString() {
	  	String event=super.toString();
		return "Deces \n " + citoyen +"\n" +event;
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		
		this.citoyen = citoyen;
	}
	
}
