package reflection.visible;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/** Test de Reflection */
public class ReflectionTest {

  /**
   * Método main
   * 
   * @param args Argumentos
   * @throws Exception En caso de error
   */
  public static void main(String[] args) throws Exception {

    // Acceso al constructor y modificación de su acceso
    Class<?> className = Class.forName("reflection.hidden.DefaultModifierClass");
    Constructor<?> constructor = className.getDeclaredConstructor();

    System.out.println(constructor);

    constructor.setAccessible(true);
    Object instance = constructor.newInstance();

    // Acceso a todos los métodos
    Method[] methods = className.getDeclaredMethods();
    for (Method method : methods) {

      System.out.println(method.getName());

      if (method.getName().equals("sayHello")) {
        method.setAccessible(true);
        method.invoke(instance);
      }
    }

  }

}
