/**
 * Beschreibung der Klasse Super.
 *
 * @author Mathias
 * @version 1.0
 * @created 16.04.2025
 */
package e3_2;

public class Super {
    void m(Tier t, Fisch f) {
        System.out.println("1");
    }

    void m(Vogel v, Forelle f) {
        System.out.println("2");
    }

    void m(Tier t, Huhn v) {
        System.out.println("3");
    }

    void m(Huhn h, Vogel v) {
        System.out.println("4");
    }
}
