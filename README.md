# OOPJavaSE

Los enumerations son tipos de datos muy especiales pues este, es el único en su tipo que sirve para declarar una colección de constantes, al ser así estaremos obligados a escribirlos con mayúsculas.

Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes. Por ejemplo los días de la semana.

Así podemos declarar un enumeration usando la palabra reservada enum.

public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}
Puedo crear referencias de enumerations de la siguiente forma:

Day day;
switch (day) {
	case MONDAY:
		System.out.println(“Mondays are good.”);
		break;
	case FRIDAY:
		System.out.println(“Fridays are nice”);
		break;
	case SATURDAY: case: SUNDAY:
		System.out.println(“Weekends are the best”);
		break;
	default:
		System.out.println(“Midweek are so-so”);
		break;

}
Y puedo llamar un valor del enumeration así:

Day.MONDAY;
Day.FRIDAY;
Day.SATURDAY
Los enumerations pueden tener atributos, métodos y constructores, como se muestra:

public enum Day {
  MONDAY("Lunes");
  TUESDAY("Jueves");
  FRIDAY("Viernes");
  SATURDAY("Sábado");
  SUNDAY("Domingo");

  private String spanish;
  private Day(String s) {
    spanish = s;
  }

  private String getSpanish() {
    return spanish;
  }
}
Y para utilizarlo lo podemos hacer así:

System.out.println(Day.MONDAY);
Imprimirá: MONDAY

System.out.println(Day.MONDAY.getSpanish());
Imprimirá: Lunes

Las Interfaces nos permiten usar métodos abstractos y campos constantes para implementar herencia/polimorfismo de forma muy similar a las clases abstractas.

A partir de Java 8 podemos tener implementación en métodos para heredar y reutilizar diferentes comportamientos. No todos los métodos de nuestras interfaces deben ser abstractos, ahora podemos usar el modificador de acceso default y desde Java 9 también private.

Recuerda que el nivel de acceso de default y private son los mismos que estudiamos en clases anteriores.

Las interfaces pueden heredar de otras interfaces utilizando la palabra clave extends, el concepto de herencia se aplicará como naturalmente se practica en clases, es decir, la interfaz heredará y adquirirá los métodos de la interfaz padre.

Una cosa interesante que sucede en caso de herencia con interfaces es que, aquí sí es permitido la herencia múltiple como ves a continuación:

public interface IReadable {
	public void read();
}


public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
}
Además siguiendo las implementaciones de métodos default y private de las versiones Java 8 y 9 respectivamente podemos sobreescribir métodos y añadirles comportamiento, si es el caso.

public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
	
@Override
	default void read() {
	// TODO Auto-generated method stub
}
}
