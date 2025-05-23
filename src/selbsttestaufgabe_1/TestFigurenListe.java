package src.selbsttestaufgabe_1;

public class TestFigurenListe {



    public static void main (String[] args) {
        FigurenListe fl1 = new FigurenListe();
        Kreis k1 = new Kreis();
        k1.anzeigen();
        fl1.figurAnfuegen(k1);
        fl1.alleAnzeigen();
        fl1.figurAnfuegen(new Rechteck());
        fl1.alleAnzeigen();
        System.out.print("Letzte Figur: ");
        fl1.letzteFigurAuslesen().anzeigen();
    }
}
