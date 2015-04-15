package week8.day1;

public class MyBinarySearchTree<E extends Comparable<E>> implements IBTree<E> {

  private Node<E> root;
  private int size;

  @Override
  public boolean add(E element) {
    if (root == null) {
      root = new Node<E>(element, null, null, null);
      size++;
      return true;
    }
    for (Node<E> start = root; start != null; ) {
      if (start.element.compareTo(element) > 0) {
        if (start.leftChild == null) {
          start.leftChild = new Node<E>(element, start, null, null);
          size++;
          break;
        } else {
          start = start.leftChild;
        }
      } else {
        if (start.rightChild == null) {
          start.rightChild = new Node<E>(element, start, null, null);
          size++;
          break;
        } else {
          start = start.rightChild;
        }
      }
    }
    return true;
  }

  @Override
  public boolean remove(E element) {
    Node target = findNode(element);
    return false;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  private Node<E> findNode(E element) {
    Node<E> foundNode = null;
    for (Node<E> start = root; start != null; ) {
      if (start.element.compareTo(element) == 0) {
        foundNode = start;
        break;
      } else if (start.element.compareTo(element) > 0) {
        if (start.leftChild == null) {
          break;
        } else {
          start = start.leftChild;
        }
      } else {
        if (start.rightChild == null) {
          break;
        } else {
          start = start.rightChild;
        }
      }
    }
    return foundNode;
  }


  private static class Node<E> {
    E element;
    Node<E> parent;
    Node<E> leftChild;
    Node<E> rightChild;

    private Node(E element, Node<E> parent, Node<E> leftChild, Node<E> rightChild) {
      this.element = element;
      this.parent = parent;
      this.leftChild = leftChild;
      this.rightChild = rightChild;
    }

    Node<E> createNode(E element, Node<E> parent, Node<E> leftChild, Node<E> rightChild) {
      return new Node<E>(element, parent, leftChild, rightChild);
    }
  }
}
