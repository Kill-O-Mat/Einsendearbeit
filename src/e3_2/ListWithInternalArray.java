package src.e3_2;

import java.util.Arrays;

class ListWithInternalArray {
    private final int initialCapacity;
    private Object[] arrayList;
    private int nextFreeIndex = 0;

    ListWithInternalArray(int initialCapcity) {
        // Inistalisiere Stapel
        arrayList = new Object[(Math.max(initialCapcity, 1))];
        this.initialCapacity = initialCapcity;
    }

    @Override
    public String toString() {
        String sb = "ListWithInternalArray{" + "arrayList=" + Arrays.toString(arrayList) +
                ", nextFreeIndex=" + nextFreeIndex +
                ", Länge=" + arrayList.length +
                '}';
        return sb;
    }

    public int getNextFreeIndex() {
        return this.nextFreeIndex;
    }

    // Fügt das übergebene Element an der angegebenen Position ein.
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) {
        // Prüfen, ob index in Range of arraList, ansonsten auf nextFreeIndex setzen
        if (index > this.nextFreeIndex) {
            System.out.println(index + " ist kein gültiger Index! Setze ihn auf: " + this.nextFreeIndex);
            index = this.nextFreeIndex;
        }
        // Array kopieren
        this.arrayList = this.copyArray(index);
        // Neues Element hinzufügen
        this.arrayList[index] = elem;
        // nächsten freien Index zählen
        this.nextFreeIndex++;

    }

    private Object[] copyArray(int index) {
        // Kopie eines Arrays erstellen
        Object[] cArray = new Object[this.arrayList.length + ((this.nextFreeIndex == this.arrayList.length) ? 3 : 1)];
        // Prüfen, ob es das erste Element ist, was auf den Stack gelegt wird
        if (index == 0 && this.nextFreeIndex == 0) {
            // Leeres Array zurückgeben
            return cArray;
        }

        // sollte der Index noch null sein - gib einfach das original Array zurück
        try {
            if (this.arrayList[index] == null) return this.arrayList;
        } catch (Exception _) {
        }
        // Array kopieren
        for (int i = 0; i < this.arrayList.length; i++) {
            if (index == 0) {
                // fals in mitte und Platz belegt, erhöhe altes um 1 und trage Platzhalte für neues Element ein
                cArray[i + 1] = this.arrayList[i];
            }
            // in Mitte eintragen
            if (index == i) {
                // Sonderfall, es wird an erster Stelle eingetragen
                cArray[i] = null;
                // alle Werte vor dem neuen Element kopieren
            }
            // Alle Elemente nach dem index kopieren
            cArray[i] = (index < i) ? this.arrayList[i - 1] : this.arrayList[i];
        }
        return cArray;
    }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) {
        return (index < 0 || index > this.nextFreeIndex) ? null : this.arrayList[index];
    }

    // Liefert eine Referenz auf das Element an der angegebenen Position und entfernt es
    // gleichzeitig aus der Liste.  Nachfolgende Elemente werden ggf. nach vorne verschoben.
    public Object removeElementAt(int index) {
        index = (index < 0 || index > this.nextFreeIndex) ? 0 : index;
        if (index != 0) index--;
        System.out.println("Entferne Element: " + arrayList[index] + " an Stelle: " + index + ".");
        Object returnVal = this.arrayList[index];
        Object[] cp = new Object[this.arrayList.length];
        for (int i = 0; i <= this.arrayList.length; i++) {
            if (index > i) {
                if (i == 0) {
                    cp[i] = arrayList[i];
                } else {
                    cp[i - 1] = arrayList[i];
                }
            }
            if (i <= this.nextFreeIndex - 1) {
                cp[i] = arrayList[i + 1];
            }
        }
        this.nextFreeIndex--;
        arrayList = cp;
        return returnVal;
    }

    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() {
        return this.nextFreeIndex - 1;
    }
}
