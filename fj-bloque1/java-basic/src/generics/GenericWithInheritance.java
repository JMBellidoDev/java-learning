package generics;

/** Vehículo genérico */
class Vehiculo {
}

/** Coche */
class Coche extends Vehiculo {
}

/** Coche deportivo */
class Deportivo extends Coche {
}

/**
 * Clase de genéricos con herencia
 * 
 * @param <T> Vehiculo o subtipo
 */
public class GenericWithInheritance<T extends Vehiculo> {

  /** Valor a almacenar */
  private T value;

  /**
   * Constructor
   * 
   * @param value Valor de la clase genérica
   */
  public GenericWithInheritance(T value) {
    this.value = value;
  }

  /**
   * Getter - value
   * 
   * @return T
   */
  public T getValue() {
    return value;
  }

  /**
   * Setter - value
   * 
   * @param value Valor a almacenar
   */
  public void setValue(T value) {
    this.value = value;
  }

  /**
   * Método principal
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    GenericWithInheritance<Vehiculo> genericVehiculo = new GenericWithInheritance<>(new Vehiculo());
    System.out.println(genericVehiculo.getValue());

    GenericWithInheritance<Deportivo> genericDeportivo = new GenericWithInheritance<>(new Deportivo());
    System.out.println(genericDeportivo.getValue());

  }

}
