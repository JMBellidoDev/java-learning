package polymorphism;

/** Clase A */
class A {

  /** Método estático foo */
  static void foo() {
    System.out.println("Foo");
  }
}

/** Clase B */
class B extends A {

  /** Método estático foo "heredado" */
  static void foo() {
    System.out.println("Foo");
  }
}

/** Clase de ejemplo con métodos estáticos y polimorfismo */
class StaticPolymorphism {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Es mala práctica usar métodos estáticos desde instancia, pero puede hacerse
    // Sin embargo, no funciona la herencia. Se llama al método de la clase padre
    A a = new B();
    a.foo();
  }

}
