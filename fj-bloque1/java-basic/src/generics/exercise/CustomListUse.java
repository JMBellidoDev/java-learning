package generics.exercise;

/** Clase de uso de la lista personalizada */
public class CustomListUse {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    CustomList<String> customList = new CustomList<>();

    customList.add("Primero");
    customList.add("Segundo");
    customList.add("Tercero");
    customList.add("Último");

    System.out.printf("Existe Segundo: %b%n", customList.find("Segundo"));
    System.out.printf("Se elimina Segundo: %b%n", customList.remove("Segundo"));

    System.out.printf("Se elimina Tercero: %b%n", customList.remove("Tercero"));
    System.out.printf("Se elimina Primero: %b%n", customList.remove("Primero"));
    System.out.printf("Se elimina Último: %b%n", customList.remove("Último"));

  }

}
