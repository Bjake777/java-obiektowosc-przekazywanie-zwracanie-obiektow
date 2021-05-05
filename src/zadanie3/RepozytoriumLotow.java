package zadanie3;

public class RepozytoriumLotow {
    Lot[] loty;
    int indeks = 0;
    public RepozytoriumLotow(int wielkoscRepo) {
        loty = new Lot[wielkoscRepo];
    }

    public void dodajLot(Lot lot){
        if(indeks < loty.length) {
            loty[indeks++] = lot;
        }
        System.out.println("flaga");
    }

    public void wyswietlWszystkieLoty() {
        for (int i = 0; i < indeks; i++) {
            loty[i].wyswietlLot();
        }
    }
}
