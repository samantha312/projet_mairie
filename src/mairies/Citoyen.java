package mairies;

import java.util.*;

public class Citoyen extends Personne{

	
	public List <Citoyen> enfants=new ArrayList<Citoyen>();
	public List <Citoyen> conjointlistes=new ArrayList<Citoyen>();
	public ArrayList<Mariage> mariages;
	
	
	public Citoyen(int id, String nom, String prenom,Date date,
			String sexe, String etatCivil,String nomUsage){
			this.setId(id);
			this.setNom(nom);
			this.setPrenom(prenom);
			this.setDate(date);
			this.setSexe(sexe);
			this.setEtatCivil("célibataire");
			this.setNomUsage(nomUsage);
			mariages = new ArrayList<Mariage>();
			
	}
	public void afficher() {
		 System.out.println("***********Citoyen info ***************");
		 
		 System.out.println("nom = "+this.getNom()+" id= "+ this.getId()
		         +"etat civile= "+this.getEtatCivil()+"id conjoint= "+
				 this.getIdConjoint()+"date naissance= "+this.getDate()
		   );
		 
		 System.out.println("*************liste mari(e)s*************");
		 System.out.println(this.conjointlistes.toString());
		 System.out.println("************liste enfant(s)**************");
		 System.out.println(this.enfants.toString());
	}
	
	public Citoyen(int id, String nom, String prenom,Date date,
			String sexe){
			this.setId(id);
			this.setNom(nom);
			this.setPrenom(prenom);
			this.setDate(date);
			this.setSexe(sexe);	
	}
	public  Citoyen() {}

	public List<Citoyen> getEnfant() {
		return enfants;
	}

	public void setEnfant(Citoyen enfant) {
		this.enfants.add(enfant);
	}

	public List<Citoyen> getConjointlistes() {
		return conjointlistes;
	}

	public void setConjointlistes(Citoyen citoyen) {
		this.conjointlistes.add(citoyen);
	}

	@Override
	public String toString() {
		String citoyen=super.toString();
		return "Citoyen "+citoyen;
	}
	public String setLieu(String lieu) {
		return lieu;
		
	}

	
	
}
