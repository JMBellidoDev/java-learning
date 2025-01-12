package polymorphism.exercise;

/** Motor del vehículo */
public class Engine implements Repairable {

  /** Caballos de potencia del motor */
  private short horsePower;

  /** Cilindrada */
  private short cubicCapacity;

  /** Constructor sin parámetros */
  public Engine() {
  }

  /**
   * Constructor con parámetros
   * 
   * @param horsePower    Potencia del vehículo en cv (caballos de vapor)
   * @param cubicCapacity Cilindrada del vehículo en centímetros cúbicos
   */
  public Engine(short horsePower, short cubicCapacity) {
    this.horsePower = horsePower;
    this.cubicCapacity = cubicCapacity;
  }

  @Override
  public void repair() {
    System.out.printf("Se ha reparado correctamente el motor con potencia de %dcv y una cilindrada de %dcc", horsePower, cubicCapacity);
  }

  /**
   * Getter - horsePower
   * 
   * @return short
   */
  public short getHorsePower() {
    return horsePower;
  }

  /**
   * Setter - horsePower
   * 
   * @param horsePower Potencia del vehículo en cv (caballos de vapor)
   */
  public void setHorsePower(short horsePower) {
    this.horsePower = horsePower;
  }

  /**
   * Getter - cubicCapacity
   * 
   * @return short
   */
  public short getCubicCapacity() {
    return cubicCapacity;
  }

  /**
   * Setter - cubicCapacity
   * 
   * @param cubicCapacity Cilindrada del vehículo en centímetros cúbicos
   */
  public void setCubicCapacity(short cubicCapacity) {
    this.cubicCapacity = cubicCapacity;
  }

}
