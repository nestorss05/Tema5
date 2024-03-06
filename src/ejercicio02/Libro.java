package ejercicio02;

/**
 * Clase libro
 * 
 * @author Nestor Sanchez
 */
public class Libro {

	/**
	 * String titulo: titulo del libro
	 */
	private String titulo = "";

	/**
	 * String autor: autor del libro
	 */
	private String autor = "";

	/**
	 * int nEjemplares: nº de ejemplares de un libro
	 */
	private int nEjemplares = 0;

	/**
	 * int nPrestados: nº de ejemplares prestados de un libro
	 */
	private int nPrestados = 0;

	/**
	 * Constructor sin parametros
	 */
	public Libro() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param titulo      titulo del libro
	 * @param autor       autor del libro
	 * @param nEjemplares nº de ejemplares de un libro
	 * @param nPrestados  nº de ejemplares prestados de un libro
	 */
	public Libro(String titulo, String autor, int nEjemplares, int nPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
	}
	
	
	private boolean prestamo(int nPrestados) {
		
		// boolean prestamoExitoso: indica si ha salido bien el prestamo
		boolean prestamoExitoso = false;
		
	}

}
