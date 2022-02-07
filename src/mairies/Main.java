package mairies;

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Registre r=new Registre();
		Scanner entrer=new Scanner(System.in);
		Citoyen p=new Citoyen();
		boolean valid=true;
		
		do{
			Main.afficherMenu();
			System.out.println("Entrez votre choix entre 0 et 13\n");
			int choix=entrer.nextInt();
			switch(choix) {
			
			        case 1:
			        	 try {
	                          r.mariage();
	                         
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 2:
			        	 try {
                          r.divorce();
                          
                          
                          
			        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
			        	break;
			        case 3:
			        	 try {
	                          r.naissance();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 4:
			        	 try {
	                          r.etatCivilPersonne();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 5:
			        	 try {
	                          r.afficher();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 6:
			        	 try {
	                          r.afficherMariages();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 7:
			        	 try {
	                          r.afficherDivorces();
	                          
	                         
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        	
			        case 8:
			        	 try {
	                          r.afficherNaissances();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 9:
			        	 try {
	                          r.afficherDeces();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        	
			        case 10:
			        	 try {
	                          r.afficherActeNaissance();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 11:
			        	 try {
	                          r.deces();
	                          
	                          
				        	 }catch(ExceptionMairie e) {System.out.println(e.getMessage());}
				        	break;
			        case 12:
			       
	                       r.saisirPersonne();
	                       
	                     
				        	
				        	break;
			        	
			        case 13:
			        	valid=false;
			        	System.out.println("Exit programme");
			        	System.out.println("Au revoir ");
			        	break;
			        	
			        default:
			        	System.out.println("Une erreur de choix\n");
			        	
			}
			
		}while(valid);
		entrer.close();
		
	}
	
	public static void afficherMenu() {
		System.out.println("********* Bienvenue *********\n"
				+" Veuillez choisir une option du menu :\n"
				+ " 1  Mariage\n"
				+ " 2  Divorce \n"
				+ " 3  Naissance \n"
				+ " 4  Afficher Etat Civil \n"
				+ " 5  Afficher la liste des citoyens \n"
				+ " 6  Afficher la liste des mariages \n"
				+ " 7  Afficher la liste des divorces \n"
				+ " 8  Afficher la liste des naissances \n"
				+ " 9  Afficher la liste des décès \n"
				+ " 10 Afficher l'acte de naissance \n"
				+ " 11 Declarer un décès\n"
				+ " 12 Saisir une personne \n"
				+ " 13 Quitter le programme"
				
				);
	}

}
