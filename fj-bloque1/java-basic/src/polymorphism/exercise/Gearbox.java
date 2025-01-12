package polymorphism.exercise;

/** Caja de cambios de un vehículo */
public class Gearbox {

  /** Indica el número de marchas */
  private final byte numberOfGears;

  /** Booleano que indica si la caja de cambios es manual (true) o automática (false) */
  private final boolean isManual;

  /**
   * Constructor con parámetros
   * 
   * @param numberOfGears Número de marchas
   * @param isManual      Indica si la caja de cambios es manual (true) o automática (false)
   */
  public Gearbox(byte numberOfGears, boolean isManual) {
    this.numberOfGears = numberOfGears;
    this.isManual = isManual;
  }

  /**
   * Getter - numberOfGears
   * 
   * @return byte
   */
  public byte getNumberOfGears() {
    return numberOfGears;
  }

  /**
   * Getter - isManual
   * 
   * @return boolean
   */
  public boolean isManual() {
    return isManual;
  }

}
