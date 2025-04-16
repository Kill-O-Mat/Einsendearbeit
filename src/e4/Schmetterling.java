package e4;

public class Schmetterling extends Tier {
    public void druckeEigenschaften() {
        super.setBeine(0);
        super.druckeEigenschaften();
    }
}
