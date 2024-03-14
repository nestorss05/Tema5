package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// int opcion: opcion elegida por el usuario
		int opcion = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do-While: mientras que la opcion no sea 4, ejecuta el programa
		do {
			// Muestra el menu
			mostrarMenu();

			// Try-catch: pide al usuario la opcion
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try-Catch

			// Switch: segun la opcion elegida, se ejecutara cierta accion o no
			switch (opcion) {

			// Case 1: listado de pizzas
			case 1 -> {
				
			}

			// Case 2: nuevo pedido
			case 2 -> {
				
			}

			// Case 3: pizza servida
			case 3 -> {
				
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

		} while (opcion != 4); // Fin Do-While

		// Cierra el Scanner
		sc.close();

	}

	/**
	 * Funcion mostrarMenu: muestra el menu
	 */
	private static void mostrarMenu() {
		System.out.println("PIZZERIA DEL SEKITO");
		System.out.println("1. Listado de pizzas");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
		System.out.println("Elige la opcion");
	}

}