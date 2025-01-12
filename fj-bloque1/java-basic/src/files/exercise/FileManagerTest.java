package files.exercise;

/** Clase de pruebas del Manejador de ficheros */
public class FileManagerTest {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    try {
      System.out.println("Carpeta actual");
      FileManager.dir("./");

      System.out.println("\nCarpeta anterior");
      FileManager.dir("../");

      FileManager.cp("./file-resources/texto.txt", "./file-resources/texto-copiado.txt");

    } catch (IllegalArgumentException e) {
      System.out.printf("Ruta hacia el fichero incorrecta: " + e.getMessage());
    }

  }

}
