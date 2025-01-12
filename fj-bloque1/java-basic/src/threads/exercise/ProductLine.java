package threads.exercise;

/** Línea de producción */
public class ProductLine {

  /** Cantidad de envases disponibles */
  int packages = 0;

  /** Cantidad de bandejas disponibles */
  int trays = 0;

  /** Cantidad de porciones de comida disponibles */
  int food = 0;

  /**
   * Método que empaqueta la comida en un envase para disponerlo a la venta
   * 
   * @throws InterruptedException En caso de excepción a la hora de interrumpir el hilo
   */
  public synchronized void packageFood() throws InterruptedException {

    while (packages == 0 || trays == 0 || food == 0) {
      wait();
    }

    packages--;
    trays--;
    food--;
    System.out.printf("Paquete envasado por el trabajador: %s%n", Thread.currentThread().getName());
  }

  /** Genera un nuevo envase y notifica a los trabajadores para comprobar si pueden seguir trabajando */
  public synchronized void addPackage() {
    packages++;
    notifyAll();
  }

  /** Genera una nueva bandeja y notifica a los trabajadores para comprobar si pueden seguir trabajando */
  public synchronized void addTray() {
    trays++;
    notifyAll();
  }

  /** Genera una nueva porción de comida y notifica a los trabajadores para comprobar si pueden seguir trabajando */
  public synchronized void addFood() {
    food++;
    notifyAll();
  }

}
