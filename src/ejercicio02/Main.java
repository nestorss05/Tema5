package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// int opcion: opcion elegida por el usuario
		int opcion = 0;
		
		// int codigo: codigo del producto
		int codigo;
		
		// String descripcion: descripcion del producto
		String descripcion;
		
		// String precioCompra: precio de compra del producto
		double precioCompra;
		
		// String precioVenta: precio de venta del producto
		double precioVenta;
		
		// int stock: stock que tiene un producto
		int stock;
		
		// Gestisimal articulo: enlazador a la clase Gestisimal
		Gestisimal articulo = null;
		
		// boolean accionExitosa: comprueba si se hizo correctamente una operacion
		boolean accionExitosa;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Muestra al usuario un texto de bienvenida
		System.out.println("Bienvenido a GESTISIMAL");

		// Do-While: mantener el programa activo mientras que la opcion no sea 7
		do {

			// Muestra el menu
			Main.menu();

			// Pide al usuario la opcion
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: respuesta invalida");
			} finally {
				sc.nextLine();
			}

			// Switch: por cada opcion se ejecutara cierta accion
			switch (opcion) {

			// Case 1: haz un listado de los productos
			case 1 -> {
				ArrayArticulos.mostrarProductos(articulo);
			}

			// Case 2: da de alta un producto
			case 2 -> {
				
				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();
				
				// Pide al usuario la descripcion
				System.out.println("Introduzca la descripción");
				descripcion = sc.nextLine();
				
				// Pide al usuario el precio de compra
				System.out.println("Introduzca el precio compra");
				precioCompra = sc.nextDouble();
				sc.nextLine();
				
				// Pide al usuario el precio de venta
				System.out.println("Introduzca el precio venta");
				precioVenta = sc.nextDouble();
				sc.nextLine();
				
				// Pide al usuario el stock
				System.out.println("Introduzca el stock");
				stock = sc.nextInt();
				sc.nextLine();
				
				articulo = new Gestisimal(codigo, descripcion, precioCompra, precioVenta, stock);
				accionExitosa = ArrayArticulos.alta(articulo);
				if(accionExitosa) {
					System.out.println("Artículo añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir el artículo");
				}
				break;
				
			}

			// Case 3: da de baja un producto
			case 3 -> {
				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				codigo = sc.nextInt();
				sc.nextLine();
				
				// Pide al usuario la descripcion
				System.out.println("Introduzca la descripción");
				descripcion = sc.nextLine();
				
				// Pide al usuario el precio de compra
				System.out.println("Introduzca el precio compra");
				precioCompra = sc.nextDouble();
				sc.nextLine();
				
				// Pide al usuario el precio de venta
				System.out.println("Introduzca el precio venta");
				precioVenta = sc.nextDouble();
				sc.nextLine();
				
				// Pide al usuario el stock
				System.out.println("Introduzca el stock");
				stock = sc.nextInt();
				sc.nextLine();
				
				articulo = new Gestisimal(codigo, descripcion, precioCompra, precioVenta, stock);
				accionExitosa = ArrayArticulos.baja(articulo);
				if(accionExitosa) {
					System.out.println("Artículo eliminado correctamente");
				} else {
					System.out.println("No se ha podido eliminar el artículo");
				}
				break;
			}

			// Case 4: modifica un producto
			case 4 -> {
				
			}

			// Case 5: haz una entrada de mercancia
			case 5 -> {
				
			}

			// Case 6: haz una salida de mercancia
			case 6 -> {
				
			}

			// Case 7: sal del programa
			case 7 -> {
				System.out.println("Saliendo del programa...");
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			}

			} // Fin Switch

		} while (opcion != 7); // Fin Do-While
		
		// Cierra el Scanner
		sc.close();

	}

	/**
	 * Funcion menu: muestra el menu
	 */
	public static void menu() {

		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
		System.out.println("Elige una opcion");

	}

}
