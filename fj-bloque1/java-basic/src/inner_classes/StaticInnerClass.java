package inner_classes;

/** Clase externa */
class ExternalStatic {

  /** Método foo */
  void foo() {
    System.out.println("Foo");
  }

  /** Clase interna */
  static class InternalStatic {

    /** Método bar */
    void bar() {
      System.out.println("Bar");
    }
  }
}

/** Ejemplo de clase interna estática */
public class StaticInnerClass {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    ExternalStatic.InternalStatic inStatic = new ExternalStatic.InternalStatic();
    inStatic.bar();
  }

}
