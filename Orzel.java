public class Orzel extends Ptak {
    private double rozpiętośćSkrzydeł;

    public Orzel(String nazwa, int wiek, double rozpiętośćSkrzydeł) {
        super(nazwa, wiek);
        this.rozpiętośćSkrzydeł = rozpiętośćSkrzydeł;
    }

    @Override
    public String wydajDzwiek() {
        return "Pisk!";
    }

    @Override
    public String przemieszczajSie() {
        return "Lata wysoko nad górami";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i lasy";
    }
}
