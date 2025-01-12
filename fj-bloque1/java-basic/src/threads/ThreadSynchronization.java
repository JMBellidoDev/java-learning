package threads;

/** Contador sincronizado */
class SyncCounter {

  /** Contador */
  static int counter = 50;

  /** Constructor privado. Evita instanciación de clase */
  private SyncCounter() {
  }

  /** Método que decrementa el valor en 1 unidad */
  public static synchronized void decrement() {
    SyncCounter.counter--;
  }

}

/** Clase encargada de decrementar un valor */
class Decrementer extends Thread {

  /**
   * Constructor con nombre
   * 
   * @param name Nombre del hilo
   */
  public Decrementer(String name) {
    super(name);
  }

  @Override
  public void run() {

    for (int i = 0; i < 10; i++) {
      SyncCounter.decrement();
      System.out.printf("Decrementando SyncCounter desde el hilo %s: %d%n", Thread.currentThread().getName(), SyncCounter.counter);

      try {
        Thread.sleep(30);
      } catch (InterruptedException e) {

        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
    }
  }

}

/** Clase ejemplo de sincronización de hilos */
public class ThreadSynchronization {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    for (int i = 1; i < 6; i++) {
      Decrementer d = new Decrementer("hilo " + i);
      d.start();
    }
  }

}
