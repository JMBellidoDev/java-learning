package inheritance;

/** Interfaz Bar */
interface Bar {

  /** Método público */
  default void publicFoo() {
    System.out.println("Método público");
    foo();
  }

  /** Método privado. Permite modularizar la lógica de métodos default */
  private void foo() {
    System.out.println("Método privado");
  }

}

/** Implementación de la interfaz Bar */
class BarImpl implements Bar {

}

/** Ejemplo de uso de interfaces con métodos privados */
public class PrivateMethodInterfaceExample {

  /**
   * Método main. Realiza el ejemplo
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {
    BarImpl barImpl = new BarImpl();
    barImpl.publicFoo();
  }

}
