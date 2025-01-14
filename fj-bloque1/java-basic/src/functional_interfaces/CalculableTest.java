package functional_interfaces;

/** Prueba sobre la interfaz Calculable */
public interface CalculableTest {

  /**
   * Método principal
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Clase anónima
    Calculable calc = new Calculable() {

      @Override
      public double avg(double... values) {
        double sum = 0.0;

        for (int i = 0; i < values.length; i++) {
          sum += values[i];
        }
        return sum / values.length;
      }
    };

    System.out.println(calc.avg(2, 3, 5, 10.2, 4.1));

    // Lambda
    Calculable calcLambda = (double... values) -> {
      double sum = 0.0;

      for (int i = 0; i < values.length; i++) {
        sum += values[i];
      }
      return sum / values.length;
    };
    System.out.println(calcLambda.avg(2, 3, 5, 10.2, 4.1));

  }

}
