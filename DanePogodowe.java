import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private ArrayList<Obserwator> obserwatorzy;
	private float temperatura;
	private float wilgotnosc;
	private float cisnienie;

	public DanePogodowe() {
		obserwatorzy = new ArrayList<Obserwator>();
	}

	public void zarejestrujObserwatora(Obserwator obserwator) {
		obserwatorzy.add(obserwator);
	}

	public void usunObserwatora(Obserwator obserwator) {
		int i = obserwatorzy.indexOf(obserwator);
		if (i >= 0) {
			obserwatorzy.remove(i);
		}
	}

	public void powiadomObserwatorow() {
		for (int i = 0; i < obserwatorzy.size(); i++) {
			Obserwator obs = (Obserwator) obserwatorzy.get(i);
			obs.aktualizacja(temperatura, wilgotnosc, cisnienie);
		}
	}

	public void odczytyZmiana() {

		powiadomObserwatorow();

	}

	public void ustawOdczyt(float temperatura, float wilgotnosc, float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotnosc;
		this.cisnienie = cisnienie;
		odczytyZmiana();
	}

}
