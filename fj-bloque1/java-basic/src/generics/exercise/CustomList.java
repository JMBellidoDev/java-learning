package generics.exercise;

/** Lista customizada. Funciona de una forma similar a la LinkedList */
public class CustomList<T> {

  /** Primer nodo de la lista */
  private Node<T> firstNode;

  /** Último nodo de la lista */
  private Node<T> lastNode;

  /**
   * Añade un nuevo valor a la lista
   * 
   * @param newValue Valor a añadir
   */
  public void add(T newValue) {

    Node<T> newNode = new Node<>(null, null, newValue);

    // Se tienen en cuenta los casos en los que el primer o último nodo sean null
    if (firstNode == null) {
      firstNode = newNode;

    } else if (lastNode == null) {
      firstNode.setNextNode(newNode);
      newNode.setPrevNode(firstNode);

      lastNode = newNode;

      // Caso en el que sea el tercer nodo introducido o superior
    } else {
      Node<T> auxNode = new Node<>(lastNode.getPrevNode(), newNode, lastNode.getValue());
      auxNode.getPrevNode().setNextNode(auxNode);
      newNode.setPrevNode(auxNode);

      lastNode = newNode;
    }
  }

  /**
   * Elimina un elemento de la lista
   * 
   * @param value Valor a eliminar
   * @return boolean - true si se ha encontrado y eliminado, false en caso contrario
   */
  public boolean remove(T value) {

    boolean found = false;
    Node<T> nodeToSearch = firstNode;

    // Se verifica el primer nodo
    if (nodeToSearch != null && nodeToSearch.getValue().equals(value)) {
      found = true;
      firstNode = nodeToSearch.getNextNode();

      if (firstNode != null) {
        firstNode.setPrevNode(null);
      }
    }

    // Se recorre la lista mientras no se encuentre el elemento
    while (!found && nodeToSearch != lastNode && nodeToSearch != null) {

      // Si se encuentra, se modifican los nodos linkados
      if (nodeToSearch.getValue().equals(value)) {

        found = true;
        nodeToSearch.getPrevNode().setNextNode(nodeToSearch.getNextNode());
        nodeToSearch.getNextNode().setPrevNode(nodeToSearch.getPrevNode());

        // Si no es el mismo valor, se pasa al siguiente
      } else {
        nodeToSearch = nodeToSearch.getNextNode();
      }
    }

    // Se verifica el último nodo si no se ha encontrado
    if (!found && nodeToSearch != null && nodeToSearch.getValue().equals(value)) {
      found = true;
      lastNode = lastNode.getPrevNode();
      lastNode.setNextNode(null);
    }

    if (firstNode != null && lastNode != null && firstNode.getValue().equals(lastNode.getValue())) {
      lastNode = null;
    }

    return found;
  }

  /**
   * Busca un elemento de la lista e indica si se encuentra en ella
   * 
   * @param value Valor a eliminar
   * @return boolean - true si se ha encontrado, false en caso contrario
   */
  public boolean find(T value) {

    boolean found = false;
    Node<T> nodeToSearch = firstNode;

    // Se verifica el primer nodo
    if (nodeToSearch != null && nodeToSearch.getValue().equals(value)) {
      found = true;
    }

    // Se recorre la lista mientras no se encuentre el elemento
    while (!found && nodeToSearch != lastNode && nodeToSearch != null) {

      if (nodeToSearch.getValue().equals(value)) {
        found = true;

      } else {
        nodeToSearch = nodeToSearch.getNextNode();
      }
    }

    // Se verifica el último nodo si no se ha encontrado
    if (!found && nodeToSearch != null && nodeToSearch.getValue().equals(value)) {
      found = true;
    }
    return found;
  }

}
