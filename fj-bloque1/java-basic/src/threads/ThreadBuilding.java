package threads;

/** Mi hilo */
class MyThread extends Thread {

  /**
   * Constructor con nombre
   * 
   * @param name Nombre del hilo
   */
  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.printf("Tarea concurrente desde el hilo %s: %d%n", this.getName(), i);

      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
    }
  }
}

/** Mi hilo que implementa Runnable */
class MyRunnableThread implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.printf("Tarea concurrente desde el hilo runnable %s: %d%n", Thread.currentThread().getName(), i);

      try {
        Thread.sleep(20);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }
    }
  }
}

/** Clase de construcción de hilos */
public class ThreadBuilding {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    MyThread mt = new MyThread("Hilo 1");
    Thread mt1 = new Thread(new MyRunnableThread(), "Hilo 2");

    mt.start();
    mt1.start();
  }

}
