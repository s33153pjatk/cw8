public class Lew extends Ssak {
    private String grzywaKolor;

    public Lew(String nazwa, int wiek, String grzywaKolor) {
        super(nazwa, wiek);
        this.grzywaKolor = grzywaKolor;
    }

    @Override
    public String wydajDzwiek() {
        return "Ryk!";
    }

    @Override
    public String przemieszczajSie() {
        return "Biega po sawannie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna";
    }
}
