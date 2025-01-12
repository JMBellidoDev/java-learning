package inheritance.exercise;

/** Dispositivo electrónico */
public class Device {
  
  /** ID del dispositivo */
  protected Long deviceId;

  /**
   * Método para encender un dispositivo
   * @param device Dispositivo a encender
   */
  void turnOn(Device device) {
    
    System.out.printf("Dispositivo con ID: %d encendido%n", deviceId);
  }
  
  /**
   * Método para apagar un dispositivo
   * @param device Dispositivo a apagar
   */
  void turnOff(Device device) {
    
    System.out.printf("Dispositivo con ID: %d apagado%n", deviceId);
  }
  
}
