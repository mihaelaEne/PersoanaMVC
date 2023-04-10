package controller;

import model.Persoana;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PersoanaController {

    private ArrayList<Persoana> persoane;

    public PersoanaController(){

        this.persoane= new ArrayList<>();

        this.load();
    }

    public PersoanaController(ArrayList<Persoana>persoane){
        this.persoane=persoane;
    }
    public void load(){
   try{
       File file=new File("C:\\mycode\\OOP\\incapsularea\\Persoana\\src\\data\\persoana.txt");
       Scanner scanner=new Scanner(file);
       while(scanner.hasNextLine()){
           Persoana persoana=new Persoana(scanner.nextLine());
           this.persoane.add(persoana);
       }
   }catch (Exception e){
       e.printStackTrace();
   }

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


    public Persoana findByCNP(int CNP){
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
        Persoana deUpdatat=findByCNP(persoana.getCNP());

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
