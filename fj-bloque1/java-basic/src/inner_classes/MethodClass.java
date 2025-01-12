package inner_classes;

/** Ejemplo de clase a nivel de método */
public class MethodClass {

  /** Método foo */
  static void foo() {

    // Clase interna del método
    class MethodInnerClass {
      void bar() {
        System.out.println("Bar");
      }
    }

    MethodInnerClass in = new MethodInnerClass();
    in.bar();
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {
    foo();
  }

}
