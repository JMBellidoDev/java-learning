package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/** Tratamiento de datos desde fichero */
public class FileTreatment {

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    File f = new File("./file-resources/texto.txt");

    // Lectura desde teclado y escritura hacia fichero
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(f)) {

      System.out.println("Indica un nombre: ");
      String nombre = br.readLine();

      pw.printf("Hola desde java, %s", nombre);

    } catch (IOException e) {
      e.printStackTrace();
    }

    // Lectura desde fichero
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
      System.out.println(br.readLine());

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
