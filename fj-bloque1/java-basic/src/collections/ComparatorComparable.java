package collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/** Gato */
class Cat implements Comparable<Cat> {

  /** Nombre del gato */
  private String name;

  /** Apellidos del gato */
  private String lastname;

  /**
   * Constructor
   * 
   * @param name     Nombre del gato
   * @param lastname Apellidos del gato
   */
  public Cat(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }

  @Override
  public String toString() {
    return String.format("Cat: Name= %s %s", name, lastname);
  }

  @Override
  public int compareTo(Cat c) {
    return name.compareTo(c.name) != 0 ? name.compareTo(c.name) : lastname.compareTo(c.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastname, name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Cat other = (Cat) obj;
    return Objects.equals(lastname, other.lastname) && Objects.equals(name, other.name);
  }

  /**
   * Getter - name
   * 
   * @return String
   */
  public String getName() {
    return name;
  }

  /**
   * Getter - lastname
   * 
   * @return String
   */
  public String getLastname() {
    return lastname;
  }

}

/** Ejemplo de uso de las interfaces Comparable y Comparator en colecciones */
public class ComparatorComparable {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    // Uso por defecto de la interfaz Comparable
    Set<Cat> catsWithComparable = new TreeSet<>();
    catsWithComparable.add(new Cat("Garfield", "Odd"));
    catsWithComparable.add(new Cat("Tom", "A"));
    catsWithComparable.add(new Cat("Tom", "B"));
    catsWithComparable.add(new Cat("Silvestre", "Pi"));

    System.out.println(catsWithComparable);

    // Uso de Comparator
    Comparator<Cat> comparatorReversed = (a, b) -> b.getName().compareTo(a.getName()) != 0 ? b.getName().compareTo(a.getName())
        : b.getLastname().compareTo(a.getLastname());

    Set<Cat> catsWithComparator = new TreeSet<>(comparatorReversed);
    catsWithComparator.add(new Cat("Garfield", "Odd"));
    catsWithComparator.add(new Cat("Tom", "A"));
    catsWithComparator.add(new Cat("Tom", "B"));
    catsWithComparator.add(new Cat("Silvestre", "Pi"));

    System.out.println(catsWithComparator);

  }

}
