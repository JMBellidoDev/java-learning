package enums;

/** Sabor de palomitas */
public enum PopcornFavour {

  /** Sabor chili */
  CHILI("chile", 3.2),

  /** Sabor mantequilla */
  BUTTER("mantequilla", 3.6),

  /** Sabor Queso */
  CHEESE("queso", 4.1),

  /** Sabor caramelo */
  CARAMEL("caramelo", 3.8);

  /** Nombre comercial */
  private String tradeName;

  /** Precio de venta */
  private double price;

  /**
   * Constructor
   * 
   * @param tradeName Nombre comercial
   * @param price     Precio de venta
   */
  private PopcornFavour(String tradeName, double price) {
    this.tradeName = tradeName;
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("Precio de venta de las palomitas sabor %s: %.2f€", tradeName, price);
  }

  /**
   * Método main
   * 
   * @param args Argumentos
   */
  public static void main(String[] args) {

    System.out.println(PopcornFavour.CARAMEL.name());
    System.out.println(PopcornFavour.CARAMEL);

  }

}
