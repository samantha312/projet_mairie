package mairies;

import java.util.ArrayList;
import java.util.List;

public class Mairie implements InterfaceAffichage{
     
	private int id;
	private String nom;
	public List<Citoyen> citoyens=new ArrayList<Citoyen>();
	public List<Deces> deces=new ArrayList<Deces>();
	public List<Divorce> divorces=new ArrayList<Divorce>();
	public List<Mariage> mariages=new ArrayList<Mariage>();
	public List<Naissance> naissances=new ArrayList<Naissance>();
   {
		Citoyen a=new Citoyen(1,"Macron","Emmanuel",new Date("21/12/1977"),"m","célibataire","Macron");
		Citoyen b=new Citoyen(2,"Trognieux","Brigitte",new Date("13/04/1952"),"m","celibataire","Trognieux");
		Citoyen c=new Citoyen(3,"Castex","Jean",new Date("25/06/1965"),"m","celibataire","Castex");
		Citoyen d=new Citoyen(4,"Philippe","Edouard",new Date("28/11/1970"),"m","celibataire","Philippe");
		Citoyen e=new Citoyen(5,"Blanquer","Jean-michel",new Date("04/12/1964"),"m","celibataire","Blanquer");
		
	    citoyens.add(a);
	 	citoyens.add(b);
	 	citoyens.add(c);
	 	citoyens.add(d);
	 	citoyens.add(e);
	}
	public Mairie(int id,String nom,Citoyen citoyen){
		this.nom = nom;
		this.id = id;
		this.citoyens.add(citoyen);
	}
	
    public Mairie() {
		
	}
	public Mairie(int id,String nom) {
		 this.id=id;
		 this.nom=nom;
	}
	
	public void afficher() {
		System.out.println("nom mairie "+nom+" id mairie"+ id);
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Citoyen> getCitoyens() {
		return citoyens;
	}

	public void setCitoyens(Citoyen citoyen) {
		this.citoyens.add(citoyen);
	}

	public List<Deces> getDeces() {
		return deces;
	}

	public void setDeces(Deces deces) {
		this.deces.add(deces);
	}

	public List<Divorce> getDivorces() {
		return divorces;
	}

	public void setDivorces(Divorce divorce) {
		this.divorces.add(divorce);
	}

	public List<Mariage> getMariages() {
		return mariages;
	}

	public void setMariages(Mariage mariage) {
		this.mariages.add(mariage);
	}

	public List<Naissance> getNaissances() {
		return naissances;
	}

	public void setNaissances(Naissance naissance) {
		this.naissances.add(naissance);
	}
	
	
}
