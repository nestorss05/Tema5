package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// int opcion: opcion seleccionada por el usuario
		int opcion = 0;

		// String dni: dni del usuario
		String dni = "";

		// String nombre: nombre del usuario
		String nombre = "";

		// int cantidad: cantidad de dinero a ingresar o sacar
		int cantidad = 0;
		
		// CuentaCorriente cc: objeto de la clase CuentaCorriente
		CuentaCorriente cc = null;

		// boolean esExitoso: booleana que comprueba si ha salido bien una operacion o
		// no
		boolean esExitoso = false;
		
		// int dniEncontrado: entero que muestra la localizacion del DNI
		int dniEncontrado;

		// boolean numeroValido: booleana que valida un numero
		boolean numeroValido = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do-While: la aplicacion se ejecutara mientras la opcion no sea 8
		do {

			// Muestra el menu
			mostrarMenu();

			// Try-catch: pide al usuario la opcio
			try {
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try-catch

			// Switch: lo que el programa procedera a hacer segun la opcion seleccionada
			switch (opcion) {

			// Case 1: se sacara dinero de la cuenta
			case 1 -> {
				
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni);
				
				// Muestra el usuario en cuestion (o no)
				dniEncontrado = ArrayCC.buscaPosicion(cc);
				
				// If-Else: si se encuentra el DNI, el programa continuara.
				if (dniEncontrado != -1) {
					System.out.println("Inserta la cantidad de dinero a retirar");
					
					// Do-While: pide al usuario un numero
					do {
						
						// Try Catch
						try {
							numeroValido = false;
							cantidad = sc.nextInt();
							if (cantidad < 0) {
								System.out.println("ERROR: cantidad invalida");
							} else {
								numeroValido = true;
							}
						} catch (InputMismatchException e) {
							System.out.println("ERROR: Cantidad introducida invalida");
						} finally {
							sc.nextLine();
						} // Fin Try Catch
						
					} while (!numeroValido); // Fin Do-While
					
					// Saca la cantidad de dinero
					esExitoso = ArrayCC.sacarDinero(cc, cantidad);
					
					// If-Else: muestra si ha salido bien la operacion o no
					if (esExitoso) {
						System.out.println("La operacion se ha realizado satisfactoriamente");
					} else {
						System.out.println("ERROR: operacion fallida");
					} // Fin If-Else
					
				} else {
					System.out.println("ERROR: usuario no encontrado");
				} // Fin If-Else
				
			}

			// Case 2: se ingresara dinero a la cuenta
			case 2 -> {
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni);
				
				// Muestra el usuario en cuestion (o no)
				dniEncontrado = ArrayCC.buscaPosicion(cc);
				
				// If-Else: si se encuentra el DNI, el programa continuara.
				if (dniEncontrado != -1) {
					System.out.println("Inserta la cantidad de dinero a ingresar");
					
					// Do-While: pide al usuario un numero
					do {
						
						// Try Catch
						try {
							numeroValido = false;
							cantidad = sc.nextInt();
							if (cantidad < 0) {
								System.out.println("ERROR: cantidad invalida");
							} else {
								numeroValido = true;
							}
						} catch (InputMismatchException e) {
							System.out.println("ERROR: Cantidad introducida invalida");
						} finally {
							sc.nextLine();
						} // Fin Try Catch
						
					} while (!numeroValido); // Fin Do-While
					
					// Ingresa la cantidad de dinero
					esExitoso = ArrayCC.ingresarDinero(cc, cantidad);
					
					// If-Else: muestra si ha salido bien la operacion o no
					if (esExitoso) {
						System.out.println("La operacion se ha realizado satisfactoriamente");
					} else {
						System.out.println("ERROR: operacion fallida");
					} // Fin If-Else
					
				} else {
					System.out.println("ERROR: usuario no encontrado");
				} // Fin If-Else
			}

			// Case 3: se mostrara informacion de una cuenta
			case 3 -> {
				
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni);
				
				// Muestra el usuario en cuestion (o no)
				ArrayCC.mostrarInformacion(cc);
				
			}

			// Case 4: se mostrara informacion de todas las cuentas
			case 4 -> {
				ArrayCC.mostrarInformacionTotal(cc);
			}

			// Case 5: se creara un usuario
			case 5 -> {
				
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Inserta el nombre
				System.out.println("Inserta el nombre");
				nombre = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni, nombre, 0);
				
				// Añade al usuario y guarda el resultado en esExitoso
				esExitoso = ArrayCC.añadirUsuario(cc);
				
				// If-Else: muestra si ha salido bien la operacion o no
				if (esExitoso) {
					System.out.println("Usuario creado satisfactoriamente");
				} else {
					System.out.println("ERROR: el usuario no se ha podido crear");
				} // Fin If-Else
				
			}

			// Case 6: se modificara ciertos parametros de un usuario
			case 6 -> {
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni);
				
				// Muestra el usuario en cuestion (o no)
				dniEncontrado = ArrayCC.buscaPosicion(cc);
				
				// If-Else: si se encuentra el DNI, el programa continuara.
				if (dniEncontrado != -1) {
					
					// Pide al usuario el nombre a modificar
					System.out.println("Inserta el nombre");
					nombre = sc.nextLine();
					
					// Modifica el nombre
					esExitoso = ArrayCC.modificarUsuario(cc, nombre);
					
					// If-Else: muestra si ha salido bien la operacion o no
					if (esExitoso) {
						System.out.println("La operacion se ha realizado satisfactoriamente");
					} else {
						System.out.println("ERROR: operacion fallida");
					} // Fin If-Else
					
				} else {
					System.out.println("ERROR: usuario no encontrado");
				} // Fin If-Else
			}

			// Case 7: se borrara un usuario
			case 7 -> {
				
				// Inserta el dni
				System.out.println("Inserta el dni");
				dni = sc.next();
				
				// Guarda el objeto nuevo en cc
				cc = new CuentaCorriente(dni);
				
				// Elimina al usuario y guarda el resultado en esExitoso
				esExitoso = ArrayCC.borrarUsuario(cc);
				
				// If-Else: muestra si ha salido bien la operacion o no
				if (esExitoso) {
					System.out.println("Usuario borrado satisfactoriamente");
				} else {
					System.out.println("ERROR: el usuario no se ha podido borrar");
				} // Fin If-Else
				
			}

			// Case 8: se saldra del programa
			case 8 -> {
				System.out.println("Saliendo del programa...");
			}

			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: Opcion invalida");
			}

			} // Fin Switch

		} while (opcion != 8);

		// Cierra el Scanner
		sc.close();

	}

	/**
	 * Funcion mostrarMenu: muestra el menu
	 */
	private static void mostrarMenu() {
		System.out.println("BANCO CENTRAL DE LA REPUBLICA NESTORIANA");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Mostrar informacion de un usuario");
		System.out.println("4. Mostrar informacion de todos los usuarios");
		System.out.println("5. Crear usuario");
		System.out.println("6. Modificar usuario");
		System.out.println("7. Borrar usuario");
		System.out.println("8. Salir");
	}

}
