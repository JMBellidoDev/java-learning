package inheritance;

/** Ejemplo de uso de una interfaz con métodos estáticos */
interface MyInterface2 {

  /**
   * Se permite el uso de métodos estáticos en una interfaz. Necesitan ser desarrollados y no pueden sobreescribirse
   */
  default void testMethod() {
    System.out.println("Método default creado en interfaz");
  }
}

/** Clase que implementa la interfaz con método default */
class InterfaceImplementation implements MyInterface2 {

}

/** Clase de ejemplo para una interfaz con método default */
public class DefaultMethodInterfaceExample {
  /**
   * Método main. Hace las pruebas sobre la interfaz anterior
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    InterfaceImplementation ii = new InterfaceImplementation();
    ii.testMethod();
  }
}
