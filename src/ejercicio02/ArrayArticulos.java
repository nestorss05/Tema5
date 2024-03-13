package ejercicio02;

/**
 * Clase ArrayArticulos
 * 
 * @author Nestor Sanchez
 */
public class ArrayArticulos {

	// Gestisimal[] articulos: array de articulos en el almacen
	public static Gestisimal[] articulos = new Gestisimal[20];

	public static void mostrarProductos(Gestisimal articulo) {
		for (Gestisimal articuloElegido : articulos) {
			if (articuloElegido != null) {
				System.out.println(articuloElegido);
			}
		}
	}

	/**
	 * alta: da de alta un articulo
	 * 
	 * @param art articulo en cuestion
	 * @return si se ha añadido o no el articulo
	 */
	public static boolean alta(Gestisimal art) {

		// boolean anyadido: comprobante de si se ha hecho la operacion bien o no
		boolean anyadido = false;

		// 1º Comprobar si el artículo ya existe
		int i = 0;

		// Busca el articulo
		int pos = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
		if (pos == -1) {

			// While: mientras que no se pase el array y articulos no sea null, se sumara i
			while (i < articulos.length && articulos[i] != null) {
				i++;
			} // Fin While

			// If: si i es menor que la longitud de articulos, se asignara el articulo a
			// articulos[i]
			if (i < articulos.length) {
				articulos[i] = art;
				anyadido = true;
			} // Fin If
		} // Fin If

		// Devuelve anyadido al main
		return anyadido;

	}

	/**
	 * Funcion baja: da de baja un articulo
	 * 
	 * @param art articulo a dar de baja
	 * @return si se ha dado de baja el articulo
	 */
	public static boolean baja(Gestisimal art) {

		// boolean eliminado: comprobante de si se ha hecho la operacion bien o no
		boolean eliminado = false;

		// Busca el articulo
		int pos = buscaArticulo(art);

		// Si se ha encontrado el articulo, se dara de baja el articulo
		if (pos >= 0) {

			// Da de baja al articulo
			articulos[pos] = null;

			// La variable eliminado sera true
			eliminado = true;

		} // Fin If

		// Devuelve eliminado al main
		return eliminado;

	}

	/**
	 * Funcion modificar: modifica un articulo
	 * 
	 * @param art          articulo a modificar
	 * @param pos          posicion del articulo
	 * @param descripcion  descripcion del articulo
	 * @param precioCompra precio de compra del articulo
	 * @param precioVenta  precio de venta del articulo
	 * @param opcion2      opcion elegida anteriormente para el parametro a
	 *                     modificar
	 * @return si la modificacion ha salido bien o no
	 */
	public static boolean modificar(Gestisimal art, int pos, String descripcion, double precioCompra,
			double precioVenta, int opcion2) {

		// boolean modificado: comprobante de si se ha hecho la operacion bien o no
		boolean modificado = false;

		// Switch: Modifica el articulo mediante la opcion elegida anteriormente
		switch (opcion2) {

		// Case 1: modifica la descripcion
		case 1 -> {

			articulos[pos].setDescripcion(descripcion);
			modificado = true;

		}

		// Case 2: modifica el precio de compra
		case 2 -> {

			articulos[pos].setPrecioCompra(precioCompra);
			modificado = true;

		}

		// Case 3: modifica el precio de venta
		case 3 -> {

			articulos[pos].setPrecioVenta(precioVenta);
			modificado = true;

		}

		} // Fin Switch

		// Devuelve modificado al main
		return modificado;

	}

	/**
	 * Funcion entradaMercancia: añade stock a un producto
	 * 
	 * @param art   articulo en cuestion
	 * @param pos   posicion del articulo
	 * @param stock stock a añadir
	 * @return si se ha realizado la operacion o no
	 */
	public static boolean entradaMercancia(Gestisimal art, int pos, int stock) {

		// boolean hecho: comprobante de si se ha hecho la operacion bien o no
		boolean hecho = false;

		// int stockAnterior: stock anterior del producto
		int stockAnterior = articulos[pos].getStock();

		// If: si el stock nuevo es mayor que 0, se le añadira a stockAnterior el stock
		// a añadir
		if (stock > 0) {
			articulos[pos].setStock(stockAnterior + stock);
			hecho = true;
		} // Fin If

		// Devuelve hecho al main
		return hecho;

	}

	/**
	 * Funcion salidaMercancia: quita stock a un producto
	 * 
	 * @param art   articulo en cuestion
	 * @param pos   posicion del articulo
	 * @param stock stock a quitar
	 * @return si se ha realizado la operacion o no
	 */
	public static boolean salidaMercancia(Gestisimal art, int pos, int stock) {

		// boolean hecho: comprobante de si se ha hecho la operacion bien o no
		boolean hecho = false;

		// int stockAnterior: stock anterior del producto
		int stockAnterior = articulos[pos].getStock();

		// If: si la resta del stock anterior menos el stock nuevo es mayor o igual que
		// 0, se le restara a stockAnterior el stock a restar
		if (stockAnterior - stock >= 0) {
			articulos[pos].setStock(stockAnterior - stock);
			hecho = true;
		} // Fin If

		// Devuelve hecho al main
		return hecho;

	}

	/**
	 * Funcion buscaArticulo: busca un articulo
	 * 
	 * @param art articulo a buscar
	 * @return posicion del articulo
	 */
	public static int buscaArticulo(Gestisimal art) {
		int i = 0;
		int pos = -1;

		while (i < articulos.length && pos == -1) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].equals(art)) {
				pos = i;
			}

			i++;
		}

		return pos;
	}

}