public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zoo = {
                new Lew("Simba", 5, "Złota"),
                new Orzel("Biały Orzeł", 3, 2.1),
                new Waz("Kaa", 2, true)
        };

        for (Zwierze z : zoo) {
            z.wyswietlInformacje();
            System.out.println("--------");
        }
    }
}
