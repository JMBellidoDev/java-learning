package inner_classes;

/** Clase externa */
class External {

  /** Método foo */
  void foo() {
    System.out.println("Foo");
  }

  /** Clase interna */
  class Internal {

    /** Método bar */
    void bar() {
      System.out.println("Bar");
    }
  }
}

/** Ejemplo de clase interna regular */
public class RegularInnerClass {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    External ex = new External();
    ex.foo();

    // Internal in = new Internal(); -> Excepción. No se puede acceder desde fuera
    External.Internal in = ex.new Internal();
    in.bar();

  }

}
