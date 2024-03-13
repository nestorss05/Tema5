package ejercicio02;

/**
 * Clase Gestisimal
 * 
 * @author Nestor Sanchez
 */
public class Gestisimal {

	/**
	 * int codigo: codigo del producto
	 */
	private int codigo;

	/**
	 * String descripcion: descripcion del producto
	 */
	private String descripcion;

	/**
	 * String precioCompra: precio de compra del producto
	 */
	private double precioCompra;

	/**
	 * String precioVenta: precio de venta del producto
	 */
	private double precioVenta;

	/**
	 * int stock: stock que tiene un producto
	 */
	private int stock;

	/**
	 * Constructor sin parametros
	 */
	public Gestisimal() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo       código del artículo
	 * @param descripcion  descripción del artículo
	 * @param precioCompra recio al que se ha comprado el artículo
	 * @param precioVenta  precio al que se vende el artículo
	 * @param stock        nº de existencias disponibles del artículo
	 */
	public Gestisimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();

		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}

		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}

		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}

		if (stock >= 0) {
			this.stock = stock;
		}

	}

	/**
	 * Constructor solo con parametro codigo
	 * 
	 * @param codigo código del artículo
	 */
	public Gestisimal(int codigo) {
		super();

		if (codigo > 0) {
			this.codigo = codigo;
		}

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		String cadena = "--------------------------------------------------\n";
		cadena += "Codigo: " + codigo + " ";
		cadena += "Descripcion: " + descripcion + " ";
		cadena += "Precio compra: " + precioCompra + " ";
		cadena += "Precio venta: " + precioVenta + " ";
		cadena += "Stock: " + stock;
		return cadena;
	}

}
