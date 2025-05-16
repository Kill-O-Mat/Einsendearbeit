package lektion1.e1_4;

import java.util.Random;

/**
 *
 */


public class GameOfLifeExtended {

    private final static int GENERATION = 300;
    private final static int[] ARRAYSIZE = {20, 44};
    private final static boolean DEBUG = false;
    private static int DEAD;
    private static int LIFE;
    private static int STAGNATION = 0;
    /*
     * boolean[][] feld2 = { { false, false, false, false, false }, { false, false,
     * true, false, false }, { false, false, true, false, false }, { false, false,
     * true, false, false }, { false, false, false, false, false } }; boolean[][]
     * feld = { { true, true, false, true, true }, { false, true, true, true, true
     * }, { true, true, true, false, false }, { false, false, false, false, true },
     * { true, true, true, true, true } };
     */
    private boolean[][] feld;
    private boolean[][] copyFeld; // = new boolean[feld.length][feld[0].length];

    public static void main(String[] args) {
        GameOfLifeExtended myGame = new GameOfLifeExtended();
        myGame.feld = myGame.createArray(GameOfLifeExtended.ARRAYSIZE[0], GameOfLifeExtended.ARRAYSIZE[1]);
        myGame.print();
        System.out.println();
        for (int i = 0; i < GameOfLifeExtended.GENERATION; i++) {
            System.out.println("Generation: " + i);
            try {
                Thread.sleep(400);
            } catch (Exception _) {
            }
            myGame.nextGeneration();
            myGame.print();
            System.out.println(GameOfLifeExtended.DEAD + " sind gestorben und " + (GameOfLifeExtended.LIFE - GameOfLifeExtended.DEAD) + " wurden geboren.");
            System.out.flush();
            System.out.println();
            if (GameOfLifeExtended.STAGNATION >= 1) {
                System.out.println("STANATION -- " + GameOfLifeExtended.STAGNATION);
                return;
            }
        }
    }

    /*
     * Generiert eine Array mit "Zufallswerten"
     */
    private boolean[][] createArray(int i, int j) {
        boolean[][] array = new boolean[i][j];
        Random rand = new Random();
        for (int z = 0; z < i; z++) {
            for (int h = 0; h < j; h++) {
                array[z][h] = rand.nextBoolean();
            }
        }
        return array;
    }

    public void print() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                System.out.print((feld[i][j]) ? "o " : ". ");
            }
            System.out.println();
        }
    }

    void nextGeneration() {
        copyArray(feld);
        int check;
        int dead = GameOfLifeExtended.DEAD;
        int life = GameOfLifeExtended.LIFE;
        GameOfLifeExtended.DEAD = 0;
        GameOfLifeExtended.LIFE = 0;

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                check = checkNachbarn(i, j);
                if (GameOfLifeExtended.DEBUG) {
                    System.out.println(
                            "Das Feld " + i + " - " + j + " ist: " + feld[i][j] + " und hat " + check + " Nachbarn;");
                }
                /*
                 * if (i == 0 || j == 0 || j == feld.length || i == feld.length) { feld[i][j] =
                 * false; } else {
                 */
                if (feld[i][j]) { // ALIVE
                    if (check == 2 || check == 3) {
                        feld[i][j] = true; // ->DEAD
                        GameOfLifeExtended.LIFE++;
                    } else {
                        feld[i][j] = false; // ->ALIVE
                        GameOfLifeExtended.DEAD++;
                    }
                } else { // DEAD
                    if (check == 3) {
                        feld[i][j] = true; // ->ALIVE
                        GameOfLifeExtended.LIFE++;
                    }
                }
            }
        }
        if (dead == GameOfLifeExtended.DEAD && life == GameOfLifeExtended.LIFE) {
            GameOfLifeExtended.STAGNATION++;
        } else {
            if (GameOfLifeExtended.STAGNATION >= 1) {
                GameOfLifeExtended.STAGNATION--;
            }
        }
        /*
         * if (i == 0 || j == 0 || j == feld.length || i == feld.length) { feld[i][j] =
         * false; }
         */
    }

    private int checkNachbarn(int i, int j) {

        int nachbarn = 0;
        int z;
        int o;

        try {
            if (copyFeld[i - 1][j - 1]) { // A - oben links
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[A] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // links oben
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i - 1][j]) { // B oben mitte
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[B] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // mitte oben
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i - 1][j + 1]) { // C - oben rechts
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[C] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // rechts oben
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i][j - 1]) { // D mitte links
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[D] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // links mitte
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i][j + 1]) { // E mitte rechts
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[E] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // rechts mitte
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i + 1][j - 1]) { // F unten links
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[F] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // links unten
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i + 1][j]) { // G unten mitte
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[G] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // mitte unten
            }
        } catch (Exception _) {
        }
        try {
            if (copyFeld[i + 1][j + 1]) { // H - unten rechts
                if ((GameOfLifeExtended.DEBUG) && i == z && j == o) {
                    System.out.println("[H] - i: " + i + " j: " + j);
                    System.out.println(feld[i][j]);
                }
                nachbarn++; // rechts unten
            }
        } catch (Exception e) {
        }
        return nachbarn;
    }

    private void copyArray(boolean[][] a) {
        copyFeld = new boolean[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i], 0, copyFeld[i], 0, a[0].length);
        }
    }
}
