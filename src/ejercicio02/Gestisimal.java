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
	 * Departamento departamento: departamento al que pertenece el artículo
	 */
	private Departamento departamento;
	
	/**
	 * enum Departamento: departamento al que pertenece el artículo
	 */
	private enum Departamento {
		ELECTRONICA, ALIMENTACION, DROGUERIA
	}

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
	 * @param precioCompra precio al que se ha comprado el artículo
	 * @param precioVenta  precio al que se vende el artículo
	 * @param stock        nº de existencias disponibles del artículo
	 * @param departamento departamento al que pertenece el artículo
	 */
	public Gestisimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock, String departamento) {
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
		
		this.departamento = Departamento.valueOf(departamento);

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

	/**
	 * Getter getCodigo
	 * @return codigo del articulo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter setCodigo
	 * @param codigo codigo del articulo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter getDescripcion
	 * @return descripción del artículo
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter setDescripcion
	 * @param descripcion descripción del artículo
	 */
	public void setDescripcion(String descripcion) {
		if (descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}

	/**
	 * Getter getPrecioCompra
	 * @return precio al que se ha comprado el artículo
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Setter setPrecioCompra
	 * @param precioCompra precio al que se ha comprado el artículo
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * Getter getPrecioVenta
	 * @return precio al que se vende el artículo
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Setter setPrecioVenta
	 * @param precioVenta precio al que se vende el artículo
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * Getter getStock 
	 * @return nº de existencias disponibles del artículo
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Setter setStock
	 * @param stock nº de existencias disponibles del artículo
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/**
	 * Getter getDepartamento
	 * @return departamento al que pertenece el artículo
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Setter setDepartamento
	 * @param departamento departamento al que pertenece el artículo
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		String cadena = "--------------------------------------------------\n";
		cadena += "Codigo: " + codigo + " | ";
		cadena += "Descripcion: " + descripcion + " | ";
		cadena += "Departamento: " + departamento + " | ";
		cadena += "Precio Compra: " + precioCompra + " | ";
		cadena += "Precio Venta: " + precioVenta + " | ";
		cadena += "Stock: " + stock;
		return cadena;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Gestisimal art2 = (Gestisimal) obj;
		
		if(this.codigo == art2.codigo) {
			iguales = true;
		}
		
		return iguales;
	}

}