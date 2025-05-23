package src.lektion4.e4_1;

public class BinaryTree {
    private BinaryNode root;

    public BinaryTree(int value) { /* ... */ }

    public BinaryTree() { /* ... */ }

    public boolean contains(int value) { return true; /* ... */ }

    public void insert(int value) { /* ... */ }

    public void inorder() { /* ... */ }

    private static class BinaryNode {
        private final int value;
        private BinaryNode leftSon, rightSon;

        public BinaryNode(int value) {
            this.value = value;
        }
    }
}