package sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** Ejemplo de uso de Server Sockets */
public class MyServerSocket {

  /**
   * Método main. Lanza el servidor ServerSocket a la espera de un cliente y lee sus mensajes
   * 
   * @param args Argumentos
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {

    System.out.println("Escuchando peticiones...");

    // Creación y puesta en marcha del socket. accept espera hasta obtener una conexión
    try (ServerSocket socket = new ServerSocket(8090);
        Socket client = socket.accept();
        DataInputStream dis = new DataInputStream(client.getInputStream())) {

      System.out.printf("Cliente %s conectado%n", client.getInetAddress().getHostName());

      String message = null;
      do {
        message = dis.readUTF();
        System.out.printf("%s: %s%n", client.getInetAddress().getHostName(), message);

      } while (!message.equals("salir"));
    }
  }

}
