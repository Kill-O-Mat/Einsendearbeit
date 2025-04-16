package e4;

public abstract class Tier {
    private boolean isGefaehrlich = false;
    private int beine;


    protected Tier() {
    }

    private int getBeine() {
        return this.beine;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public void druckeEigenschaften() {
        String s = (this.isGefaehrlich) ? " ja" : "nein";
        System.out.println("Das sind die Eigenschaften: \n" + getBeine() + " Beine" +
                "\n" + "gefährlich für Menschen: " + s);
    }

    public void setGefaehrlich(boolean gefaehrlich) {
        this.isGefaehrlich = gefaehrlich;
    }

}
