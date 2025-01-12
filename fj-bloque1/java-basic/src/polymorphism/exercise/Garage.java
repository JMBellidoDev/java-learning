package polymorphism.exercise;

/** Taller de reparación */
public class Garage {

  /** Constructor privado. Evita instanciación de clase */
  private Garage() {
  }

  /**
   * Método para reparar una pieza del vehículo
   * 
   * @param vehicle Vehículo a reparar
   */
  public static void repairCarPart(Vehicle vehicle) {

    vehicle.getEngine().repair();
    vehicle.getWheelsSet().repair();
  }

}
