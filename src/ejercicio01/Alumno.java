package ejercicio01;

/**
 * Clase Alumno
 * @author Nestor Sanchez
 */
public class Alumno {
	
	/**
	 * String nombre: nombre del alumno
	 */
	private String nombre;
	
	/**
	 * double notaMedia: nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor sin parametros
	 */
	public Alumno() {
		super();
	}

	/**
	 * Constructor con parametros
	 * @param nombre nombre del alumno
	 * @param notaMedia nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	
	/**
	 * Funcion toString: devuelve el nombre y la nota media del alumno
	 */
	public String toString() {
		return nombre + ", " + notaMedia;
	}
	
	/**
	 * Getter getNombre
	 * @return nombre del alumno
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Getter getNotaMedia
	 * @return nota media del alumno
	 */
	public double getNotaMedia() {
		return this.notaMedia;
	}
	
	/**
	 * Setter setNombre
	 * @param nombre nombre del Main
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Setter setNotaMedia
	 * @param notaMedia nota media del Main
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
}