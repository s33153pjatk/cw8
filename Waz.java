public class Waz extends Gad {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "Syczy!";
    }

    @Override
    public String przemieszczajSie() {
        return "Pełza po ziemi";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla i pustynia";
    }
}
