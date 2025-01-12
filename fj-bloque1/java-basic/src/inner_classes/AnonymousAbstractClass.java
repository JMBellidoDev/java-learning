package inner_classes;

/** Mi Clase anónima */
abstract class MyAnonymousClass {

  /** Método foo */
  abstract void foo();
}

/** Ejemplo de clase anónima abstracta */
public class AnonymousAbstractClass {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    MyAnonymousClass mac = new MyAnonymousClass() {

      @Override
      void foo() {
        System.out.println("Foo");
      }
    };

    mac.foo();
  }

}
