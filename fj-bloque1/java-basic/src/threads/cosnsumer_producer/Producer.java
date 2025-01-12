package threads.cosnsumer_producer;

import java.util.Random;

/** Productor */
public class Producer extends Thread {

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
  public Producer(Resource resource, String name) {
    super(name);
    this.resource = resource;
  }

  @Override
  public void run() {

    while (true) {

      try {
        resource.produce(RANDOM.nextInt(1000));
        Thread.sleep(RANDOM.nextInt(200));

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
    }
  }

}
