package ejercicio03;

/**
 * Clase punto
 * 
 * @author Nestor Sanchez
 */
public class Punto {

	/**
	 * int x: coordenada X del punto
	 */
	private int x;

	/**
	 * int y: coordenada Y del punto
	 */
	private int y;

	/**
	 * Constructor sin parametros
	 */
	public Punto() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param x coordenada X del punto
	 * @param y coordenada Y del punto
	 */
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * funcion imprime: imprime la coordenada por pantalla
	 */
	public void imprime() {
		System.out.println("(" + x + ", " + y + ")");
	}

	/**
	 * funcion setXY: establece las coordenadas a las elegidas por el usuario
	 * 
	 * @param x coordenada X elegida por el usuario
	 * @param y coordenada Y elegida por el usuario
	 */
	public void setXY(int x, int y) {
		// Setter X
		this.x = x;

		// Setter Y
		this.y = y;
	}

	/**
	 * funcion desplaza: desplaza la cantidad indicada
	 * 
	 * @param dx: posiciones a desplazar en x
	 * @param dy: posiciones a desplazar en y
	 */
	public void desplaza(int dx, int dy) {

		// Establece la nueva coordenada sumando dx a x, y dx a y respectivamente
		x = x + dx;
		y = y + dy;

	}

	/**
	 * funcion distancia: calcula la distancia entre el objeto y otro objeto
	 * @param x posicion x de la otra distancia
	 * @param y posicion y de la otra distancia
	 * @return la cantidad de distancia entre un punto y otro
	 */
	public int distancia(int x, int y) {

		// Devuelve la formula al Main
		return (int) Math.sqrt(Math.pow((x-this.x), 2)+(Math.pow((y-this.y), 2)));
		
	}

}
