package class_blocks;

/** Persona */
class Person {

  /** Número de personas */
  static int peopleNumber = 0;

  /** Nombre de la persona */
  String name = "NS/NC";

  // Bloque anónimo
  {
    peopleNumber++;
  }

  /** Constructor sin parámetros */
  public Person() {
  }

  /**
   * Constructor con parámetros
   * 
   * @param name Nombre de la persona
   */
  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Persona nº %d: %s", peopleNumber, name);
  }

}

/**
 * Clase de ejemplo con bloques anónimos. Éstos son bloques de código que se ejecutan en la construcción de un objeto, independientemente
 * del constructor al que se ha llamado durante el proceso
 */
public class AnonymousBlocks {

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.toString());

    Person p2 = new Person();
    System.out.println(p2.toString());

    Person p3 = new Person("Alex");
    System.out.println(p3.toString());

    Person p4 = new Person("Juan");
    System.out.println(p4.toString());

  }

}
