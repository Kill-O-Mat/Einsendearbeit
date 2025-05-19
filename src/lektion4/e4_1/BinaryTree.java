package lektion4.e4_1;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree(T value) {
        System.out.println("Musterlösung");
        root = new BinaryNode<>(value);
    }

    public BinaryTree() {
    }

    public boolean contains(T value) {
        if (root == null) return false;
        return root.contains(value);
    }

    public void insert(T value) {
        if (root == null) {
            root = new BinaryNode<>(value);
        } else {
            root.insert(value);
        }
    }

    /*
     * Die Methode inorder() gibt die im Baum gespeicherten Werte
     * nach ihrer Größe sortiert aus, beginnend mit dem kleinsten Wert.
     */
    public void inorder() {
        if (root == null) return;
        root.inorder();
    }

    private static class BinaryNode<T extends Comparable<T>> {
        private final T value;
        private BinaryNode<T> leftSon, rightSon;

        public BinaryNode(T value) {
            this.value = value;
        }

        public void insert(T v) {
            if (v == value) return; // Knoten schon im Baum
            if (isSmaller(v, value)) {
                if (leftSon == null) {
                    leftSon = new BinaryNode<>(v);
                } else {
                    leftSon.insert(v);
                }
            } else {
                if (rightSon == null) {
                    rightSon = new BinaryNode<>(v);
                } else {
                    rightSon.insert(v);
                }
            }
        }

        private boolean isSmaller(T v, T value) {
            return v.compareTo(value) < 0;
        }

        public boolean contains(T v) {

            if (v == value) return true;
            if (v.compareTo(value) < 0) {
                if (leftSon == null) return false;
                return leftSon.contains(v);
            } else {
                if (rightSon == null) return false;
                return rightSon.contains(v);
            }
        }

        public void inorder() {
            if (leftSon != null) {
                leftSon.inorder();
            }
            System.out.println(value);
            if (rightSon != null) {
                rightSon.inorder();
            }
        }
    }
}