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
	 * @param x coordenada X elegida por el usuario
	 * @param y coordenada Y elegida por el usuario
	 */
	public void setXY(int x, int y) {
		// Setter X
		this.x = x;
		
		// Setter Y
		this.y = y;
	}

}
