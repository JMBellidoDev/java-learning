package arrays;

/** Formas de inicializar un array */
public class ArrayInitialization {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Forma explícita
    String[] names = new String[2];
    names[0] = "A";
    names[1] = "B";

    // Forma implícita. Esta forma no permite su uso sin asignar a variable
    String[] names2 = { "A", "B" };

    // Forma anónima
    String[] names3 = new String[] { "A", "B" };

    // Sysos únicamente para evitar warnings
    System.out.println(names);
    System.out.println(names2);
    System.out.println(names3);
  }

}
