package mairies;

public class Date {
	 
	public String date;
	public String jour;
	public String mois;
	public String annee;
	
      // format  jour/mois/annéé
	public Date(String date) {
	    
	     if(date.split("/").length==3){
	    	 this.date=date;
			 this.jour=date.split("/")[0];
			 this.mois=date.split("/")[1];
			 this.annee=date.split("/")[2];
	     }else {
	    	 this.jour="";
	    	 this.mois="";
	    	 this.annee="";
	     }
	}

    public boolean dateValid() {
    	
    	  String j[]= new String[2];
    	  String m[]= new String[2];
    	  String a[]= new String[4];
    	  j=this.jour.split("");
    	  m=this.mois.split("");
    	  a=this.annee.split("");
    	  if( (j.length!=2 || m.length!=2) || a.length !=4 ){
    		  return false;
    	  }else {
    		  return true;
    	  }
    	  
    }
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public String getMois() {
		return mois;
	}


	public void setMois(String mois) {
		this.mois = mois;
	}


	public String getAnnee() {
		return annee;
	}


	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String toString() {
		 return this.date;
	}

}
