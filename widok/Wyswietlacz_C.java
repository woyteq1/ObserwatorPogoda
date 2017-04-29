package widok;

import dane.Obserwator;
import dane.ObserwowalnyCzujnikPogodowy;

public class Wyswietlacz_C implements Obserwator, ElementWyswietlajacy {

    private float cisnienie;

    private ObserwowalnyCzujnikPogodowy czujnik;


    public Wyswietlacz_C(ObserwowalnyCzujnikPogodowy czujnik) {
        this.czujnik = czujnik;
        czujnik.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.cisnienie = cisnienie;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("cisnienie " + cisnienie);
    }

}
