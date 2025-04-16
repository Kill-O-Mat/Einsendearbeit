package e4;

public class Loewe extends Tier {

    private final int beine = 4;

    public void druckeEigenschaften() {
        super.setBeine(4);
        super.setGefaehrlich(true);
        super.druckeEigenschaften();
    }
}
