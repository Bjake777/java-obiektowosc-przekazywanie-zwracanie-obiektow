package zadanie3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean czyKontynuowac = true;
        int wybor;

        int idSamolotu = 0;

        Scanner scanner = new Scanner(System.in);
        RepozytoriumLotow repozytoriumLotow;
        RepozytoriumSamolotow repozytoriumSamolotow;

        System.out.println("Ile samolotow chcesz przechowywac?");
        wybor =scanner.nextInt();
        repozytoriumSamolotow = new RepozytoriumSamolotow(wybor);

        System.out.println("Ile lotów chcesz przechowywac?");
        wybor = scanner.nextInt();
        repozytoriumLotow = new RepozytoriumLotow(wybor);

        while (czyKontynuowac){
            System.out.println("jaką operację chcesz wykonać?");
            System.out.println("dodać rejs? wciśnij '1'");
            System.out.println("wyświetlić informacje o wszystkich rejsach? wcisnij '2'");
            System.out.println("dodac samolot? wcisnij '3'");
            System.out.println("wyswietlic informacje o wszystki samolotach? wcisnij '4'");

            wybor = scanner.nextInt();
            if(wybor==3){
                Samolot samolot = new Samolot(idSamolotu);
                repozytoriumSamolotow.dodajSamolot(samolot);
                idSamolotu++;
            }
            if(wybor == 1){
                int godzinaPrzylotu = 0;
                int godzinaOdlotu = 0;
                System.out.println("podaj godzine odlotu");
                godzinaOdlotu = scanner.nextInt();
                System.out.println("podaj godzine przylotu");
                godzinaPrzylotu = scanner.nextInt();
                System.out.println("podaj id samolotu");
                wybor = scanner.nextInt();
                Samolot samolot = repozytoriumSamolotow.wyszukajSamolot(wybor);
                Lot lot = new Lot(godzinaOdlotu, godzinaPrzylotu, samolot);
                repozytoriumLotow.dodajLot(lot);
            }
            if (wybor == 2){
                repozytoriumLotow.wyswietlWszystkieLoty();
            }
            if (wybor == 4){
                repozytoriumSamolotow.wyswietlWszystkieSamoloty();
            }
        }

    }
}
