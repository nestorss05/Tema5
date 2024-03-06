package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase MainCode
 * 
 * @author Nestor Sanchez
 */
public class MainCode {

	/**
	 * Clase Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// int opcion: opcion seleccionada por el usuario
		int opcion = 4;

		// String dni: dni del usuario
		String dni = "";

		// String nombre: nombre del usuario
		String nombre = "";

		// int saldo: saldo del usuario
		int saldo = 0;
		
		// int cantidad: cantidad de dinero a ingresar o sacar
		int cantidad = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el DNI
		System.out.println("Inserta el DNI");
		dni = sc.nextLine();

		// Pide al usuario tu nombre
		System.out.println("Inserta tu nombre");
		nombre = sc.nextLine();

		// Haz referencia a CuentaCorriente
		CuentaCorriente cc = new CuentaCorriente(dni, nombre, saldo);

		// Do-While: pide al usuario una opcion a elegir
		do {
			// Try-catch: si la opcion no es un numero, el programa te mostrara que la
			// respuesta es invalida
			try {
				System.out.println(
						"BANCO CENTRAL DE LA REPUBLICA NESTORIANA \n 1. Sacar dinero \n 2. Ingresar dinero \n 3. Mostrar informacion \n 0. Salir");
				opcion = sc.nextInt();

				// Switch: lo que el programa procedera a hacer segun la opcion seleccionada
				switch (opcion) {

				// Case 0: se saldra del programa
				case 0 -> {
					System.out.println("Sesion cerrada con exito");
				}

				// Case 1: se sacara dinero de la cuenta
				case 1 -> {
					try {
						System.out.println("Inserta la cantidad de dinero a retirar");
						cantidad = sc.nextInt();
						System.out.println(cc.sacarDinero(cantidad));
					} catch (InputMismatchException e) {
						System.out.println("ERROR: Cantidad introducida invalida. La operacion ha sido anulada.");
						cantidad = 0;
					} finally {
						System.out.println("Presione una tecla para continuar");
						sc.nextLine();
					}
				}

				// Case 2: se ingresara dinero a la cuenta
				case 2 -> {
					try {
						System.out.println("Inserta la cantidad de dinero a ingresar");
						cantidad = sc.nextInt();
						System.out.println(cc.ingresarDinero(cantidad));
					} catch (InputMismatchException e) {
						System.out.println("ERROR: Cantidad introducida invalida. La operacion ha sido anulada.");
						cantidad = 0;
					} finally {
						System.out.println("Presione una tecla para continuar");
						sc.nextLine();
					}
				}

				// Case 3: se mostrara informacion de la cuenta
				case 3 -> {
					cc.mostrarInformacion();
				}

				// Default: opcion invalida
				default -> {
					System.out.println("ERROR: Opcion invalida");
				}

				} // Fin Switch
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			} // Fin Try--Catch

		} while (opcion != 0);

		// Cierra el Scanner
		sc.close();

	}

}
