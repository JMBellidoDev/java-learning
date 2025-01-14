package math.execution;

import math.calcs.Calculator;

/** Testeo de ejemplo para el funcionamiento del módulo */
public class Test {

  /**
   * Clase main de pruebas
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    Calculator calc = new Calculator();
    System.out.println(calc.sum(10, 20));

    // No se puede acceder al código inferior debido al module-info y a los paquetes exportados
    // CalculatorProcessor cp = new CalculatorProcessor();
  }

}
