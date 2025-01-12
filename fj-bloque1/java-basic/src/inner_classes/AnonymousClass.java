package inner_classes;

/** MyClass */
class MyClass {

  /** Método foo */
  void foo() {
    System.out.println("Foo");
  }
}

/** Ejemplo de clase anónima */
public class AnonymousClass {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Clase anónima que hereda de MyClass
    MyClass mc = new MyClass() {

      @Override
      void foo() {
        System.out.println("Bar");
      }
    };
    mc.foo();
  }

}
