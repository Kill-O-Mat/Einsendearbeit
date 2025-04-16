package src.e3_4;

 class AnimalInformationSystem {
    /*
     * Diese Methode liefert Informationen über die Eigenschaften eines Tiers. Dazu
     * muss der Name der Tier-Art als erster Parameter der Methode übergeben werden.
     */
    public static void main(String[] args) {
        String artName = args[0];
//        String artName = "Pinguin";
        Tier tier = null;
        if (artName.equals("Pinguin")) {
            tier = new Pinguin();
        }
        if (artName.equals("Löwe")) {
            tier = new Loewe();
        }
        if (artName.equals("Schmetterling")) {
            tier = new Schmetterling();
        }

        /* Hier könnten weitere If-Anweisungen für weitere Tierarten stehen. */

        if (tier == null) {
            System.out.println("Das Tier " + artName + " wurde noch nicht implementiert.");
        } else {
            System.out.println(artName + ":");
            tier.druckeEigenschaften();
        }
    }
}
