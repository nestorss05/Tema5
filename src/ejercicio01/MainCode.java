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

		// String saldo: saldo del usuario
		int saldo = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Haz referencia a CuentaCorriente
		CuentaCorriente cc = new CuentaCorriente(dni, saldo);

		// Haz referencia a CuentaCorriente pero con nombre incluido
		CuentaCorriente ccFull = new CuentaCorriente(dni, nombre, saldo);

		// Do-While: pide al usuario una opcion a elegir
		do {
			try {
				System.out.println(
						"BANCO CENTRAL DE LA REPUBLICA NESTORIANA \n 1. Sacar dinero \n 2. Ingresar dinero \n 3. Mostrar informacion \n 0. Salir");
				opcion = sc.nextInt();
				switch (opcion) {

				case 0 -> {
					System.out.println("Saliendo del programa...");
				}
				case 1 -> {
					System.out.println("Inserta el DNI");
					dni = sc.nextLine();
					System.out.println(cc.sacarDinero(dni, saldo));
				}
				case 2 -> {
					System.out.println("");
				}
				case 3 -> {
					System.out.println("");
				}
				default -> {
					System.out.println("ERROR: Opcion invalida");
				}

				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}

		} while (opcion != 0);

		// Cierra el Scanner
		sc.close();

	}

}
