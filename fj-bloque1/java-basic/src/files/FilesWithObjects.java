package files;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/** Clase de tratamiento de ficheros con objetos */
public class FilesWithObjects {

  /**
   * Método main
   * 
   * @param args Argumentos
   * @throws IOException
   */
  public static void main(String[] args) throws IOException, ClassNotFoundException {

    ProgrammerObject[] programmers = new ProgrammerObject[] { new ProgrammerObject("Alex", "Java"),
        new ProgrammerObject("Paco", "Javascript"), new ProgrammerObject("Juan", "Python") };

    File file = new File("./file-resources/programmers.txt");

    // Creación del fichero si no existe y escritura de objetos
    if (!file.exists()) {
      boolean fileCreated = file.createNewFile();
      if (!fileCreated) {
        throw new IOException("Problem occurred while creating the new file");
      }
    }

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
      for (ProgrammerObject prog : programmers) {
        oos.writeObject(prog);
      }
    }

    // Lectura de objetos
    List<ProgrammerObject> programmersRead = new ArrayList<>();
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

      ProgrammerObject prog = null;
      while ((prog = (ProgrammerObject) ois.readObject()) != null) {
        programmersRead.add(prog);
      }
    } catch (EOFException e) {
      // No se hace nada. Se ha alcanzado el final del archivo
    }

    System.out.println(programmersRead);
  }

}
