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
		boolean enc = buscaArticulo(art);

		// Si no he encontrado el artículo lo tengo que añadir
		if (!enc) {

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
	
	public static boolean baja(Gestisimal art) {

		// boolean eliminado: comprobante de si se ha hecho la operacion bien o no
		boolean eliminado = false;

		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].equals(art)) {
				articulos[i] = null;
				eliminado = true;
				break;
			}
		}

		// Devuelve anyadido al main
		return eliminado;

	}

	private static boolean buscaArticulo(Gestisimal art) {
		int i = 0;
		boolean enc = false;

		while (i < articulos.length && !enc) {
			// Compruebo que la posición no sea null
			// Compruebo si el artículo de la posición i es igual a art (artículo pasado por
			// parámetro)
			if (articulos[i] != null && articulos[i].equals(art)) {
				enc = true;
			}

			i++;
		}

		return enc;
	}

}
