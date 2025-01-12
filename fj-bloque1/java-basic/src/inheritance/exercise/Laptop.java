package inheritance.exercise;

/** Ordenador portátil */
public class Laptop extends Computer {

  /** Tamaño de la pantalla */
  private short screenSize;
  
  /**
   * Constructor
   * @param ram Tamaño de la memoria RAM
   * @param hardDiskMemory Tamaño de la memoria del disco duro
   * @param hasGPU Indica si el ordenador tiene GPU
   * @param screenSize Tamaño de la pantalla
   */
  Laptop(byte ram, short hardDiskMemory, boolean hasGPU, short screenSize) {
    super(ram, hardDiskMemory, hasGPU);
    this.screenSize = screenSize;
  }

  @Override
  void turnOn(Device device) {
    System.out.printf("Ordenador portátil con ID: %d y tamaño de pantalla: %d encendido", deviceId, screenSize);
  }

  @Override
  void turnOff(Device device) {
    System.out.printf("Ordenador portátil con ID: %d y tamaño de pantalla: %d apagado", deviceId, screenSize);
  }
  
  

}
