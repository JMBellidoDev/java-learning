package math.calcs;

import math.operations.CalculatorProcessor;

/** Calculadora */
public class Calculator {

  /** Procesador de cálculos */
  private CalculatorProcessor processor = new CalculatorProcessor();

  /**
   * Operación suma
   * 
   * @param x Número x
   * @param y Número y
   * @return int
   */
  public int sum(int x, int y) {
    System.out.printf("Sumando %d + %d%n", x, y);
    return processor.sum(x, y);
  }

}
