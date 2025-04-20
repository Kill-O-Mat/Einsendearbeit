package src.e3_4;

abstract class Tier {
    private boolean isGefaehrlich;
    private int beine;


    protected Tier(boolean isGefaehrlich, int beine) {
        this.isGefaehrlich = isGefaehrlich;
        this.beine = beine;
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
