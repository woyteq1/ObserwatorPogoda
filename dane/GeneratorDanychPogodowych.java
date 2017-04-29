package dane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorDanychPogodowych implements ObserwowalnyCzujnikPogodowy {

    private List<Obserwator> obserwatorzy;

    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public GeneratorDanychPogodowych() {
        obserwatorzy = new ArrayList<>();
    }

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        int i = obserwatorzy.indexOf(obserwator);
        if (i >= 0) {
            obserwatorzy.remove(i);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        obserwatorzy.forEach(obserwator -> obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie));
    }

    public void uruchomGenerator() {
        for (int x = 1; x <= 10; x++) {
            System.out.println("** odczyt " + x);
            this.temperatura = new Random().nextFloat()*100;
            this.wilgotnosc = new Random().nextFloat()*100;
            this.cisnienie = new Random().nextFloat()*1000;
            powiadomObserwatorow();
        }
    }

}
