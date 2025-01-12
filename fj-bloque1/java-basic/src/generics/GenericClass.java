package generics;

/**
 * Clase genérica
 * 
 * @param <T> Tipo genérico de clase
 */
public class GenericClass<T> {

  /** Valor a almacenar */
  private T value;

  /**
   * Constructor
   * 
   * @param value Valor de la clase genérica
   */
  public GenericClass(T value) {
    this.value = value;
  }

  /**
   * Getter - value
   * 
   * @return T
   */
  public T getValue() {
    return value;
  }

  /**
   * Setter - value
   * 
   * @param value Valor a almacenar
   */
  public void setValue(T value) {
    this.value = value;
  }

  /**
   * Método principal
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    GenericClass<String> genericString = new GenericClass<>("Jose");
    System.out.println(genericString.getValue());

    GenericClass<Integer> genericInteger = new GenericClass<>(2);
    System.out.println(genericInteger.getValue());

  }
}
