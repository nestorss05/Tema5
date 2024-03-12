package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// nombre: nombre del alumno
		String nombre = "";

		// double notaMedia: nota media del alumno
		double notaMedia = 0;

		// int opcion: opcion elegida por el usuario
		int opcion = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do-While: el programa se ejecutara mientras que la opcion no sea 5
		do {

			// Muestra el menu
			Main.mostrarMenu();

			// Pide al usuario una opcion
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try-Catch

			// Por cada opcion, haz cierta accion
			switch (opcion) {

			// Case 1: imprime a todos los alumnos registrados
			case 1 -> {
				ArrayAlumno.mostrarAlumnos();
			}
			
			// Case 2: añade un nuevo alumno
			case 2 -> {
				
				// Pide al usuario el nombre
				System.out.println("Inserta el nombre del alumno a añadir");
				nombre = sc.nextLine();
				
				// Pide al usuario la nota
				System.out.println("Inserta la nota nueva");
				do {
					try {
						notaMedia = sc.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (notaMedia < 0 || notaMedia > 10);
				
				// Inserta el alumno
				ArrayAlumno.insertarAlumno(nombre, notaMedia);
				
			}
			
			// Case 3: modifica la nota
			case 3 -> {
				
				// Pide al usuario el nombre
				System.out.println("Inserta el nombre del alumno a eliminar");
				nombre = sc.nextLine();
				
				// Pide al usuario la nota
				System.out.println("Inserta la nota nueva");
				do {
					try {
						notaMedia = sc.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (notaMedia < 0 || notaMedia > 10);
				
				// Modifica la nota
				ArrayAlumno.modificarNota(nombre, notaMedia);
				
			}
			
			// Case 4: elimina a un alumno
			case 4 -> {
				
				// Pide al usuario el nombre
				System.out.println("Inserta el nombre del alumno a eliminar");
				nombre = sc.nextLine();
				
				// Elimina el alumno
				ArrayAlumno.eliminarAlumno(nombre);
				
			}

			// Case 5: sal del programa
			case 5 -> {
				System.out.println("Saliendo del programa...");
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			}

			}
		} while (opcion != 5);
		
		// Cierra el Scanner
		sc.close();

	}
	
	/**
	 * Funcion mostrarMenu: muestra el menu
	 */
	public static void mostrarMenu() {
		
		System.out.println("ALUMNOS/AS");
		System.out.println("==========");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.println("¿Qué opción quiere ejecutar?");
		
	}

}
