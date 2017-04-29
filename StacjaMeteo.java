import dane.GeneratorDanychPogodowych;
import widok.Wyswietlacz_C;
import widok.Wyswietlacz_TW;

public class  StacjaMeteo {

	public static void main(String[] args) {
		GeneratorDanychPogodowych generatorDanychPogodowych = new GeneratorDanychPogodowych();

		new Wyswietlacz_TW(generatorDanychPogodowych);
		new Wyswietlacz_C(generatorDanychPogodowych);

		generatorDanychPogodowych.uruchomGenerator();
	}

}
