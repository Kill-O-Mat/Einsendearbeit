package lektion3.e3_2;

class Stapel {
    ListWithInternalArray lwiA;
    private int initialCapacity = 0;
    private int[] stapel;

    Stapel() {
        this(1);
    }

    Stapel(int initialCapcity) {
        this.lwiA = new ListWithInternalArray(5);
        this.initialCapacity = initialCapcity;
    }

    public int getSize() {
        return lwiA.getSize();
    }

    public void add(Object elem, int index) {
        lwiA.add(elem, index);
    }

    public Object getElementAt(int pos) {
        return lwiA.getElementAt(pos);
    }

    public Object removeElementAt(int pos) {
        return lwiA.removeElementAt(pos);
    }

    // legt ein Element auf den Stapel
    public void push(Object element) {
        lwiA.add(element, lwiA.getNextFreeIndex());
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return lwiA.getElementAt(lwiA.getNextFreeIndex() - 1);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return lwiA.removeElementAt(lwiA.getNextFreeIndex() - 1);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return lwiA.getElementAt(0) == null && lwiA.getNextFreeIndex() < 1;
    }

}
