package mairies;

public class Naissance  extends Evenement{
	
	private Citoyen citoyen;
	private int idParent1;
	private int idParent2;
	
	
	public Naissance(Citoyen citoyen, int idParent1, int idParent2,Date date,String lieu,String nomMairie) {
		
		this.citoyen = citoyen;
		this.idParent1 = idParent1;
		this.idParent2 = idParent2;
		this.setDate(date);
		this.setLieu(lieu);
		this.setNomMairie(nomMairie);
		this.setMetier("Neant");
	}
	
	
	public Naissance() 
	{
		
	}
	
	public void afficher() {
		System.out.println("id parent1= "+this.idParent1 +" id Parent2= "+this.idParent2
		   +"Citoyen ="+citoyen.getNom()+ "  date= "+this.getDate()
		);
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}

	public int getIdParent1() {
		return idParent1;
	}

	public void setIdParent1(int idParent1) {
		this.idParent1 = idParent1;
	}

	public int getIdParent2() {
		return idParent2;
	}

	public void setIdParent2(int idParent2) {
		this.idParent2 = idParent2;
	}
	
	@Override
	public String toString() {
		return "Naissance [citoyen=" + citoyen + ", idParent1=" + idParent1 + ", idParent2=" + idParent2 + "]";
	}
	
}
