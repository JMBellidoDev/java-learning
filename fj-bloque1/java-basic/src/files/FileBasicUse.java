package files;

import java.io.File;

/** Clase ejemplo de uso básico de la clase File */
public class FileBasicUse {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    File f = new File("./");
    System.out.println("Is File: " + f.isFile());
    System.out.println("Is Directory: " + f.isDirectory());
    System.out.println("Name: " + f.getName());
    System.out.println("Can be read: " + f.canRead());

    File[] content = f.listFiles();
    for (File file : content) {
      System.out.println("\nContent: Is File: " + file.isFile());
      System.out.println("Content: Is Directory: " + file.isDirectory());
      System.out.println("Content: Name: " + file.getName());
      System.out.println("Content: Can be read: " + file.canRead());
    }

  }

}
