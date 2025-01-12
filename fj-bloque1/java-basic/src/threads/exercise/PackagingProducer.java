package threads.exercise;

/** Productor de envases de la línea de producción */
public class PackagingProducer implements Runnable {

  /** Línea de producción */
  private ProductLine productLine;

  /**
   * Constructor
   * 
   * @param productLine Línea de producción
   */
  public PackagingProducer(ProductLine productLine) {
    this.productLine = productLine;
  }

  @Override
  public void run() {

    while (true) {
      try {
        productLine.addPackage();
        Thread.sleep(200);

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();
      }

    }
  }

}
