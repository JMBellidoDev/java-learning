package threads.exercise;

/** Productor de la comida para la línea de producción */
public class FoodProducer implements Runnable {

  /** Línea de producción */
  private ProductLine productLine;

  /**
   * Constructor
   * 
   * @param productLine Línea de producción
   */
  public FoodProducer(ProductLine productLine) {
    this.productLine = productLine;
  }

  @Override
  public void run() {

    while (true) {
      try {
        productLine.addFood();
        Thread.sleep(200);

      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        e.printStackTrace();

      }
    }
  }

}
