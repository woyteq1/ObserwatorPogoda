package dane;

public interface ObserwowalnyCzujnikPogodowy {
	void zarejestrujObserwatora(Obserwator obserwator);
	void usunObserwatora(Obserwator obserwator);
	void powiadomObserwatorow();
}
