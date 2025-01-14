package reflection.hidden;

/** Clase con un método cuyo modificador de acceso es default */
public class DefaultModifierClass {

  /** Constructor privado */
  private DefaultModifierClass() {
  }

  /** Método que saluda */
  void sayHello() {
    System.out.println("Hello");
  }

}
