package src.e3_2;

class Stapel extends ListWithInternalArray {
    private int initialCapacity = 0;
    private int[] stapel;

    Stapel() {
        this(1);
    }

    Stapel(int initialCapcity) {
        super(initialCapcity);
        this.initialCapacity = initialCapcity;
    }

    // legt ein Element auf den Stapel
    public void push(Object element) {
        super.add(element, super.getNextFreeIndex());
    }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return super.getElementAt(super.getNextFreeIndex() - 1);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return super.removeElementAt(this.getNextFreeIndex() - 1);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return super.getElementAt(0) == null && this.getNextFreeIndex() < 1;
    }

}
