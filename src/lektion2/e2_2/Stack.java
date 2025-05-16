package lektion2.e2_2;

public class Stack {
    private int size;
    private Entry head;
    private Entry tail;

    // neues Element zum Stapel hinzufügen - wird in der Kette hinten angehangen
    public void push(String s) {
        Entry newEntry = new Entry(s);
        // Wenn der Stack leer ist, erster Eintrag
        if (head == null) {
            //Setze erstes Element
            head = newEntry;
            // Setze letztes Element
            tail = newEntry;
            // Zähle Größe
            size++;
            return;
        }
        // HilfsObject current, da Liste verkleinert werden muss Oben auf den Stapel und richtige Referenz-ID muss ermittelt werden
        Entry current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newEntry;
        // neuen Eintrag auf tail setzen, oberstes
        tail = newEntry;
        size++;

    }

    // Zeige Inhalt des Stacks
    public void printList() {
        Entry current = head;
        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Entferne oberstes Element - also durchlaufe Stack und entferne letztes Element in der Kette
    public void pop() {
        // TODO Prüfen
        if (head == null) {
            throw new java.util.NoSuchElementException("Kann nix entfernen, Kein Element im STack");
        }
        // Hilfsobject, s.o.
        Entry current;
        current = head;
        // Abbruch, wenn wir am Ende der Kette sind
        while (current.next != null) {
            // Prüfen, ob das letzte lement in tail dem element entspricht, welches gelöscht werden soll
            if (current.next.element.equals(tail.element)) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        size--;
        // Setze neues Oberstes Element
        tail = current;
    }

    // Ausgabe unterstes Element
    private String peek() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Der Stack enthällt keine Elemente");
        }
        return head.element;
    }

    // Rückgabe oberstes Element
    public String getLast() {
        return tail.element;
    }

    // Rückgabe Gröe des Stapels
    private int getSize() {
        return this.size;
    }

    // Prüfen, ob Stapel leer
    private boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public String toString() {
        return "Stack{" +
                ", erster Eintrag=" + peek() +
                ", letzer Eintrag=" + getLast() +
                ", Größe des Stacks=" + getSize() +
                ", isEmpty=" + isEmpty() +
                '}';
    }

    private final static class Entry {

        String element;
        Entry next;

        private Entry(String element) {
            this.element = element;
            this.next = null;
        }
    }
}