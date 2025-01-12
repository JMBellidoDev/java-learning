package inheritance;

/** Animal */
class Animal {

  /** Nombre del animal */
  String nombre;
}

/** Perro */
class Perro extends Animal {
  
}

/** Gato */
class Gato extends Animal {
  
}

/** Clase de ejemplo para el uso de instanceof */
public class InstanceOf {

  /**
   * Método principal
   * @param args Argumentos
   */
  public static void main(String[] args) {
    
    Perro perro = new Perro();
    perro.nombre = "Mia";
    
    System.out.println(perro instanceof Animal);
    System.out.println(perro instanceof Object);
    System.out.println(perro instanceof Perro);
    
    Animal perro2 = new Perro();
    
    System.out.println(perro2 instanceof Animal);
    System.out.println(perro2 instanceof Object);
    System.out.println(perro2 instanceof Perro);
    
  }
  
}
