package ejercicio03;

/**
 * Clase ArrayPizzas
 * 
 * @author Nestor Sanchez
 */
public class ArrayPizzas {

	/**
	 * Pizza[] pizzas: lista de pizzas
	 */
	public static Pizza[] pizzas = new Pizza[50];

	/**
	 * Funcion mostrarPizzas: muestra las pizzas
	 * 
	 * @param pedido
	 */
	public static void mostrarPizzas(Pizza pedido) {

		// For-Each: analiza todo el array de pizzas y muestra los espacios no vacios en
		// pantalla
		for (Pizza pedidoN : pizzas) {
			// If-Else: si el pedido no es nulo, se mostrara por pantalla. De lo contrario,
			// se hara un break
			if (pedidoN != null) {
				System.out.println(pedidoN);
			} else {
				break;
			} // Fin If-Else
		} // Fin For-Each

	}

	/**
	 * Funcion nuevoPedido: añade un pedido al array
	 * 
	 * @param pedido pedido a añadir
	 * @return si se ha podido añadir el pedido o no
	 */
	public static boolean nuevoPedido(Pizza pedido) {

		// boolean exitoso: muestra si ha salido bien la operacion o no
		boolean exitoso = false;

		// int pos: posicion del array a buscar
		int pos = 0;

		// int i: posicion del array a buscar espacios null
		int i = 0;

		// Busca la posicion
		pos = buscaPosicion(pedido);

		// If: si la posicion es -1, se procedera a añadir la pizza
		if (pos == -1) {

			// While: avanza i mientras i sea menor que pizzas.length y pizzas[i] no sea
			// nulo
			while (i < pizzas.length && pizzas[i] != null) {
				i++;
			} // Fin While

			// If: si i es menor que pizzas.length, se añadira la pizza
			if (i < pizzas.length) {

				// Añade la pizza al pedido
				pizzas[i] = pedido;

				// Pon el estado de la pizza como pedida
				pizzas[i].setEstado("Pedida");

				// exitoso sera true
				exitoso = true;

			} // Fin If

		} // Fin If

		// Devuelve exitoso al main
		return exitoso;
	}

	/**
	 * Funcion pizzaServida: pon la pizza como servida
	 * 
	 * @param pedido pedido a modificar
	 * @return si se ha podido servir la pizza o no
	 */
	public static boolean pizzaServida(Pizza pedido) {

		// boolean exitoso: muestra si ha salido bien la operacion o no
		boolean exitoso = false;

		// int pos: posicion del array del pedido a modificar
		int pos = 0;

		// Busca la posicion
		pos = buscaPosicion(pedido);

		// If: si la posicion es mayor o igual a 0, se procedera a modificar el pedido
		if (pos >= 0) {

			// Pon el estado de la pizza como pedida
			pizzas[pos].setEstado("Servida");

			// exitoso sera true
			exitoso = true;

		} // Fin If

		// Devuelve exitoso al main
		return exitoso;

	}

	/**
	 * Funcion buscaPosicion: busca la posicion del pedido
	 * 
	 * @param pedido pedido a buscar
	 * @return posicion del pedido
	 */
	private static int buscaPosicion(Pizza pedido) {
		int pos = -1;
		int i = 0;

		while (i < pizzas.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (pizzas[i] != null && pizzas[i].equals(pedido)) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

}