package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// int opcion: opcion elegida por el usuario
		int opcion = 0;

		// int codigo: codigo de la pizza
		int codigo = -1;

		// String tamaño: tamaño de la pizza
		String tamaño;

		// String tipo: tipo de la pizza
		String tipo;

		// Pizza pedido: pedido de la pizza
		Pizza pedido = null;

		// boolean accionExitosa: muestra si una accion salio bien o no
		boolean accionExitosa = false;

		// boolean numValido: comprueba si un numero es valido o no
		boolean numValido = false;

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

				// Muestra las pizzas por pantalla
				ArrayPizzas.mostrarPizzas(pedido);

			} // Fin Case 1

			// Case 2: nuevo pedido
			case 2 -> {

				// Do-While: Pide al usuario el codigo
				System.out.println("Inserta el codigo");
				do {
					try {
						numValido = false;
						codigo = sc.nextInt();
						if (codigo < 0) {
							System.out.println("ERROR: el codigo no puede ser negativo");
						} else {
							numValido = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalido");
					} finally {
						sc.nextLine();
					}
				} while (!numValido); // Fin Do-While

				// Pide al usuario el tamaño de la pizza
				System.out.println("¿De que tamaño quieres que sea la pizza? ¿Mediana o Familiar?");
				tamaño = sc.next();
				sc.nextLine();

				// Pide al usuario el tipo de la pizza
				System.out.println("¿De que quieres la pizza? ¿Margarita, CuatroQuesos, o Funghi?");
				tipo = sc.next();
				sc.nextLine();

				// Añade el pedido
				pedido = new Pizza(codigo, tamaño, tipo);

				// Añade la pizza al array
				accionExitosa = ArrayPizzas.nuevoPedido(pedido);

				// If-Else: Si se ha podido añadir la pizza o no, se le mostrara por pantalla el
				// resultado de la opperacion
				if (accionExitosa) {
					System.out.println("Se ha añadido la pizza correctamente");
				} else {
					System.out.println("ERROR: no se ha podido añadir la pizza");
				} // Fin If-Else

			} // Fin Case 2

			// Case 3: pizza servida
			case 3 -> {
				// Do-While: Pide al usuario el codigo
				System.out.println("Inserta el codigo");
				do {
					try {
						numValido = false;
						codigo = sc.nextInt();
						if (codigo < 0) {
							System.out.println("ERROR: el codigo no puede ser negativo");
						} else {
							numValido = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalido");
					} finally {
						sc.nextLine();
					}
				} while (!numValido); // Fin Do-While

				// Añade el pedido modificado
				pedido = new Pizza(codigo);

				// Modifica la pizza para que este servida
				accionExitosa = ArrayPizzas.pizzaServida(pedido);

				// If-Else: Si se ha podido servir la pizza o no, se le informara del estado de
				// la accion
				if (accionExitosa) {
					System.out.println("La pizza se ha servido");
				} else {
					System.out.println("ERROR: no se ha podido servir la pizza");
				} // Fin If-Else

			} // Fin Case 3

			// Case 4: sal del programa
			case 4 -> {
				System.out.println("Saliendo del programa...");
			} // Fin Case 4

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			} // Fin Default

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