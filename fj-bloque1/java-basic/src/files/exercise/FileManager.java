package files.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/** Manejador de archivos */
public class FileManager {

  /** Constructor privado. Evita instanciación de clase */
  private FileManager() {
  }

  /**
   * Método que informa de los archivos y carpetas de la ruta dada como parámetro
   * 
   * @param dirPath Ruta base a informar
   * @throws IllegalArgumentException En caso de ruta no válida
   */
  public static void dir(String dirPath) {

    File file = new File(dirPath);

    if (!file.isDirectory()) {
      throw new IllegalArgumentException("La ruta especificada no es una ruta válida");
    }

    File[] filesArray = file.listFiles();
    for (File fileToPrint : filesArray) {

      LocalDateTime lastModified = LocalDateTime.ofInstant(Instant.ofEpochMilli(fileToPrint.lastModified()), ZoneId.of("UTC"));
      System.out.printf("%s   %s    %s%n", lastModified.format(DateTimeFormatter.ISO_DATE), fileToPrint.isFile() ? "<FIL>" : "<DIR>",
          fileToPrint.getName());
    }

  }

  /**
   * Método que copia un fichero de una ruta original a una ruta final. En caso de existir previamente, sobreescribe el fichero
   * 
   * @param originPath Ruta hacia el fichero original
   * @param finalPath  Ruta hacia el fichero destino
   */
  public static void cp(String originPath, String finalPath) {

    try {
      Files.copy(Path.of(originPath), Path.of(finalPath), StandardCopyOption.REPLACE_EXISTING);

    } catch (IOException e) {
      System.out.printf("Error al copiar el archivo: %s", e.getMessage());
    }
  }

}
