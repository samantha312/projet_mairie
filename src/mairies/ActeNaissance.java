package mairies;

public class ActeNaissance {

	private Citoyen citoyen;
	private Deces deces;
	private Mariage mariage;
	private Divorce divorce;
	private Naissance naissance;
	
	public ActeNaissance() {}
	public ActeNaissance(Citoyen citoyen, Deces dece, Mariage mariage, Divorce divorce,Naissance naissance) {
		
		this.citoyen = citoyen;
		this.deces = deces;
		this.mariage = mariage;
		this.divorce = divorce;
		this.naissance=naissance;
	}


	public Citoyen getCitoyen() {
		return citoyen;
	}


	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}


	public Deces getDece() {
		return deces;
	}


	public void setDece(Deces dece) {
		this.deces = dece;
	}


	public Mariage getMariage() {
		return mariage;
	}


	public void setMariage(Mariage mariage) {
		this.mariage = mariage;
	}


	public Divorce getDivorce() {
		return divorce;
	}


	public void setDivorce(Divorce divorce) {
		this.divorce = divorce;
	}

	public Naissance getNaissance() {
		return naissance;
	}

	public void setNaissance(Naissance naissance) {
		this.naissance = naissance;
	}

	@Override
	public String toString() {
		return "ActeNaissance "+ citoyen + "\n dece=" + deces + "\n mariage=" + mariage + "\n divorce=" + divorce
				+ "\n naissance=" + naissance ;
	}


	
	
}
