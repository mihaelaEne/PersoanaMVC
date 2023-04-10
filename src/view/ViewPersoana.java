package view;

import controller.PersoanaController;
import model.Persoana;

import java.util.Scanner;

public class ViewPersoana {

    private PersoanaController persoanaController;
    private Scanner scanner;


    public ViewPersoana() {
        persoanaController = new PersoanaController();
        scanner = new Scanner(System.in);
        play();
    }

    public void meniu() {
        System.out.println("Apasa 1 pt a afisa toate persoanele");
        System.out.println("Apasa 2 pt a adauga o persoana");
        System.out.println("Apasa 3 pt a sterge o  persoana");
        System.out.println("Apasa 4 pt a modifica o  persoana");


    }


    public void play() {
        persoanaController.load();
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:
                    persoanaController.afisarePersoana();
                    break;
                case 2:
                    adaugarePersoana();
                    break;
                case 3:
                    stergerePersoana();
                    break;
                case 4:
                    updatePersoana();
                default:
                    System.out.println("Alegere gresita");
                    break;

            }
        }
    }

    private void adaugarePersoana() {
        System.out.println("Introduceti numele pers:");
        String nume = scanner.nextLine();
        System.out.println("Introduceti CNP-ul pers:");
        int CNP = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti varsta pers:");
        int varsta = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti adresa:");
        String adresa = scanner.nextLine();
        System.out.println("Introduceti tara actuala in care traieste:");
        String taraActualaInCareTraieste = scanner.nextLine();
        System.out.println("Introduceti limba vorbita: ");
        String limba = scanner.nextLine();

        Persoana persoana = persoanaController.findByCNP(CNP);
        if (persoana == null) {
            Persoana pNou = new Persoana(nume,CNP,varsta,adresa, taraActualaInCareTraieste, limba);
            persoanaController.addPersoana(pNou);
        } else {
            System.out.println("Persoana exista deja");
        }
    }

    private void stergerePersoana() {
        System.out.println("Introduceti CNP-ul pers");
        int CNP = Integer.parseInt(scanner.nextLine());

        Persoana persoana = persoanaController.findByCNP(CNP);
        if (persoana == null) {
            System.out.println("Nu exista o pers cu CNP-ul introdus");
        } else {
            persoanaController.removePersoana(persoana);
            System.out.println("Persoana a fost stearsa");
        }

    }

    private void updatePersoana() {
        System.out.println("Introduceti numele pers");
        String nume = scanner.nextLine();

        Persoana persoana = persoanaController.findByNume(nume);

        if (persoana == null) {
            System.out.println("Nu exista o pers cu numele introdus");
        } else {
            System.out.println("Introdu cu virgula ce doresti sa modifici:nume,limba,adresa");

            String[] upd = scanner.nextLine().split(",");

            Persoana nou = new Persoana();

            nou.setNume(persoana.getNume());

            for (int i = 0; i < upd.length; i++) {
                switch (upd[i]) {
                    case "nume":
                        System.out.println("Introduceti noul nume:");
                        String numee = scanner.nextLine();
                        break;
                    case "limba":
                        System.out.println("Introduceti noua limba vb");
                        String limba = scanner.nextLine();
                        break;

                    case "adresa":
                        System.out.println("Introduceti noua adresa: ");
                        String locatieActuala = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Alegere gresita");

                }
            }
            persoanaController.update(nou);
        }

    }


}
