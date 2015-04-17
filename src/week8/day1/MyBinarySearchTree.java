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
          start.leftChild = createNode(element, start, null, null);
          size++;
          break;
        } else {
          start = start.leftChild;
        }
      } else {
        if (start.rightChild == null) {
          start.rightChild = createNode(element, start, null, null);
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
    Node<E> target = findNode(element);
    if (target == root) {
      root = null;
      size--;
      return true;
    }

    if (target == null) {
      return false;
    }

    Node targetRightChild = target.rightChild;
    Node targetLeftChild = target.leftChild;

    if (targetLeftChild == null && targetRightChild == null) {
      if (target.parent.leftChild == target) {
        target.parent.leftChild = null;
      } else {
        target.parent.rightChild = null;
      }
    } else if (targetRightChild == null) {
      if (defineChild(target) == 1) {
        target.parent.leftChild = targetLeftChild;
      } else {
        target.parent.rightChild = targetLeftChild;
      }
    } else if (targetLeftChild == null) {
      if (defineChild(target) == 1) {
        target.parent.leftChild = targetRightChild;
      } else {
        target.parent.rightChild = targetRightChild;
      }
    } else {
      Node<E> max = findMax(targetLeftChild);

      if (max.leftChild != null) {
        max.parent.rightChild = max.leftChild;
        max.leftChild.parent = max.parent;
      }

      target.element = max.element;
      if (defineChild(max) == 1) {
        max.parent.leftChild = null;
      } else {
        max.parent.rightChild = null;
      }
    }
    size--;
    return true;
  }

  /**
   * @return 1 if child is left, -1 right, 0 if something going wrong
   */
  private int defineChild(Node child) {
    return child.parent.leftChild == child ? 1 : child.parent.rightChild == child ? -1 : 0;
  }

  private Node<E> findMax(Node<E> iter) {
    while (iter.rightChild != null) {
      iter = iter.rightChild;
    }
    return iter;
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

  private Node<E> createNode(E element, Node<E> parent, Node<E> leftChild, Node<E> rightChild) {
    return new Node<E>(element, parent, leftChild, rightChild);
  }


  private class Node<E> {
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
  }
}
