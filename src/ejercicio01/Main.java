package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// String titulo: titulo del libro
		String titulo = "";

		// String autor: autor del libro
		String autor = "";

		// int cantidad: cantidad a pedir prestado / devolver
		int cantidad = 0;

		// int respuesta: respuesta para las 3 opciones del usuario
		int respuesta = 0;

		// boolean correcto: booleana que comprueba si un entero es correcto o no
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario un titulo
		System.out.println("Inserta el titulo del libro");
		titulo = sc.nextLine();

		// Pide al usuario el autor
		System.out.println("Inserta el autor del libro");
		autor = sc.nextLine();

		// Enlaza la clase Libro mediante lib
		Libro lib = new Libro(titulo, autor, 10, 0);

		// Do While
		do {

			// Muestra el menu
			System.out.println("1. Prestamo");
			System.out.println("2. Devolucion");
			System.out.println("3. Mostrar informacion");
			System.out.println("4. Salir");

			// Pide al usuario la opcion
			do {
				try {
					respuesta = sc.nextInt();
					correcto = true;
				} catch (InputMismatchException e) {
					System.out.println("ERROR: respuesta invalida");
				} finally {
					sc.nextLine();
				} // Fin Try-Catch
			} while (!correcto);
			
			// Correcto volvera a ser false
			correcto = false;
			
			// Switch respuesta
			switch (respuesta) {
			
			// Case 1 y 2: Prestamo / Devolucion
			case 1, 2 -> {
				
				// Pide al usuario la cantidad
				System.out.println("Inserta la cantidad de libros a pedir prestado / devolver");
				do {
					try {
						cantidad = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					} // Fin Try-Catch
				} while (!correcto);
				
				if (respuesta == 1) {
					System.out.println(lib.prestamo(cantidad));
				} else {
					
				}
				
			}

			// Case 3: muestra informacion del libro
			case 3 -> {
				lib.mostrarInfo();
			}
			
			// Case 4: sal del programa
			case 4 -> {
				System.out.println("Saliendo del programa");
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			}

			} // Fin Switch

		} while (respuesta != 4); // Fin Do-While
		
		// Cierra el Scanner
		sc.close();

	}

}
