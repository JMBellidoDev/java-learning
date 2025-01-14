package inheritance;

/** Ejemplo de uso de una interfaz con métodos estáticos */
interface MyInterface {

  /**
   * Se permite el uso de métodos estáticos en una interfaz. Necesitan ser desarrollados y no pueden sobreescribirse
   */
  public static void testMethod() {
    System.out.println("Método estático creado en interfaz");
  }

}

/** Clase de pruebas */
public class StaticMethodInterfaceExample {

  /**
   * Método main. Hace las pruebas sobre la interfaz anterior
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    MyInterface.testMethod();
  }
}
