public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement {
	private float temperatura;
	private float wilgotnosc;
	private Podmiot danePogodowe;

	

	public WarunkiBiezaceWyswietl(DanePogodowe danePogodowe) {
		
			this.danePogodowe = danePogodowe;
			danePogodowe.zarejestrujObserwatora(this);
		
	}

	@Override
	public void aktualizacja(float temperatura, float wilgotnosc,
			float cisnienie) {
		this.temperatura = temperatura;
		this.wilgotnosc = wilgotnosc;
		wyswietl();
	}

	@Override
	public void wyswietl() {
		System.out.println("warunki biezace " + temperatura + " stopni C oraz "
				+ wilgotnosc + "% wilgotnosc");
	}

}
