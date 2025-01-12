package flow_control;

/** Ejercicio de tablas de multiplicar */
public class MultiplicationTableExercise {

  /**
   * Método main. Imprime únicamente las tablas de multiplicar sobre números impares, del 1 al 10
   * @param args Argumentos
   */
  public static void main(String[] args) {
    
    for (int i = 1; i < 11; i++) {
      
      if (i % 2 == 0) {
        continue;
      
      } else {
        System.out.printf("%nTABLA DE MULTIPLICAR DEL %d%n", i);
      }
      
      for (int j = 0; j < 10; j++) {
        System.out.printf("%d X %d = %d%n", i, j, i * j);
      }
    }
    
  }
  
}
