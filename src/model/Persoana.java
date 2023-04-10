package model;

public class Persoana {

     private String nume;
     private int CNP;
     private int varsta;
     private String adresa;
     private String taraActualaInCareTraieste;
     private String limba;



     public Persoana(){}
     public Persoana(String nume, int CNP, int varsta, String adresa, String taraActualaInCareTraieste, String limba){
          this.nume=nume;
          this.CNP=CNP;
          this.varsta=varsta;
          this.adresa=adresa;
          this.taraActualaInCareTraieste=taraActualaInCareTraieste;
          this.limba=limba;
     }

     public String getNume() {
          return nume;
     }

     public void setNume(String nume) {
          this.nume = nume;
     }

     public int getVarsta() {
          return varsta;
     }

     public void setVarsta(int varsta) {
          this.varsta = varsta;
     }

     public String getAdresa() {
          return adresa;
     }

     public void setAdresa(String adresa) {
          this.adresa = adresa;
     }

     public String getTaraActualaInCareTraieste() {
          return taraActualaInCareTraieste;
     }

     public void setTaraActualaInCareTraieste(String taraActualaInCareTraieste) {
          this.taraActualaInCareTraieste = taraActualaInCareTraieste;
     }

     public String getLimba() {
          return limba;
     }

     public void setLimba(String limba) {
          this.limba = limba;
     }

     public int getCNP() {
          return CNP;
     }


     public Persoana(String prop){
          String [] split= prop.split(",");
          this.nume=split[0];
          this.CNP=Integer.parseInt(split[1]);
          this.varsta=Integer.parseInt(split[2]);
          this.adresa=split[3];
          this.taraActualaInCareTraieste=split[4];
          this.limba=split[5];




     }

     public String descrierePersoana(){
          String text="";
          text+="Numele este: "+this.nume+"\n";
          text+="CNP: "+this.CNP+"\n";
          text+="Varsta: "+this.varsta+"\n";
          text+="Adresa actuala: "+this.adresa+"\n";
          text+="Tara in care locuieste in prezent: "+this.taraActualaInCareTraieste+"\n";
          text+="Limba pe care alege sa o vorbeasca in "+this.taraActualaInCareTraieste+" este: "+this.limba+"\n";
          return text;
     }

}
