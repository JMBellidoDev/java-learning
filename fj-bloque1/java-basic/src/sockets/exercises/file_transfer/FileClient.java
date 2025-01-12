package sockets.exercises.file_transfer;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/** Cliente emisor de ficheros mediante ServerSocket */
public class FileClient {

  /**
   * Método main del cliente. Envía un fichero a través de socket
   * 
   * @param args Argumentos
   * @throws IOException
   * @throws UnknownHostException
   */
  public static void main(String[] args) throws UnknownHostException, IOException {

    try (Socket socket = new Socket("localhost", 8090);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      // Se solicitan los datos
      System.out.println("Introduce el nombre del archivo de salida");
      String fileName = br.readLine();

      System.out.println("Introduce la ruta hacia el fichero");
      String filePath = br.readLine();

      File file = new File(filePath);
      if (!file.exists()) {
        throw new IOException("El fichero no existe");
      }

      try (FileInputStream fis = new FileInputStream(file)) {

        // Se envía el nombre del fichero y el fichero en sí mismo
        dos.writeUTF(fileName);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
          os.write(buffer, 0, bytesRead);
        }

      }

    }

  }

}
