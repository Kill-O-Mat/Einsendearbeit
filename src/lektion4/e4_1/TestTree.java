package lektion4.e4_1;

public class TestTree {
    public static void main(String[] args) {
        BinaryTree<Integer> myTree = new BinaryTree<>(6);
        //   myTree.insert(5);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(11);
        myTree.insert(6);
        System.out.println("Der baum hat den eintrag 5: " + myTree.contains(5));
        myTree.insert(13);
        //myTree.insert(3);
        myTree.insert(10);
        myTree.inorder();
        System.out.println("Was mit Strings");
        BinaryTree<String> myTree1 = new BinaryTree<>("Test");
        myTree1.insert("lolo");
        myTree1.insert("zzzzz");
        myTree1.insert("!\"$§!\\§%/%$§\"!§$/()\\\"\"!§$/()");
        myTree1.insert("123-adf");
        myTree1.inorder();
        System.out.println("Enthällt lolo? -- " + myTree1.contains("lolo"));
        System.out.println("Enthällt loli? -- " + myTree1.contains("loli"));
    }
}
