public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public abstract String wydajDzwiek();
    public abstract String przemieszczajSie();
    public abstract String srodowiskoNaturalne();

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa + ", Wiek: " + wiek);
        System.out.println("Dźwięk: " + wydajDzwiek());
        System.out.println("Poruszanie się: " + przemieszczajSie());
        System.out.println("Środowisko naturalne: " + srodowiskoNaturalne());
    }
}
