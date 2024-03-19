package ejercicio01;

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
	 * Genero nGenero: nombre del genero del libro introducido
	 */
	private Genero nGenero;

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
	 * @param nGenero     nombre del genero del libro introducido
	 */
	public Libro(String titulo, String autor, int nEjemplares, int nPrestados, String nGenero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
		this.nGenero = Genero.valueOf(nGenero);
	}

	/**
	 * enum Genero: genero de un libro
	 */
	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}
	
	/**
	 * Getter getnGenero
	 * @return nombre de genero
	 */
	public Genero getnGenero() {
		return nGenero;
	}

	/**
	 * Setter setnGenero
	 * @param nGenero nombre de genero
	 */
	public void setnGenero(Genero nGenero) {
		this.nGenero = nGenero;
	}

	/**
	 * Funcion prestamo: hace un prestamo a un usuario
	 * 
	 * @param cantidad cantidad de ejemplares a prestar
	 * @return si el prestamo ha sido exitoso o no
	 */
	public boolean prestamo(int cantidad) {

		// boolean exitoso: indica si ha salido bien el prestamo
		boolean exitoso = false;

		// If: si nEjemplares no acaba en negativo, se hara la operacion y el prestamo
		// sera exitoso
		if (nEjemplares - cantidad >= 0) {
			nEjemplares = nEjemplares - cantidad;
			nPrestados = nPrestados + cantidad;
			exitoso = true;
		}

		// Devuelve exitoso al Main
		return exitoso;

	}

	/**
	 * Funcion devolucion: devuelve libros
	 * 
	 * @param cantidad cantidad de ejemplares a devolver
	 * @return si la devolucion ha sido exitosa o no
	 */
	public boolean devolucion(int cantidad) {

		// boolean exitoso: indica si ha salido bien la devolucion
		boolean exitoso = false;

		// If: si nPrestados no acaba en negativo, se hara la operacion y la devolucion
		// sera exitoso
		if (nPrestados - cantidad >= 0) {
			nPrestados = nPrestados - cantidad;
			nEjemplares = nEjemplares + cantidad;
			exitoso = true;
		}

		// Devuelve exitoso al Main
		return exitoso;

	}

	/**
	 * Funcion mostrarInfo: muestra informacion del libro
	 */
	public void mostrarInfo() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Genero: " + nGenero);
		System.out.println("Nº de ejemplares disponibles: " + nEjemplares);
	}

}
