package lektion2.e2_3;

public class BinaryTree {

    private BinaryNode root;
    private boolean tmp;

    public BinaryTree(int value) {
        insert(value);
    }

    public BinaryTree() {
        this(0);
    }

    public boolean contains(int value) {
        tmp = false;
        containsRec(root, value);
        return tmp;
    }

    private void containsRec(BinaryNode node, int value) {
        if (node != null && !tmp) {
            if (node.value == value) {
                tmp = true;
            }
            containsRec(node.leftSon, value);
            containsRec(node.rightSon, value);
        }
    }

    public void insert(int value) {
        root = insertRec(value, root);
    }

    private BinaryNode insertRec(int value, BinaryNode node) {
        if (node == null) {
            return new BinaryNode(value);
        }
        if (value == node.value) return node;
        if (value < node.value) {
            node.leftSon = insertRec(value, node.leftSon);
        } else {
            node.rightSon = insertRec(value, node.rightSon);
        }
        return node;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BinaryNode node) {
        if (node != null) {
            inorderRec(node.rightSon);
            System.out.println(node.value);
            inorderRec(node.leftSon);
        }

    }

    private final static class BinaryNode {
        private final int value;
        private BinaryNode leftSon, rightSon;

        public BinaryNode(int value) {
            this.value = value;
            this.leftSon = null;
            this.rightSon = null;
        }
    }
}