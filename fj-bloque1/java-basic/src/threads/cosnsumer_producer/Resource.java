package threads.cosnsumer_producer;

import java.util.LinkedList;

/** Recurso compartido */
public class Resource {

  /** Lista de recursos */
  private LinkedList<Integer> resources = new LinkedList<>();

  /**
   * Consume un recurso y lo devuelve
   * 
   * @return int Número producido
   * @throws InterruptedException En caso de problema durante la espera del hilo
   */
  public synchronized int consume() throws InterruptedException {
    while (resources.isEmpty()) {
      wait();
    }
    return resources.poll();
  }

  /**
   * Produce un nuevo recurso
   * 
   * @param value Valor del recurso
   */
  public synchronized void produce(int value) {
    resources.offer(value);
    notifyAll();
  }

}
