package sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/** Ejemplo de un cliente del socket */
public class MyClientSocket {

  /**
   * Método main
   * 
   * @param args Argumentos
   * @throws IOException
   * @throws UnknownHostException
   */
  public static void main(String[] args) throws IOException {

    try (Socket socket = new Socket("localhost", 8090);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {

      dos.writeUTF("Hola soy un cliente del socket");
      dos.writeUTF("salir");

    }

  }

}
