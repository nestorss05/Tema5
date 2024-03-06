package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// boolean ejecucion: booleana que indica si el programa esta en ejecucion o no
		boolean ejecucion = true;

		// boolean correcto: booleana que indica si el precio es correcto o no
		boolean correcto = false;

		// int opcion: opcion a elegir
		int opcion = 0;

		// int cantidad: cantidad de un producto
		int cantidad = 0;

		// int descuento: dinero a descontar
		double descuento = 0;

		// String nombre: nombre del articulo
		String nombre = "";

		// int precio: precio inicial del articulo
		double precio = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el nombre del producto
		System.out.println("Inserta un nombre para el producto");
		nombre = sc.nextLine();

		// Pide al usuario el precio del producto
		System.out.println("Inserta un precio para el producto");
		do {

			try {
				precio = sc.nextDouble();
				if (precio <= 0) {
					System.out.println("ERROR: precio invalido");
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			}

		} while (!correcto);

		// Enlaza articulo mediante una clase (el stock inicial sera 5)
		Articulo art = new Articulo(nombre, precio, 5);

		do {

			// Muestra las opciones por pantalla
			System.out.println("1. Mostrar informacion");
			System.out.println("2. Obtener precio");
			System.out.println("3. Comprar objeto");
			System.out.println("4. Almacenar objeto");
			System.out.println("5. Salir");

			// Pide al usuario la opcion
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try Catch

			// Switch
			switch (opcion) {

			// Case 1: muestra informacion
			case 1 -> {
				// Muestra la informacion por pantalla
				art.imprimirInformacion();
			}
			
			// Case 2: obten el precio
			case 2 -> {

				System.out.println("Inserta un descuento (si es que hay)");
				try {
					descuento = sc.nextDouble();
					if (descuento < 0) {
						System.out.println("ERROR: descuento invalido");
						descuento = 0;
					}
				} catch (InputMismatchException e) {
					System.out.println("ERROR: opcion invalida");
					descuento = 0;
				} finally {
					sc.nextLine();
				}
				
				// Dependiendo de si hay descuento o no, se aplicara o no
				if (descuento > 0) {
					System.out.println(art.getPVPDescuento(descuento));
				} else {
					System.out.println(art.getPVP());
				}
				
			}

			// Case 3  y 4: compra el objeto / almacena objetos
			case 3, 4 -> {

				// correcto pasara a ser false
				correcto = false;
				
				// Pide al usuario cuantos productos quiere comprar
				System.out.println("¿Cuantos productos quieres comprar / almacenar?");
				do {

					try {
						cantidad = sc.nextInt();
						if (cantidad <= 0) {
							System.out.println("ERROR: cantidad invalida");
						} else {
							correcto = true;
						}
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}

				} while (!correcto); // Fin do while
				
				// Haz las respectivas acciones dependiendo de si la opcion es 2 o 3
				if (opcion == 3) {
					// Muestra por pantalla si se ha podido vender o no
					System.out.println(art.vender(cantidad));
				} else {
					// Almacena la cantidad de objetos
					art.almacenar(cantidad);
				}

			}

			// Case 5: sal del programa
			case 5 -> {
				ejecucion = false;
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			}

			} // Fin Switch

		} while (ejecucion); // Fin Do While
		
		// Cierra el Scanner
		sc.close();

	}

}
