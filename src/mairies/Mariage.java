package mairies;

public class Mariage extends Evenement {

	private  Citoyen citoyen1;
	private  Citoyen citoyen2;
	
  	public Mariage(Citoyen citoyen1, Citoyen citoyen2,Date date,String lieu,String nomMairie) {
		this.citoyen1 = citoyen1;
		this.citoyen2 = citoyen2;
		this.setDate(date);
		this.setLieu(lieu);
		this.setNomMairie(nomMairie);
	}
	public Mariage(){}

	public void afficher() {
		 System.out.println(this.toString());
	}
	

	public Citoyen getCitoyen1() {
		return citoyen1;
	}

	public void setCitoyen1(Citoyen citoyen1) {
		this.citoyen1 = citoyen1;
	}

	public Citoyen getCitoyen2() {
		return citoyen2;
	}

	public void setCitoyen2(Citoyen citoyen2) {
		this.citoyen2 = citoyen2;
	}

	@Override
	public String toString() {
		
	    String infoEvent=super.toString();
		return "Mariage\n" + citoyen1.getNom() +" et " + citoyen2.getNom() +"\n"+infoEvent;
	}
	
	 
	 
}
