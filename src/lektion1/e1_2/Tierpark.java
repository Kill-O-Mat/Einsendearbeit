package lektion1.e1_2;


import java.util.Scanner;

public class Tierpark {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Bitte Tier eingeben:");
        String n = "";
        int legs = 0;
        boolean fly = false;
        boolean feather = false;
        String danger = "vielleicht";

        Scanner scan = new Scanner(System.in);
        n = scan.nextLine();

        try {

            if (n.equals("Spinne")) {
                legs = 8;
            } else if (n.equals("Maus")) {
                legs = 4;
                danger = "nein";
            } else if (n.equals("Pferd")) {
                legs = 4;
            } else if (n.equals("Wal")) {

            } else if (n.equals("Drache")) {
                fly = true;
                danger = "ja";
            } else if (n.equals("Affe")) {
                legs = 2;
            } else if (n.equals("Löwe")) {
                legs = 4;
                danger = "ja";
            } else if (n.equals("Adler")) {
                legs = 2;
                fly = true;
                danger = "nein";
            } else {
                System.out.println("Die Eingabe (" + n + ") entspricht keinem Tier, dass in diesm Zoo lebt.");
                return;
            }
            // Ausgabe
            System.out.println("Das Tier " + n + " hat folgende Eigenschaften:");
            System.out.println(legs + " Beine");
            System.out.println("hat Federn: " + (feather ? "ja" : "nein"));
            System.out.println("flugfähig: " + (fly ? "ja" : "nein"));
            System.out.println("gefährlich für den Menschen: " + danger);
        } finally {
            scan.close();
        }
    }

}