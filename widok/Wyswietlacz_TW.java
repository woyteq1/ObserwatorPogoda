package widok;

import dane.Obserwator;
import dane.ObserwowalnyCzujnikPogodowy;

public class Wyswietlacz_TW implements Obserwator, ElementWyswietlajacy {

    private float temperatura;
    private float wilgotnosc;

    private ObserwowalnyCzujnikPogodowy czujnik;


    public Wyswietlacz_TW(ObserwowalnyCzujnikPogodowy czujnik) {
        this.czujnik = czujnik;
        czujnik.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("warunki biezace " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotnosc");
    }

}
