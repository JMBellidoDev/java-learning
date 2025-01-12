package access_modifiers;

/**
 * Clase que llama a la clase Prueba. Verifica que se pueden llamar a atributos default y protected desde el mismo paquete, aunque sea sin
 * herencia
 */
public class LlamadorDePrueba {

  /**
   * Método principal
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    Prueba prueba = new Prueba();
    System.out.printf("Llamada al atributo a: %d%n", prueba.a);
    System.out.printf("Llamada al atributo b: %d%n", prueba.b);

  }

}
