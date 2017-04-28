public class StacjaMeteo {

	public static void main(String[] args) {

		DanePogodowe danePogodowe = new DanePogodowe();
		WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);

		danePogodowe.ustawOdczyt(29.9f, 70, 1010.10f);
		danePogodowe.ustawOdczyt(31.2f, 80, 999.9f);
		danePogodowe.ustawOdczyt(22.2f, 90, 950);
	}

}
