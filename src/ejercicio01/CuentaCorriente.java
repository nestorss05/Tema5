package ejercicio01;

/**
 * Clase CuentaCorriente
 * 
 * @author Nestor Sanchez
 */
public class CuentaCorriente {

	/**
	 * String dni: dni del usuario
	 */
	private String dni;

	/**
	 * String nombre: nombre del usuario
	 */
	private String nombre;

	/**
	 * String saldo: saldo del usuario
	 */
	private int saldo;

	/**
	 * Constructor sin parametros
	 */
	public CuentaCorriente() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param dni:    dni del usuario
	 * @param nombre: nombre del usuario
	 * @param saldo:  saldo inicial del usuario
	 */
	public CuentaCorriente(String dni, String nombre, int saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Constructor con casi todos los parametros
	 * 
	 * @param dni:   dni del usuario
	 * @param saldo: saldo inicial del usuario
	 */
	public CuentaCorriente(String dni, int saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}

	/**
	 * Funcion sacarDinero: saca dinero de la cuenta
	 * 
	 * @param dni    dni del usuario
	 * @param saldo: saldo inicial del usuario
	 * @return: si se ha podido hacer la operacion o no
	 */
	public boolean sacarDinero(String dni, int saldo) {

		// boolean esExitoso: booleana que indica si la funcion ha salido bien o no (por
		// defecto, es falso)
		boolean esExitoso = false;

	}

}
