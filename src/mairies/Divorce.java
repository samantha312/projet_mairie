package mairies;

public class Divorce extends Evenement {
	
	private Citoyen citoyen;

	public Divorce(Citoyen citoyen,Date date,String lieu,String nomMairie) {
		
		this.citoyen = citoyen;
		this.setNomMairie(nomMairie);
		this.setDate(date);
		this.setLieu(lieu);
	}
	
	public Divorce() {}
	
	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	

	@Override
	public String toString() {
		String event=super.toString();
		return "Divorce" + citoyen +event;
	}
	



}
