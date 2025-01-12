package sockets.exercises.file_transfer;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

/** Servidor de ficheros */
public class FileServer {

  /**
   * Método main. Lanza el servidor ServerSocket a la espera de un cliente y lee un archivo completo
   * 
   * @param args Argumentos
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {

    System.out.println("Escuchando peticiones...");

    // Creación y puesta en marcha del socket y stream de entrada
    try (ServerSocket socket = new ServerSocket(8090);
        Socket client = socket.accept();
        InputStream is = client.getInputStream();
        DataInputStream dis = new DataInputStream(is)) {

      System.out.printf("Cliente %s conectado%n", client.getInetAddress().getHostName());

      // Lectura del nombre del fichero
      String fileName = dis.readUTF();

      if (Files.exists(Path.of(fileName))) {
        throw new IOException("El fichero ya existe previamente");
      }

      // Lectura del fichero por bytes y escritura
      try (FileOutputStream fos = new FileOutputStream(String.format(".%sfile-resources%s%s", File.separator, File.separator, fileName))) {
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = is.read(buffer)) != -1) {
          fos.write(buffer, 0, bytesRead);
        }
      }
    }
    System.out.println("Fichero copiado correctamente.");

  }

}
