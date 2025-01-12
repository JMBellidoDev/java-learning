package generics.exercise;

/** Nodo de la lista custom */
public class Node<T> {

  /** Nodo previo al actual */
  private Node<T> prevNode;

  /** Nodo siguiente al actual */
  private Node<T> nextNode;

  /** Valor del nodo actual */
  private T value;

  /**
   * Constructor
   * 
   * @param prevNode Nodo previo
   * @param nextNode Nodo siguiente
   * @param value    valor
   */
  public Node(Node<T> prevNode, Node<T> nextNode, T value) {
    this.prevNode = prevNode;
    this.nextNode = nextNode;
    this.value = value;
  }

  /**
   * Getter - prevNode
   * 
   * @return Node(T)
   */
  public Node<T> getPrevNode() {
    return prevNode;
  }

  /**
   * Setter - prevNode
   * 
   * @param prevNode Nodo previo
   */
  public void setPrevNode(Node<T> prevNode) {
    this.prevNode = prevNode;
  }

  /**
   * Getter - nextNode
   * 
   * @return Node(T)
   */
  public Node<T> getNextNode() {
    return nextNode;
  }

  /**
   * Setter - nextNode
   * 
   * @param nextNode Nodo siguiente
   */
  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  /**
   * Getter - value
   * 
   * @return T
   */
  public T getValue() {
    return value;
  }

  /**
   * Setter - value
   * 
   * @param value Valor del nodo
   */
  public void setValue(T value) {
    this.value = value;
  }

}
