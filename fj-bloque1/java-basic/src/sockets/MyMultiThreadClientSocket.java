package sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/** Cliente del socket multihilo */
public class MyMultiThreadClientSocket {

  /** BufferedReader desde teclado */
  private static BufferedReader br;

  /**
   * Lee un mensaje del usuario
   * 
   * @return String
   * @throws IOException
   */
  public static String readMessage() throws IOException {

    System.out.print("\n->");
    return br.readLine();

  }

  /**
   * Método main
   * 
   * @param args Argumentos
   * @throws IOException
   * @throws UnknownHostException
   */
  public static void main(String[] args) throws IOException {

    try (Socket socket = new Socket("localhost", 8090);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

      br = bufferedReader;
      String message = null;
      do {
        message = readMessage();
        dos.writeUTF(message);

      } while (!"salir".equals(message));

    }

  }
}
