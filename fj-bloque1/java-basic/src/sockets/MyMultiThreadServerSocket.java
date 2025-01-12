package sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** Socket escuchador */
class WorkerSocket extends Thread {

  /** Cliente de conexión */
  private Socket client;

  /**
   * Constructor
   * 
   * @param client Cliente de conexión
   */
  public WorkerSocket(Socket client) {
    this.client = client;
  }

  @Override
  public void run() {

    try (DataInputStream dis = new DataInputStream(client.getInputStream())) {

      String message;
      do {
        message = dis.readUTF();
        System.out.printf("%s: %s%n", client.getInetAddress().getHostName(), message);

      } while (!message.equals("salir"));

    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

  }

}

/** Server Socket multi hilo */
public class MyMultiThreadServerSocket {

  /**
   * Método main
   * 
   * @param args Argumentos
   * @throws IOException
   */
  public static void main(String[] args) throws IOException {

    try (ServerSocket ss = new ServerSocket(8090)) {

      while (true) {
        System.out.println("Escuchando clientes...");
        Socket client = ss.accept();
        System.out.printf("Cliente conectado: %s%n", client.getInetAddress().getHostName());
        new WorkerSocket(client).start();
      }
    }

  }

}
