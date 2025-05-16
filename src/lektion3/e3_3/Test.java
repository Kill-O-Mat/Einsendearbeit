/**
 * Beschreibung der Klasse Test.
 *
 * @author Mathias
 * @git https://github.com/Kill-O-Mat/Einsendearbeit2/tree/master/src/lektion3.lektion3.e3_3
 * @version 1.0
 * @created 16.04.2025
 */
package lektion3.e3_3;

class Test {
    public static void main(String[] args) {
        Super s1 = new Super();
        Super s2 = new Sub();

        Fisch f = new Forelle();
        Forelle fo = new Forelle();
        Vogel v = new Vogel();
        Huhn h = new Huhn();

        s1.m(v, f);  // Aufruf A
        s2.m(v, f);  // Aufruf B
        s1.m(v, h);  // Aufruf C
        s2.m(v, h);  // Aufruf D
        s1.m(h, fo); // Aufruf E
        // s1.m(h, h);  // Aufruf F
    }
}
