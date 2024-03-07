package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// int x: posicion x de una coordenada
		int x = 0;

		// int y: posicion y de una coordenada
		int y = 0;

		// int dx: posiciones x que se desplazara una coordenada
		int dx = 0;

		// int dy: posiciones y que se desplazara una coordenada
		int dy = 0;

		// int opcion: opcion elegida por el usuario
		int opcion = 0;

		// boolean correcto: comprueba si un entero es correcto o no
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pidele al usuario las coordenadas x e y
		System.out.println("Inserta las coordenadas x e y");

		// Do While: coordenada X
		do {
			try {
				System.out.println("Coordenada X");
				x = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta incorrecta");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Correcto volvera a ser false
		correcto = false;

		// Do While: coordenada Y
		do {
			try {
				System.out.println("Coordenada Y");
				y = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta incorrecta");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Establece correcto a negativo de nuevo
		correcto = false;

		// Inicializa Punto en pt con las variables x e y
		Punto pt = new Punto(x, y);

		// Do While: manten el programa ejecutado mientras que la opcion no sea 5
		do {
			// Muestra el menu
			System.out.println("1. Imprimir coordenadas");
			System.out.println("2. Modificar coordenadas");
			System.out.println("3. Desplazar coordenada");
			System.out.println("4. Calcular distancia");
			System.out.println("5. Salir");

			// Inserta la opcion
			opcion = sc.nextInt();

			// Switch: segun la opcion, se ejecutara cierta accion u otra
			switch (opcion) {

			// Case 1: imprime las coordenadas por pantalla
			case 1 -> {
				pt.imprime();
			}

			// Case 2: modifica las coordenadas
			case 2 -> {

				// Pidele al usuario las coordenadas x e y
				System.out.println("Inserta las coordenadas x e y");

				// Do While: coordenada X
				do {
					try {
						System.out.println("Coordenada X");
						x = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Correcto volvera a ser false
				correcto = false;

				// Do While: coordenada Y
				do {
					try {
						System.out.println("Coordenada Y");
						y = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Establece correcto a negativo de nuevo
				correcto = false;

				// Cambia la coordenada
				pt.setXY(x, y);

			}

			// Case 3: desplaza una coordenada
			case 3 -> {

				// Pidele al usuario las coordenadas dx e dy
				System.out.println("Inserta las coordenadas x e y que quieras desplazar");

				// Do While: coordenada DX
				do {
					try {
						System.out.println("Coordenada X");
						dx = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Correcto volvera a ser false
				correcto = false;

				// Do While: coordenada DY
				do {
					try {
						System.out.println("Coordenada Y");
						dy = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Establece correcto a negativo de nuevo
				correcto = false;

				// Desplaza la coordenada
				pt.desplaza(dx, dy);

			}

			// Case 4: calcula y devuelve la distancia entre un objeto y otro
			case 4 -> {

				// Pidele al usuario las coordenadas x e y que quiera comprarar
				System.out.println("Inserta las coordenadas x e y de la otra coordenada a comparar");

				// Do While: coordenada X
				do {
					try {
						System.out.println("Coordenada X");
						x = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Correcto volvera a ser false
				correcto = false;

				// Do While: coordenada Y
				do {
					try {
						System.out.println("Coordenada Y");
						y = sc.nextInt();
						correcto = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta incorrecta");
					} finally {
						sc.nextLine();
					}
				} while (!correcto); // Fin Do While

				// Establece correcto a negativo de nuevo
				correcto = false;
				
				// Muestra por pantalla la distancia entre las dos coordenadas
				System.out.println(pt.distancia(x, y));

			}

			// Case 5: sal del programa
			case 5 -> {
				System.out.println("Saliendo del programa...");
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			}

			} // Fin Switch

		} while (opcion != 5); // Fin Do-While

		// Cierra el Scanner
		sc.close();
		
	}

}
