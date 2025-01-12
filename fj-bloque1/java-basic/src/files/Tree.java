package files;

import java.io.File;

/** Árbol de ficheros */
public class Tree {

  /**
   * Método que muestra por consola el árbol de ficheros
   * 
   * @param files Ficheros
   * @param tabs  tabulaciones a la izquierda
   */
  private static void print(File[] files, String tabs) {

    String spaces = tabs.concat("-");

    if (files != null) {
      for (File file : files) {

        if (file.isFile()) {
          System.out.printf("%s %s %n", spaces, file.getName());

        } else {
          System.out.printf("%s %s %n", spaces, file.getName());
          print(file.listFiles(), spaces);
        }
      }
    }
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    File f = new File("C:\\Users\\jmarbell");
    System.out.println(f.getName());
    print(f.listFiles(), "-");
  }

}
