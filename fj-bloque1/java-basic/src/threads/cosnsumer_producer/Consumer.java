package threads.cosnsumer_producer;

import java.util.Random;

/** Consumidor */
public class Consumer extends Thread {

  /** Recurso */
  private Resource resource;

  /** Generador de números aleatorios */
  private static final Random RANDOM = new Random();

  /**
   * Constructor
   * 
   * @param resource Recurso
   * @param name     Nombre del hilo
   */
  public Consumer(Resource resource, String name) {
    super(name);
    this.resource = resource;
  }

  @Override
  public void run() {

    try {

      while (true) {
        int value = resource.consume();
        System.out.printf("%s consumed %d%n", getName(), value);

        Thread.sleep(RANDOM.nextInt(200));
      }

    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      e.printStackTrace();
    }
  }

}
