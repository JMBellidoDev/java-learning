package inheritance.exercise;

/** Ordenador */
public class Computer extends Device {

  /** Tamaño de la memoria RAM en GB */
  protected byte ram;
  
  /** Tamaño del disco duro en GB */
  protected short hardDiskMemory; 
  
  /** Booleano que indica si el ordenador tiene GPU */
  protected boolean hasGPU;
  
  /**
   * Constructor
   * @param ram Tamaño de la memoria RAM
   * @param hardDiskMemory Tamaño de la memoria del disco duro
   * @param hasGPU Indica si el ordenador tiene GPU
   */
  Computer (byte ram, short hardDiskMemory, boolean hasGPU) {
    this.ram = ram;
    this.hardDiskMemory = hardDiskMemory;
    this.hasGPU = hasGPU;
  } 
  
}
