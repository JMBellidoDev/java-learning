package class_blocks;

/**
 * Clase de ejemplo con bloques estáticos. Éstos son bloques de código que se usan para ejecutar código de forma estática durante la
 * creación del objeto
 */
public class StaticBlocks {

  static {
    System.out.println("Hola mundo desde un bloque estático");
  }

  static {
    System.out.println("Hola mundo desde otro bloque estático");
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {
    // No es necesario ejecutar código. El método main hace una carga de la clase en la ejecución
  }

}
