package ejercicio04;

/**
 * Clase ArrayCC
 * 
 * @author Nestor Sanchez
 */
public class ArrayCC {

	/**
	 * CuentaCorriente[] usuarios: usuarios donde se guardara el array
	 */
	public static CuentaCorriente[] usuarios = new CuentaCorriente[33];

	/**
	 * Funcion sacarDinero: saca dinero de la cuenta
	 * 
	 * @param cantidad de dinero a retirar
	 * @return: si se ha podido hacer la operacion o no
	 */
	public static boolean sacarDinero(CuentaCorriente usuario, int cantidad) {

		// boolean esExitoso: booleana que indica si la funcion ha salido bien o no (por
		// defecto, es falso)
		boolean esExitoso = false;

		// If: si la cantidad es menor que el saldo, se le restara al saldo la cantidad,
		// y esExitoso sera true
		if (cantidad < usuario.getSaldo()) {
			usuario.setSaldo(usuario.getSaldo() - cantidad);;
			esExitoso = true;
		} // Fin If

		// Devuelve esExitoso al main
		return esExitoso;

	}

	/**
	 * Funcion ingresarDinero: ingresa dinero a la cuenta
	 * 
	 * @param cantidad de dinero a ingresar
	 * @return: si se ha podido hacer la operacion o no
	 */
	public static boolean ingresarDinero(CuentaCorriente usuario, int cantidad) {

		// boolean esExitoso: booleana que indica si la funcion ha salido bien o no (por
		// defecto, es falso)
		boolean esExitoso = false;

		// If: si la cantidad es mayor que 0, se le sumara al saldo la cantidad, y
		// esExitoso sera true
		if (cantidad > 0) {
			usuario.setSaldo(usuario.getSaldo() + cantidad);
			esExitoso = true;
		} // Fin If

		// Devuelve esExitoso al main
		return esExitoso;

	}
	
	/**
	 * Funcion modificarUsuario: modifica el usuario
	 * 
	 * @param usuario usuario en cuestion a modificar
	 * @param nombre nombre nuevo
	 * @return si se ha podido hacer el cambio o no
	 */
	public static boolean modificarUsuario(CuentaCorriente usuario, String nombre) {

		// boolean esExitoso: booleana que indica si la funcion ha salido bien o no (por
		// defecto, es falso)
		boolean esExitoso = false;

		// If: si la cantidad es mayor que 0, se le sumara al saldo la cantidad, y
		// esExitoso sera true
		if (!nombre.equals(usuario.getNombre())) {
			usuario.setNombre(nombre);
			esExitoso = true;
		} // Fin If

		// Devuelve esExitoso al main
		return esExitoso;

	}

	/**
	 * Funcion mostrarInformacion: muestra informacion de un usuario
	 */
	public static void mostrarInformacion(CuentaCorriente usuario) {

		// int pos: posicion del array a buscar
		int pos = 0;

		// Busca las posiciones vacias
		pos = buscaPosicion(usuario);

		// If: Si la posicion es mayor o igual a 0, se procedera a mostrar ese usuario en concreto
		if (pos >= 0) {
			System.out.println(usuarios[pos]);
		} else {
			// De lo contrario, te saltara un error
			System.out.println("ERROR: ID vacia o invalida");
		} // Fin If-Else

	}

	/**
	 * Funcion mostrarInformacionTotal: muestra la informacion total del usuario
	 * 
	 * @param usuario usuario a mostrar
	 */
	public static void mostrarInformacionTotal(CuentaCorriente usuario) {

		// For-Each: analiza todo el array de usuarios y muestra los espacios no vacios
		// en pantalla
		for (CuentaCorriente usuarioAnalizado : usuarios) {
			// If-Else: si el usuario no es nulo, se mostrara por pantalla. De lo contrario,
			// se hara un break
			if (usuarioAnalizado != null) {
				System.out.println(usuario);
			} else {
				break;
			} // Fin If-Else
		} // Fin For-Each

	}

	/**
	 * Funcion añadirUsuario: añade un usuario
	 * 
	 * @param usuario usuario a añadir
	 * @return si la operacion salio bien
	 */
	public static boolean añadirUsuario(CuentaCorriente usuario) {

		// boolean exitoso: muestra si ha salido bien la operacion o no
		boolean exitoso = false;

		// int pos: posicion del array a buscar
		int pos = 0;

		// int i: posicion del array a buscar espacios null
		int i = 0;

		// Busca las posiciones vacias
		pos = buscaPosicion(usuario);

		// If: Si la posicion es -1, se procedera a añadir el usuario
		if (pos == -1) {

			// While: Mientras que i sea menor que la longitud de usuarios y usuarios[i] no
			// sea null, se añadira 1
			while (i < usuarios.length && usuarios[i] != null) {
				i++;
			} // Fin While

			// If: Se añadira el usuario y se establecera su saldo a 0
			if (i < usuarios.length) {
				usuarios[i] = usuario;
				usuarios[i].setSaldo(0);
				exitoso = true;
			} // Fin If

		} // Fin If

		// Devuelve exitoso al main
		return exitoso;

	}

	/**
	 * Funcion borrarUsuario: eliminar un usuario
	 * 
	 * @param usuario usuario a eliminar
	 * @return si la operacion salio bien
	 */
	public static boolean borrarUsuario(CuentaCorriente usuario) {

		// boolean exitoso: muestra si ha salido bien la operacion o no
		boolean exitoso = false;

		// int pos: posicion del array a buscar
		int pos = 0;

		// Busca las posiciones vacias
		pos = buscaPosicion(usuario);

		// If: Si la posicion es mayor o igual a 0, se procedera a eliminar el usuario
		if (pos >= 0) {

			usuarios[pos] = null;
			exitoso = true;

		} // Fin If

		// Devuelve exitoso al main
		return exitoso;

	}

	/**
	 * Funcion buscaPosicion: busca la posicion del usuario
	 * 
	 * @param usuario usuario a buscar
	 * @return posicion del usuario
	 */
	public static int buscaPosicion(CuentaCorriente usuario) {

		int pos = -1;
		int i = 0;

		while (i < usuarios.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (usuarios[i] != null && usuarios[i].equals(usuario)) {
				pos = i;
			}

			i++;
		}

		return pos;

	}

}