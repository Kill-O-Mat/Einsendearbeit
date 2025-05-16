package lektion3.e3_1;

enum Planet {
    JUPITER(30, 7785),
    MARS(50, 2279);

    private final int monde;
    private final int entfernung;

    Planet(int i, int x) {
        this.monde = i;
        this.entfernung = x;
    }

    public int getNumberOfMoons() {
        return this.monde;
    }

    public boolean isCloserToSunThan(Planet planet) {

        return (planet.entfernung > this.entfernung);
    }
}
