package zadanie3;

public class Lot {
    int godzinaOdlotu;
    int godzinaPrzylotu;
    Samolot samolot;

    public Lot(int godzinaOdlotu, int godzinaPrzylotu, Samolot samolot) {
        this.godzinaOdlotu = godzinaOdlotu;
        this.godzinaPrzylotu = godzinaPrzylotu;
        this.samolot = samolot;
    }

    public void wyswietlLot(){
        System.out.println("godzina odlotu: "+godzinaOdlotu+ " godzina przylotu: "+godzinaPrzylotu+" id samolotu: "+samolot.idSamolotu);
    }


}
