package generics;

import java.util.List;

/** Uso de ejemplo de wildcards. Forma de usar valores similar a genéricos pero sin necesidad de estos. Restringe las clases a usar */
public class WildCards {

  /**
   * Suma los valores aportados en una lista
   * 
   * @param values Lista de valores
   * @return double
   */
  static double sumValues(List<? extends Number> values) {

    double sum = 0.0;

    for (Number value : values) {
      sum += value.doubleValue();
    }

    return sum;
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    double sum = sumValues(List.of(10.4, 11.50, 10, 10.5f, 1200L));
    System.out.printf("Suma: %.2f", sum);

  }

}
