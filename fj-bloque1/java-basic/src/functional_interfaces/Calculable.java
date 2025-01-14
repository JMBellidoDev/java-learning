package functional_interfaces;

/** Interfaz funcional */
public interface Calculable {

  /**
   * Calcula la media de una serie de valores
   * 
   * @param values Valores
   * @return double
   */
  double avg(double... values);

}
