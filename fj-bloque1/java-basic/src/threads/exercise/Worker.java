package threads.exercise;

/** Trabajador */
public class Worker implements Runnable {

  /** Línea de producción */
  private ProductLine productLine;

  /**
   * Constructor
   * 
   * @param productLine Línea de producción
   */
  public Worker(ProductLine productLine) {
    this.productLine = productLine;
  }

  @Override
  public void run() {

    while (true) {
      try {
        productLine.packageFood();
        Thread.sleep(1000);

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }

    }
  }

}
