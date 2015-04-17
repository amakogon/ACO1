package week8.day1;

public class TestTree {
  public static void main(String[] args) {
    IBTree<Integer> tree = new MyBinarySearchTree<Integer>();
    tree.add(8);
    tree.add(3);
    tree.add(5);
    tree.add(1);
    tree.add(2);
    tree.add(4);
    tree.add(7);

    tree.remove(3);

//    ((MyBinarySearchTree) tree).findNode(2);


  }
}
