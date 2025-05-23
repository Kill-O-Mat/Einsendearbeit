package src.selbsttestaufgabe4_2;

public class Tupel<E> {

    public E left;
    public E right;

    public Tupel(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLinks() {
        return this.left;
    }

    public E getRechts() {
        return this.right;
    }
}