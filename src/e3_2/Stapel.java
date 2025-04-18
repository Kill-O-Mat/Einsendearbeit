package src.e3_2;

class Stapel extends ListWithInternalArray{
    private int initialCapacity = 0;
    private int[] stapel;

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
        return super.getElementAt(super.getNextFreeIndex() -1);
    }

    // liefert eine Referenz auf das oberste Element des Stapel.
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return new Stapel(3);
    }

    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        return false;
    }

}
