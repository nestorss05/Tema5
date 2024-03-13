package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// int opcion: opcion elegida por el usuario
		int opcion = 0;

		// int opcion2: opcion2 elegida por el usuario
		int opcion2 = 0;

		// int codigo: codigo del producto
		int codigo = 0;

		// String descripcion: descripcion del producto
		String descripcion = "";

		// String precioCompra: precio de compra del producto
		double precioCompra = 0;

		// String precioVenta: precio de venta del producto
		double precioVenta = 0;

		// int stock: stock que tiene un producto
		int stock = 0;

		// int pos: posicion del articulo en el array
		int pos = 0;

		// Gestisimal articulo: enlazador a la clase Gestisimal
		Gestisimal articulo = null;

		// boolean accionExitosa: comprueba si se hizo correctamente una operacion
		boolean accionExitosa = false;

		// boolean respuestaValida: booleana que valida una respuesta para que Java no
		// de error
		boolean respuestaValida = false;

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
				do {
					try {
						respuestaValida = false;
						codigo = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Pide al usuario la descripcion
				System.out.println("Introduzca la descripción");
				descripcion = sc.nextLine();

				// Pide al usuario el precio de compra
				System.out.println("Introduzca el precio compra");
				do {
					try {
						respuestaValida = false;
						precioCompra = sc.nextDouble();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Pide al usuario el precio de venta
				System.out.println("Introduzca el precio venta");
				do {
					try {
						respuestaValida = false;
						precioVenta = sc.nextDouble();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Pide al usuario el stock
				System.out.println("Introduzca el stock");
				do {
					try {
						respuestaValida = false;
						stock = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Añade el producto a articulo
				articulo = new Gestisimal(codigo, descripcion, precioCompra, precioVenta, stock);

				// Da de alta al usuario
				accionExitosa = ArrayArticulos.alta(articulo);

				// If-Else: si se ha podido dar de alta al articulo, se le informara de eso. De
				// lo contrario, se le informara de que no se le pudo dar de alta
				if (accionExitosa) {
					System.out.println("Artículo añadido correctamente");
				} else {
					System.out.println("No se ha podido añadir el artículo");
				} // Fin If-Else

			}

			// Case 3: da de baja un producto
			case 3 -> {
				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				do {
					try {
						respuestaValida = false;
						codigo = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Recoge el codigo de articulo
				articulo = new Gestisimal(codigo);

				// Elimina el articulo
				accionExitosa = ArrayArticulos.baja(articulo);

				// If-Else: si se ha podido dar de baja al articulo, se le informara de eso. De
				// lo contrario, se le informara de que no se le pudo dar de baja
				if (accionExitosa) {
					System.out.println("Artículo eliminado correctamente");
				} else {
					System.out.println("No se ha podido eliminado el artículo");
				} // Fin If-Else

			}

			// Case 4: modifica un producto
			case 4 -> {
				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				do {
					try {
						respuestaValida = false;
						codigo = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Recoge el codigo de articulo
				articulo = new Gestisimal(codigo);

				// Busca el articulo
				pos = ArrayArticulos.buscaArticulo(articulo);

				// Si se ha encontrado el articulo, pidele al usuario que dato modificar y
				// modificalo

				if (pos >= 0) {

					// Pide al usuario que modificar
					System.out.println("¿Que dato quieres modificar?");
					System.out.println("1. Descripcion");
					System.out.println("2. Precio de compra");
					System.out.println("3. Precio de venta");
					try {
						respuestaValida = false;
						opcion2 = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida. La opcion se establecera a 0");
						opcion = 0;
					} finally {
						sc.nextLine();
					}

					// Switch: segun la opcion elegida, se te pedira cierto dato o no
					switch (opcion2) {

					// Case 1: Pide al usuario la descripcion
					case 1 -> {
						System.out.println("Introduzca la descripción");
						descripcion = sc.nextLine();
					}

					// Case 2: Pide al usuario el precio de compra
					case 2 -> {
						System.out.println("Introduzca el precio compra");
						precioCompra = sc.nextDouble();
						sc.nextLine();
					}

					// Case 3: Pide al usuario el precio de venta
					case 3 -> {
						System.out.println("Introduzca el precio venta");
						precioVenta = sc.nextDouble();
						sc.nextLine();
					}

					// Default: valor invalido
					default -> {
						System.out.println("ERROR: valor invalido");
						continue;
					}

					} // Fin Switch

					// Modifica el articulo
					accionExitosa = ArrayArticulos.modificar(articulo, pos, descripcion, precioCompra, precioVenta,
							opcion2);

					// If-Else: muestra por pantalla si el articulo se pudo modificar correctamente
					if (accionExitosa) {
						System.out.println("Artículo modificado correctamente");
					} else {
						System.out.println("No se ha podido modificar el artículo");
					} // Fin If-Else

				} else {
					System.out.println("No se ha podido modificar el artículo");
				} // Fin If-Else
			}

			// Case 5: haz una entrada de mercancia
			case 5 -> {

				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				do {
					try {
						respuestaValida = false;
						codigo = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Recoge el codigo de articulo
				articulo = new Gestisimal(codigo);

				// Busca el articulo
				pos = ArrayArticulos.buscaArticulo(articulo);

				// If-Else: Si se ha encontrado el articulo, pidele al usuario cuanto stock se
				// añadira
				if (pos >= 0) {

					// Pide al usuario el stock a añadir
					System.out.println("Inserta el stock a añadir");
					do {
						try {
							respuestaValida = false;
							stock = sc.nextInt();
							respuestaValida = true;
						} catch (InputMismatchException e) {
							System.out.println("ERROR: respuesta invalida");
						} finally {
							sc.nextLine();
						}
					} while (!respuestaValida);

					// Realiza la entrada de mercancia
					accionExitosa = ArrayArticulos.entradaMercancia(articulo, pos, stock);

					// If-Else: muestra por pantalla si la entrada de mercancia fue exitosa
					if (accionExitosa) {
						System.out.println("La entrada de mercancia fue exitosa");
					} else {
						System.out.println("La entrada de mercancia no fue exitosa");
					} // Fin If-Else

				} else {
					System.out.println("No se ha podido modificar el artículo");
				} // Fin If-Else

			}

			// Case 6: haz una salida de mercancia
			case 6 -> {

				// Pide al usuario el codigo
				System.out.println("Introduzca el código");
				do {
					try {
						respuestaValida = false;
						codigo = sc.nextInt();
						respuestaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("ERROR: respuesta invalida");
					} finally {
						sc.nextLine();
					}
				} while (!respuestaValida);

				// Recoge el codigo de articulo
				articulo = new Gestisimal(codigo);

				// Busca el articulo
				pos = ArrayArticulos.buscaArticulo(articulo);

				// If-Else: Si se ha encontrado el articulo, pidele al usuario cuanto stock se
				// añadira
				if (pos >= 0) {

					// Pide al usuario el stock a restar
					System.out.println("Inserta el stock a restar");
					do {
						try {
							respuestaValida = false;
							stock = sc.nextInt();
							respuestaValida = true;
						} catch (InputMismatchException e) {
							System.out.println("ERROR: respuesta invalida");
						} finally {
							sc.nextLine();
						}
					} while (!respuestaValida);

					// Realiza la entrada de mercancia
					accionExitosa = ArrayArticulos.salidaMercancia(articulo, pos, stock);

					// If-Else: muestra por pantalla si la entrada de mercancia fue exitosa
					if (accionExitosa) {
						System.out.println("La entrada de mercancia fue exitosa");
					} else {
						System.out.println("La entrada de mercancia no fue exitosa");
					} // Fin If-Else

				} else {
					System.out.println("No se ha podido modificar el artículo");
				} // Fin If-Else

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