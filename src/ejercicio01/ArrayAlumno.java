package ejercicio01;

/**
 * Clase ArrayAlumno
 * 
 * @author Nestor Sanchez
 */
public class ArrayAlumno {

	/**
	 * String[] alumnos: array con los nombres de los alumnos
	 */
	public static Alumno[] alumnos = new Alumno[30];

	/**
	 * Funcion mostrarAlumnos: muestra los alumnos registrados
	 */
	public static void mostrarAlumnos() {
		for (Alumno alumn : alumnos) {
			if (alumn != null) {
				System.out.println(alumn);
			}
		}
	}

	/**
	 * Funcion insertarAlumno: inserta un alumno
	 */
	public static void insertarAlumno(String nombre, double notaMedia) {
		Alumno alumn = new Alumno(nombre, notaMedia);
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumn;
				break;
			}
		}
	}

	/**
	 * Funcion modificarNota: modifica la nota de un alumno
	 */
	public static void modificarNota(String nombre, double notaMedia) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre().equals(nombre)) {
				alumnos[i].setNotaMedia(notaMedia);
				break;
			}
		}
	}

	/**
	 * Funcion eliminarAlumno: elimina un alumno
	 */
	public static void eliminarAlumno(String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].equals(nombre)) {
				alumnos[i] = null;
				break;
			}
		}
	}

}
