package src.e3_2;

import java.util.Arrays;

class ListWithInternalArray {
    private final int initialCapacity;
    private Object[] arrayList;
    private int nextFreeIndex = 0;

    ListWithInternalArray(int initialCapcity) {
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
        if (index > this.nextFreeIndex) {
            System.out.println(index + " ist kein gültiger Index! Setze ihn auf: " + this.nextFreeIndex);
            index = this.nextFreeIndex;
        }
        arrayList = copyArray(index);
        arrayList[index] = elem;
        this.nextFreeIndex++;

    }

    private Object[] copyArray(int index) {
        Object[] cArray = new Object[arrayList.length + ((this.nextFreeIndex == arrayList.length) ? 3 : 1)];
        // Prüfen, ob es das erste Element ist, was auf den Stack gelegt wird
        if (index == 0 && this.nextFreeIndex == 0) {
            return cArray;
        }

        // Prüfen, ob das element hinein getan wird oder auf den Stapel drauf kommt
        try {
            if (arrayList[index] == null) return arrayList;
        } catch (Exception _) {

        }
        // Array kopieren, wenn in die mitte eingetragen wird
        for (int i = 0; i < arrayList.length; i++) {
            if (index == i) {
                if (index != 0) {
                    cArray[i] = null;
                } else {
                    cArray[i + 1] = arrayList[i];
                    cArray[i] = null;
                }
            } else if (index < i) {
                cArray[i] = arrayList[i - 1];
            } else {
                cArray[i] = arrayList[i];
            }
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
        System.out.println("Entferne Element: " + arrayList[index] + " an Stelle: " + index + ".");
        return new ListWithInternalArray(3);
    }

    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() {
        return this.nextFreeIndex - 1;
    }
}
