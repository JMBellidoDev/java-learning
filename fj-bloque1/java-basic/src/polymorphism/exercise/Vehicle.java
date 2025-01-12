package polymorphism.exercise;

/** Vehículo */
public class Vehicle {

  /** Motor del vehículo */
  private Engine engine;

  /** Conjunto de ruedas del vehículo */
  private WheelsSet wheelsSet;

  /** Caja de cambios del vehículo */
  private Gearbox gearbox;

  /**
   * Constructor con parámetros
   * 
   * @param engine    Motor
   * @param wheelsSet Conjunto de ruedas
   * @param gearbox   Caja de cambios
   */
  public Vehicle(Engine engine, WheelsSet wheelsSet, Gearbox gearbox) {
    this.engine = engine;
    this.wheelsSet = wheelsSet;
    this.gearbox = gearbox;
  }

  /**
   * Getter - engine
   * 
   * @return Engine
   */
  public Engine getEngine() {
    return engine;
  }

  /**
   * Setter - engine
   * 
   * @param engine Motor del vehículo
   */
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  /**
   * Getter - wheelsSet
   * 
   * @return WheelsSet
   */
  public WheelsSet getWheelsSet() {
    return wheelsSet;
  }

  /**
   * Setter - wheelsSet
   * 
   * @param wheelsSet Conjunto de ruedas
   */
  public void setWheelsSet(WheelsSet wheelsSet) {
    this.wheelsSet = wheelsSet;
  }

  /**
   * Getter - gearbox
   * 
   * @return Gearbox
   */
  public Gearbox getGearbox() {
    return gearbox;
  }

  /**
   * Setter - gearbox
   * 
   * @param gearbox Caja de cambios del vehículo
   */
  public void setGearbox(Gearbox gearbox) {
    this.gearbox = gearbox;
  }

}
