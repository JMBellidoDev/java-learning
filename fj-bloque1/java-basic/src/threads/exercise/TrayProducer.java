package threads.exercise;

/** Productor de banderas para la línea de producción */
public class TrayProducer implements Runnable {

  /** Línea de producción */
  private ProductLine productLine;

  /**
   * Constructor
   * 
   * @param productLine Línea de producción
   */
  public TrayProducer(ProductLine productLine) {
    this.productLine = productLine;
  }

  @Override
  public void run() {

    while (true) {
      try {
        productLine.addTray();
        Thread.sleep(200);

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }

    }
  }

}
