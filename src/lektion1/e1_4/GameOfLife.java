package lektion1.e1_4;

public class GameOfLife {

    boolean[][] feld1 = {{true, false, false, false, false}, {false, false, true, false, false},
            {false, false, true, false, true}, {false, true, true, false, false},
            {false, false, false, false, false}};
    boolean[][] feld = {
            {false, false, false, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, false, false, false}};
    private final boolean[][] copyFeld = new boolean[feld.length][feld[0].length];

    public static void main(String[] args) {
        GameOfLife myGame = new GameOfLife();
        for (int i = 0; i < 10; i++) {
            myGame.nextGeneration();
            myGame.print();
            System.out.println();
        }

    }

    void print() {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j]) {
                    System.out.print("o ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    void nextGeneration() {
        copyArray(feld);
        int check = 0;

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (i == 0 || j == 0 || j == feld.length - 1 || i == feld.length - 1) {
                    feld[i][j] = false;
                } else {
                    check = checkNachbarn(i, j);
                    if (feld[i][j]) { // ALIVE
                        // ->ALIVE
                        feld[i][j] = check == 2 || check == 3; // ->DEAD
                    } else { // DEAD
                        if (check == 3) {
                            feld[i][j] = true; // ->ALIVE
                        }
                    }

                }
            }
        }
        /* ... */
    }

    int checkNachbarn(int z, int s) {

        int nachbarn = 0;

        if (copyFeld[z - 1][s - 1]) {
            nachbarn++; // links oben
        }
        if (copyFeld[z - 1][s]) {
            nachbarn++; // mitte oben
        }
        if (copyFeld[z - 1][s + 1]) {
            nachbarn++; // rechts oben
        }
        if (copyFeld[z][s - 1]) {
            nachbarn++; // links unten
        }
        if (copyFeld[z][s + 1]) {
            nachbarn++; // links danaben
        }
        if (copyFeld[z + 1][s - 1]) {
            nachbarn++; // mitte unten
        }
        if (copyFeld[z + 1][s]) {
            nachbarn++; // rechts mitte
        }
        if (copyFeld[z + 1][s + 1]) {
            nachbarn++; // rechts unten
        }

        return nachbarn;
    }

    private void copyArray(boolean[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i], 0, copyFeld[i], 0, a[0].length);
        }
        // return copyFeld;
    }
}
