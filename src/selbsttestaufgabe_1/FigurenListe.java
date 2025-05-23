package src.selbsttestaufgabe_1;

import java.util.LinkedList;

public class FigurenListe {

    private LinkedList<Figur> liste;

    public FigurenListe() {
        liste = new LinkedList<>();
    }

    public void figurAnfuegen(Figur geoObj) {
        this.liste.add(geoObj);
    }
    public Figur letzteFigurAuslesen() {
        return this.liste.getLast();
    };

    public void alleAnzeigen() {
        for (Figur figur : liste) {
            figur.anzeigen();
        }
    }
}
