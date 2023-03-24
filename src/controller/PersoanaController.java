package controller;

import model.Persoana;

import java.util.ArrayList;

public class PersoanaController {

    private ArrayList<Persoana> persoane;

    public PersoanaController(){

        this.persoane= new ArrayList<>();

        this.load();
    }

    public void load(){
        Persoana p1=new Persoana("Mihaela", 123,20,"Panselelor","Romania", "romana");
        Persoana p2=new Persoana("Maria", 456,21,"TEST Street","UK", "engleza");
        Persoana p3=new Persoana("Alex", 789,22,"teest Street","Canada", "franceza");


        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);


    }

    public void afisarePersoana(){
        for(int i=0; i<persoane.size(); i++){
            System.out.println(this.persoane.get(i).descrierePersoana());
            System.out.println("\n");
        }
    }


    public void addPersoana(Persoana persoana){
        this.persoane.add(persoana);
    }

    public void removePersoana(Persoana persoana){
        this.persoane.remove(persoana);
    }


    public Persoana findAnimalByCNP(int CNP){
        for(int i=0; i<this.persoane.size(); i++) {
            if(persoane.get(i).getCNP()==CNP){
                return persoane.get(i);
            }
        }
        return null;
    }



    public Persoana findByNume(String nume){
        for(int i=0; i<this.persoane.size(); i++){
            if(persoane.get(i).getNume().equals(nume)){
                if(persoane.get(i).getNume().equals(nume)){
                    return persoane.get(i);
                }
            }
        }
        return null;
    }

    public void update(Persoana persoana){
        Persoana deUpdatat=findAnimalByCNP(persoana.getCNP());

        if(persoana.getNume()!=null){
            deUpdatat.setNume(persoana.getNume());
        }
        if(persoana.getLimba()!=null){
            deUpdatat.setLimba(persoana.getLimba());
        }
        if(persoana.getAdresa()!=null){
            deUpdatat.setAdresa(persoana.getAdresa());
        }
    }




}
