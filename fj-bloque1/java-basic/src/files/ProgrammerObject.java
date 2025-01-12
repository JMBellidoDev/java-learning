package files;

import java.io.Serializable;

/** Objeto programador */
public class ProgrammerObject implements Serializable {

  /** SerialVersionUID */
  private static final long serialVersionUID = 1L;

  /** Nombre completo */
  private String name;

  /** Lenguaje de programación */
  private String language;

  /**
   * Constructor
   * 
   * @param name     Nombre completo
   * @param language Lenguaje de programación
   */
  public ProgrammerObject(String name, String language) {
    this.name = name;
    this.language = language;
  }

  /**
   * Obtiene el nombre del programador
   * 
   * @return String
   */
  public String getName() {
    return name;
  }

  /**
   * Obtiene el lenguaje del programador
   * 
   * @return String
   */
  public String getLanguage() {
    return language;
  }

  @Override
  public String toString() {
    return "ProgrammerObject [name=" + name + ", language=" + language + "]";
  }

}
