package ejercicio03;

/**
 * Clase Pizza
 * 
 * @author Nestor Sanchez
 */
public class Pizza {

	/**
	 * int codigo: codigo de la pizza
	 */
	private int codigo;

	/**
	 * String tamaño: tamaño de la pizza
	 */
	private String tamaño;

	/**
	 * String tipo: tipo de la pizza
	 */
	private String tipo;

	/**
	 * String estado: estado del pedido
	 */
	private String estado;

	/**
	 * Constructor sin parametros
	 */
	public Pizza() {
		super();
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param codigo codigo de la pizza
	 * @param tamaño tamaño de la pizza
	 * @param tipo   tipo de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}
		if (tamaño != null && (tamaño.equals("Mediana") || tamaño.equals("Familiar"))) {
			this.tamaño = tamaño;
		}
		if (tamaño != null && (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}

	}

	/**
	 * Constructor con codigo
	 * 
	 * @param codigo codigo de la pizza
	 */
	public Pizza(int codigo) {
		super();
		if (codigo > 0) {
			this.codigo = codigo;
		}

	}

	/**
	 * Getter getCodigo
	 * 
	 * @return codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter setCodigo
	 * 
	 * @param codigo codigo de la pizza
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter getTamaño
	 * 
	 * @return tamaño de la pizza
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * Setter setTamaño
	 * 
	 * @param tamaño tamaño de la pizza
	 */
	public void setTamaño(String tamaño) {
		if (tamaño != null && !tamaño.equals("") && (tamaño.equals("Mediana") || tamaño.equals("Familiar"))) {
			this.tamaño = tamaño;
		}
	}

	/**
	 * Getter getTipo
	 * 
	 * @return tipo de la pizza
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setter setTipo
	 * 
	 * @param tipo tipo de la pizza
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("") && (tipo.equals("Margarita") || tipo.equals("CuatroQuesos") || tipo.equals("Funghi"))) {
			this.tipo = tipo;
		}
	}

	/**
	 * Getter getEstado
	 * 
	 * @return estado del pedido
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter setEstado
	 * 
	 * @param estado estado del pedido
	 */
	public void setEstado(String estado) {
		if (estado != null && !estado.equals("") && (estado.equals("Pedida") || estado.equals("Servida"))) {
			this.estado = estado;
		}
	}

	@Override
	public String toString() {
		String cadena = "";
		cadena += "Codigo:" + codigo + " | ";
		cadena += "Tamaño:" + tamaño + " | ";
		cadena += "Tipo:" + tipo + " | ";
		cadena += "Estado:" + estado;
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {

		// Boolean iguales: booleana a devolver
		boolean iguales = false;

		Pizza art2 = (Pizza) obj;

		// Si el codigo de este articuloes igual al codigo del articulo a analizar
		if (this.codigo == art2.codigo) {
			// iguales sera true
			iguales = true;
		}

		// Devuelve iguales
		return iguales;
	}

}