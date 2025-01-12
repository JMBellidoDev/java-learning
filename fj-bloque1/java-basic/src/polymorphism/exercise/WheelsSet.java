package polymorphism.exercise;

/** Conjunto de ruedas de un vehículo */
public class WheelsSet implements Repairable {

  /** Número de ruedas */
  private final byte numberOfWheels;

  /** Tamaño de la llanta en pulgadas */
  private final byte rimSize;

  /**
   * Constructor con parámetros
   * 
   * @param numberOfWheels Número de ruedas
   * @param rimSize        Tamaño de la llanta en pulgadas
   */
  public WheelsSet(byte numberOfWheels, byte rimSize) {
    this.numberOfWheels = numberOfWheels;
    this.rimSize = rimSize;
  }

  @Override
  public void repair() {
    System.out.printf("Se ha reparado correctamente el conjunto de %d ruedas con llantas de tamaño %d", numberOfWheels, rimSize);
  }

  /**
   * Getter - numberOfWheels
   * 
   * @return byte
   */
  public byte getNumberOfWheels() {
    return numberOfWheels;
  }

  /**
   * Getter - rimSize
   * 
   * @return byte
   */
  public byte getRimSize() {
    return rimSize;
  }

}
