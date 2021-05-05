package zadanie3;

public class RepozytoriumSamolotow {
    Samolot[] samoloty;
    int iterator = 0;
    public RepozytoriumSamolotow(int iloscSamolotow) {
        samoloty = new Samolot[iloscSamolotow];
    }
    public void dodajSamolot(Samolot samolot){
       if(iterator<samoloty.length) {
           samoloty[iterator] = samolot;
           iterator++;
       }
    }

    public void wyswietlWszystkieSamoloty() {
        for (int i = 0; i < iterator; i++) {
            samoloty[i].wyswietlSamolot();
        }
    }

    public Samolot wyszukajSamolot(int idSamolotu) {
        for (int i = 0; i < iterator; i++) {
            if(samoloty[i].idSamolotu == idSamolotu ){
                return samoloty[i];
            }
        }
        return null;
    }

}
