package threads.exercise;

/** Fábrica de producción */
public class Factory {

  /**
   * Método main. Pone la fábrica en funcionamiento
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    ProductLine pl = new ProductLine();

    Thread packagingProducer = new Thread(new PackagingProducer(pl), "Packaging Producer");
    Thread trayProducer = new Thread(new TrayProducer(pl), "Tray Producer");
    Thread foodProducer = new Thread(new FoodProducer(pl), "Food Producer");

    Thread worker1 = new Thread(new Worker(pl), "Worker1");
    Thread worker2 = new Thread(new Worker(pl), "Worker2");

    packagingProducer.start();
    trayProducer.start();
    foodProducer.start();

    worker1.start();
    worker2.start();

  }

}
