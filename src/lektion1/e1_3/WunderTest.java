package lektion1.e1_3;

public class WunderTest {

    private static int max;
    private static String ausgabe;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            WunderTest.wunder(i);
        }
        System.out.println(WunderTest.ausgabe);

        WunderTest.max = 0;
        for (int i = 1; i <= 100; i++) {
            if (WunderTest.max < WunderTest.wunderRek(i, 0)) {
                WunderTest.max = WunderTest.wunderRek(i, 0);
                WunderTest.ausgabe = "Number " + i + " hat die meisten Schritte (" + WunderTest.max + ").";
            }
        }

        System.out.println(WunderTest.ausgabe);
    }

    public static void wunder(int n) {
        int in = n;
        int schritte = 0;
        if (n < 0) {
            return;
        }
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            schritte++;
        }
        if (WunderTest.max < schritte) {
            WunderTest.max = schritte;
            WunderTest.ausgabe = "Number = " + in + " hat die meisten Schritte (" + WunderTest.max + ") benötigt";
        }
    }

    public static int wunderRek(int n, int z) {
        if (n != 1) {
            return (n % 2 == 0) ? wunderRek(n / 2, ++z) : wunderRek(n * 3 + 1, ++z);
        } else {
            return z;
        }

    }
}