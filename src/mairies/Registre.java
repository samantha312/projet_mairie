package mairies;
import java.util.Scanner;

public class Registre {
    
    Scanner entrer= new Scanner(System.in);
    public Citoyen citoyen;
    public Mairie mairie;
    
   
 
	public void afficher()throws ExceptionMairie  {
		
		for(Citoyen p: this.mairie.getCitoyens()) {
			
			  System.out.println(p);
	    }
    	int nbhabitant = mairie.citoyens.size();				
		System.out.println("Le nombre d'habitants de la ville est "+nbhabitant);
		
		if(this.mairie.getCitoyens().size()==0){
			throw new ExceptionMairie("Aucun enregistrement");
		}
		
	}
	
	
	public void divorce() throws ExceptionMairie {
		
		 boolean valid=true;
	     System.out.println("Entrez l'identifiant de la personne réclamant le divorce");
		 int id=entrer.nextInt();
		 Citoyen p=this.rechercher(id);
		 Citoyen p2;
		 
		
	     if(p==null) {
	    	  throw new ExceptionMairie("Cette personne n'existe pas");
	     }else{
	    	 
	    	 if(p.getIdConjoint()==0) {
	    		 
	    		  throw new ExceptionMairie("Cette personne ne s'est pas mariée");
	    	 }else {
	    		 

			     System.out.println("Voulez vous changer nom d'usage? oui/non");
			     String u=entrer.next();
			     if(u=="oui") {
			    	 
			    	  if(p.getSexe()=="f" || p.getSexe()=="F") {
			    		     
			    		    Citoyen c;
				    	    for(int i=0;i<this.mairie.naissances.size();i++) {
				    	    	     c=this.mairie.naissances.get(i).getCitoyen();
				    	    	     
				    	    	     if(c.getId()==p.getId()) {
				    	    	    	   p.setNomUsage(c.getNom());
				    	    	     }
				    	    }
			    	  }
			    	  	 
			     }
	    		  
	    		  //initialiser idConjoint(e) mari(e);
	    		  p.setEtatCivil("Divorcé");
	    		  p2=this.rechercher(p.getIdConjoint());
	    		  p2.setEtatCivil("Divorcé");
	    		  p2.setIdConjoint(0);
	    		  p.setIdConjoint(0);
	    		  
	    		  
	    		  System.out.println("Entrez la date de divorce :");
	    		  
	    		  String d=entrer.next();
	    		  Date date=new Date(d);
                  System.out.println("Entrez le lieu du divorce :");
                  String lieu=entrer.next();
	    		  p.setLieu(lieu);
	    		 
	    		 
	    		  
	    		  do {
	    			  if(date.dateValid()){ 
		    			  this.mairie.setDivorces(new Divorce(p,date,lieu,this.mairie.getNom()));
					      System.out.println(p);
					      valid=false;
					      
					      for(int i=0;i<this.mairie.mariages.size();i++){
					    	   
					    	    Mariage m=this.mairie.mariages.get(i);
					    	    if(m.getCitoyen1().getId()==p.getId() || m.getCitoyen2().getId()==p.getId()) {
					    		       this.mairie.mariages.remove(i);
					    	    }
					      }
					     
		    		  }else {
		    			  throw new ExceptionMairie("Veuillez respecter le format : jour(xx)/mois(xx)/année(xxxx)");
		    		  }
	    		  }while(valid);
	    		  
	    		  
	    	 }
	    	 
	     }
	     	 
	}
	
	public void mariage() throws ExceptionMairie{
		
	     System.out.println("Entrez l'identifiant de l'époux(se) :");
		 int idMarie=entrer.nextInt();
		 System.out.println("Entrez l'identifiant de l'époux(se) :");
		 int idMari=entrer.nextInt();
	
		 Citoyen marie=this.rechercher(idMarie);
		 Citoyen  mari=this.rechercher(idMari);
		 
		 boolean validMarie=true;
		 boolean validMari=true;
		 
			  if(marie==null || mari==null) {
				  
				 if(marie==null) {
					 
					  throw new ExceptionMairie("L'époux(se) n'existe pas avec l'identifiant "+idMarie);
					 
				 }
				 if(mari==null) {
					 
					  throw new ExceptionMairie("L'époux(se) n'existe pas avec l'identifiant "+idMari);
				 } 
				  
			  }else {
				    
				     if(marie.getIdConjoint()==0){
						 validMarie=false;
				     }else {
				     
				        throw new ExceptionMairie("Cette personne est déja mariée avec le citoyen id = "+idMarie);
				     }
				     
				     if(mari.getIdConjoint()==0){
						 validMari=false;
				     }else {
				    	  throw new ExceptionMairie("Cette personne est déja mariée  avec le citoyen id = "+idMari);
				        
				     }
				     
				     if(validMari==false && validMarie==false){
				    	 
				    	 marie.setEtatCivil("Mariée");
				    	 mari.setEtatCivil("Marié");
				    	 marie.setNomUsage(mari.getNom());
				    	 
				    	 
				    	 marie.setIdConjoint(mari.getId());
				    	 mari.setIdConjoint(marie.getId());
				    	 
				    	 marie.setConjointlistes(mari);
				    	 mari.setConjointlistes(marie);
				    	 
				    	 
				    	 System.out.println("Entrez le lieu de mariage : ");
				    	 String lieu=entrer.next();
				    	 
				    	 System.out.println("Entrez la date de mariage: ");
				    	 String date=entrer.next();
				    	 
				    	
				    
				    	 Mariage mariage=new Mariage(mari,marie,new Date(date),lieu,this.mairie.getNom());
				    	 this.mairie.mariages.add(mariage);
				    	 marie.setNomUsage(mari.getNom());
				         
						 System.out.println(mari.getNom()+" et "+ marie.getNom()+" sont déclarés marié le "+date +" à "+lieu);  
				    }
			  }
   
	}
	
	public void naissance() throws ExceptionMairie{
	 
	
		boolean idPereValid=true;
		boolean idMereValid=true;
		boolean lieuValid=true;
		
		
		Naissance naissance= new Naissance();
		Citoyen citoyen=new Citoyen();
	    //id Pere ET Mere
			 do{
				  System.out.println("Entrez l'identifiant du  pere");
				  int idPere=entrer.nextInt();
				  if(idPere<0) {
					  
					  throw new ExceptionMairie("Erreur => veuillez entrer un identifiant valide");
					  
				  }else {
					  idPereValid=false;
					  naissance.setIdParent1(idPere);
				   }
				  
		     }while(idPereValid);
			 

			    //id mere
			 do {
				  System.out.println("Entrez l'identifiant de la mère ");
				  int idMere=entrer.nextInt();
				  if(idMere<0) {
					  throw new ExceptionMairie("Erreur => veuillez entrer un id valide");
				  }else {
					  idMereValid=false;
					  naissance.setIdParent2(idMere);
				  }
				  
		   }while(idMereValid);
			 
			   //lieu
			 do {
				  System.out.println("Entrez le lieu de naissance : ");
				  String lieu=entrer.next();
				  if(lieu.length()>0) {
					  lieuValid=false;
					  naissance.setLieu(lieu);
				  }
				  
		   }while(lieuValid);
			   
		    citoyen=this.saisir(citoyen);
		    naissance.setDate(citoyen.getDate());
		    naissance.setNomMairie(this.mairie.getNom());
		    this.mairie.citoyens.add(citoyen);
		    naissance.setCitoyen(citoyen);
		    this.mairie.naissances.add(naissance);
		     
	}
	
	public void etatCivilPersonne() throws ExceptionMairie{

	     System.out.println("Entrez l'identifiant d'une personne pour connaitre son état civil");
		 int id=entrer.nextInt();
		 Personne p=this.rechercher(id);
		 if(p==null) {
			  
               throw new ExceptionMairie("Erreur => Cette personne n'existe pas");
		 }else {
			 System.out.println(p);
		 }
	}
	
	public Citoyen rechercher(int id) {
		
		 
		 for(Citoyen p: this.mairie.getCitoyens()) {
			   
			   if(id==p.getId()){
				   
				   return p;
			    }   
		  }
		 
		 return null;
		
	}
	
	
	public Citoyen saisir(Citoyen p){
			
				
			boolean nomValid=true;
			boolean prenomValid=true;
			boolean dateValid=true;
			boolean sexeValid=true;
			boolean etatCivilValid=true;
			
			do {
				  System.out.print("Entrez le nom : ");
				  String nom=entrer.next();
				   
				  if(nom.length()<2) {
					  System.out.println("Le nom doit etre composé de plus de caractère");
				  }else {
					  nomValid=false;
					  p.setNom(nom);
			}
				  
	    	 }while(nomValid);
			
			  //prenom de la personne
			 do {
				  System.out.print("Entrez le prénom : ");
				  String prenom=entrer.next();
				 
				  if(prenom.length()<2) {
					  System.out.println("Le prenom doit etre composé de plus de 2 caractères ");
				  }else {
					  prenomValid=false;
					  p.setPrenom(prenom);
				  }
				  
	  	      }while(prenomValid);
			  		
		     // date de naissance
			 
			 do{
		    	   System.out.print("Entrez la date de naissance : ");
				   String date=entrer.next();
				  Date dates=new Date(date);
				  if(!dates.dateValid()) {
					  System.out.print("Veuillez respecter le format : jour(xx)/mois(xx)/année(xxxx)");
				  }else {
					  
					  dateValid=false;
					  p.setDate(dates);
				  }
				  
	  	      }while(dateValid);
			 
			  //entrer sexe
			 
			 do {
				  System.out.println("Entrez le sexe : ");
				  String sexe=entrer.next();
				  
				  if(sexe.length()<1) {
					  System.out.print("Erreur => veuillez entrer sexe");
				  }else {
					  sexeValid=false;
					  p.setSexe(sexe);
				  }
				  
	  	     }while(sexeValid);
			 
			    //etat civil
			 do {
				  System.out.println("Entrez l'etat civil de la personne : ");
				   String etatCivil=entrer.next();
				  if(etatCivil.length()<0) {
					  System.out.print("Erreur => etat civil est trop court");
				  }else {
					  etatCivilValid=false;
					  p.setEtatCivil(etatCivil);
				  }
				  
	  	     }while(etatCivilValid);
			 do {
				  System.out.println("Entrez le nom d'usage de la personne : ");
				   String nomUsage=entrer.next();
				  if(nomUsage.length()<0) {
					  System.out.print("Erreur => le nom d'usage est trop court");
				  }else {
					  etatCivilValid=false;
					  p.setNomUsage(nomUsage);
				  }
				  
	  	     }while(etatCivilValid);
			
			 p.setId(this.mairie.getCitoyens().size()+1);
			 return p;
			        
		}
	
       public void afficherDivorces() throws ExceptionMairie {
		
		for(Divorce p: this.mairie.getDivorces()) {
			
			  System.out.println(p);
	    }
		
		if(this.mairie.getDivorces().size()==0){
			
			throw new ExceptionMairie("Aucun enregistrement de divorce");
		}
		
	  }
       
       public void deces() throws ExceptionMairie {
    	   
 
    	      boolean b=true;
    	      boolean c=true;
    	      
    	      Deces d=new Deces();
    	      Citoyen citoyen=new Citoyen();
    	      Citoyen conjoint=new Citoyen();
    	       //date
    	      do{
		    	   System.out.print("Entrez la date de décès : ");
		    	   
				   String date=entrer.next();
				  Date dates=new Date(date);
				  if(!dates.dateValid()) {
					  System.out.print("Veuillez respecter le format : jour(xx)/mois(xx)/année(xxxx)");
				  }else {
					  
					  c=false;
					  d.setDate(dates);
				  }
				  
	  	      }while(c);
    	       //id deces
    	      do{
    	    	   System.out.print("Entrez l'identifiant de la personne décédée : ");
    	    	   int id=entrer.nextInt();
    	    	   if(0<id) {
    	    		    b=false;
    	    		    if(this.rechercher(id)!=null) {
    	    		    	
    	    		    	 d.setCitoyen(this.rechercher(id));
    	    		    	 this.mairie.deces.add(d);
    	    		    	 citoyen.setConjointlistes(this.rechercher(id));
    	    		    	 System.out.println("Décès enregistré");
    	    		    	
    	    		    	 for(int i=0;i<citoyen.conjointlistes.size();i++){
    	    		    		   conjoint =citoyen.conjointlistes.get(i);
    	    		    		  
    	    		    		   if(conjoint.getId()==citoyen.getIdConjoint()) {
    	    		    			     if(conjoint.getSexe()=="f" || conjoint.getSexe()=="F") {
    	    		    			    	   this.mairie.citoyens.get(i).setEtatCivil("Veuve");
    	    		    			     }else {
    	    		    			    	  this.mairie.citoyens.get(i).setEtatCivil("Veuf");
    	    		    			     }
    	    		    			     
    	    		    		   }   
    	    		    	 }
    	    		        for(int k =0;k<this.mairie.citoyens.size();k++) {
    	    		        	
    	    		    	            Citoyen temp=this.mairie.citoyens.get(k);
    	    		    	            if(temp.getId()==id){
    	    		    	            	 this.mairie.citoyens.remove(k);	
    	    		    	            }
    	    		        }
    	    		          
    	    		       
    	    		    	 
    	    		    }else {
    	    		    	 throw new ExceptionMairie("Cet identfiant n'existe pas");	
    	    		    }
    	    		    
    	    		    
    	    	   }else {
    	    		   throw new ExceptionMairie("Cet identifiant n'existe pas");
    	    	   }
    	    	  
    	      }while(b);
    	      
       }
       
       public void afficherDeces() throws ExceptionMairie {
   		
   		for(Deces p: this.mairie.getDeces()) {
   			
   			  System.out.println(p);
   	    }
   		
   		if(this.mairie.getDeces().size()==0){
   			
   		  throw new ExceptionMairie("Aucun enregistrement de décè");
   		}
   		
   	  }
       
       
      public void afficherNaissances() throws ExceptionMairie {
      		
      		for(Naissance p: this.mairie.getNaissances()) {
      			
      			  System.out.println(p);
      	    }
      		
      		if(this.mairie.getNaissances().size()==0){
      			
      		  throw new ExceptionMairie("Aucun enregistrement de naissance");
      		}
      		
      }
      
      public void afficherMariages() throws ExceptionMairie {
    		
    		for(Mariage p: this.mairie.getMariages()) {
    			
    			  System.out.println(p);
    	    }
    		
    		if(this.mairie.getMariages().size()==0){
    			  throw new ExceptionMairie("Aucun enregistrement de mariage");
    		}		
       }
      
       public void afficherActeNaissance() throws ExceptionMairie {
          int nbrEnfant=0;
         
  	     System.out.println("Entrez l'identfiant d'une personne pour connaitre son acte de naissance :");
  	     
  		 int id=entrer.nextInt();
  		 Citoyen p=this.rechercher(id);
  		
  		 if(p==null) {
  			      throw new ExceptionMairie("Erreur => Cette personne n'existe pas");
  		 }else {
  			if(!p.getEnfant().isEmpty()) {
  				for(Citoyen e:p.getEnfant()) {
  					 nbrEnfant=nbrEnfant+1;
  				}
  			}  
  		 }
  		 
  		
  		 System.out.println("Nom ="+p.getNom()+ "\n Prenom ="+p.getPrenom()
  			 +"\n Etat civil = "+p.getEtatCivil()+" \n date de naissance ="+p.getDate()
  			 
  			);
  		
    }
     public void saisirPersonne(){
    	
    	    Citoyen c=new Citoyen();
    	    c=this.saisir(c);
    	    this.mairie.citoyens.add(c);
    	
     }
     
 			
}