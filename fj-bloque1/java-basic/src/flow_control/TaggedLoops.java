package flow_control;

/** Clase para el aprendizaje de bucles o ciclos anidados con Tags */
public class TaggedLoops {
  
  /**
   * Clase principal
   * @param args Argumentos
   */
  public static void main(String[] args) {
    
    outer: for (int i = 1; i < 10; i++) {
      
      for (int j = 1; j < 10; j++) {
        
        if (i % 3 == 0) {
          break outer;
        }
        
        System.out.printf("%d X %d = %d%n", i, j, i * j);
        
      }
    }
    
  }

}
