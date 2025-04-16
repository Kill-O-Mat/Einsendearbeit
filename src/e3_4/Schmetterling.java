package src.e3_4;

class Schmetterling extends Tier {
    public void druckeEigenschaften() {
        super.setBeine(0);
        super.druckeEigenschaften();
    }
}
