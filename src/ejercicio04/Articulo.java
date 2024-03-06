package ejercicio04;

/**
 * Clase Articulo
 * 
 * @author Nestor Sanchez
 */
public class Articulo {

	/**
	 * String nombre: nombre del articulo
	 */
	private String nombre;

	/**
	 * double precio: precio del articulo
	 */
	private double precio;

	/**
	 * double IVA: % de IVA a aplicar
	 */
	public static final double IVA = 0.21;

	/**
	 * int cuantosQuedan: cantidad de articulos que faltan en el stock
	 */
	private int cuantosQuedan;

	/**
	 * Constructor vacio
	 */
	public Articulo() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre:        nombre del articulo
	 * @param precio:        precio del articulo
	 * @param cuantosQuedan: cantidad de articulos que faltan en el stock
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Funcion imprimirInformacion: imprime informacion del articulo
	 */
	public void imprimirInformacion() {
		System.out.println("Nombre del articulo: " + nombre);
		System.out.println("Precio sin IVA: " + precio);
		System.out.println("Stock: " + cuantosQuedan);
	}

	/**
	 * Funcion getPVP: obtiene el precio final de un producto
	 * 
	 * @return: precio final del producto
	 */
	public double getPVP() {
		return precio + (precio * IVA);
	}

	/**
	 * Funcion getPVPDescuento: obtiene el precio final con descuento
	 * 
	 * @param descuento: descuento a aplicar
	 * @return: precio final con descuento
	 */
	public double getPVPDescuento(double descuento) {
		double precioFinal;
		if ((precio * IVA) - descuento < 0) {
			precioFinal = precio + (precio * IVA);
		} else {
			precioFinal = (precio + (precio * IVA)) - descuento;
		}
		return precioFinal;
	}

	/**
	 * Funcion vender: vende x cantidad de un producto
	 * 
	 * @param cantidadAComprar: cantidad a comprar
	 * @return: si la operacion ha salido bien o no
	 */
	public boolean vender(int cantidad) {
		boolean hecho = false;
		if ((this.cuantosQuedan - cantidad) >= 0) {
			this.cuantosQuedan = this.cuantosQuedan - cantidad;
			hecho = true;
		}
		return hecho;
	}

	/**
	 * Funcion almacenar: almacena x cantidad de un producto
	 * 
	 * @param cantidadAAlmacenar: cantidad a almacenar
	 */
	public void almacenar(int cantidad) {
		this.cuantosQuedan = this.cuantosQuedan + cantidad;
	}

}