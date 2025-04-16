package src.e3_1;

 enum Planet {
    JUPITER(30, 7785),
    MARS(50, 2279);

    private final int moons;
    private final int entfernung;

    Planet(int i, int x) {
        this.moons = i;
        this.entfernung = x;
    }

    public int getNumberOfMoons() {
        return this.moons;
    }

    public boolean isCloserToSunThan(Planet planet) {

        return (planet.entfernung > this.entfernung);
    }
}
