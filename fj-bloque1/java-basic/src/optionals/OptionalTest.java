package optionals;

import java.util.Optional;

/** Prueba con la clase Optional */
public class OptionalTest {

  /** Lista de nombres */
  private static String[] names = { "Alex", "Jose", "Maria" };

  /**
   * Método de búsqueda por nombre
   * 
   * @param n Nombre a buscar
   * @return Optional(String)
   */
  public static Optional<String> findByName(String n) {

    for (String name : names) {
      if (n.equals(name)) {
        return Optional.of(name);
      }
    }
    return Optional.empty();
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    Optional<String> optByName = findByName("Pedro");
    System.out.println(optByName.isPresent() ? optByName.get().toUpperCase() : "Nombre no encontrado");
  }

}
