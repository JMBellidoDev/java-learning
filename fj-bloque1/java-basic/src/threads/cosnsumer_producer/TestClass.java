package threads.cosnsumer_producer;

/** Clase test del funcionamiento */
public class TestClass {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    Resource resource = new Resource();

    Consumer c1 = new Consumer(resource, "Consumer1");
    Consumer c2 = new Consumer(resource, "Consumer2");
    Producer p1 = new Producer(resource, "Producer1");
    Producer p2 = new Producer(resource, "Producer2");

    p1.start();
    p2.start();
    c1.start();
    c2.start();

  }

}
