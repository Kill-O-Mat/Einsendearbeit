package lektion2.e2_3;

public class TestTree {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree(6);
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
        BinaryTree myTree1 = new BinaryTree();
    }
}
