package ejercicio04;

import java.util.Objects;

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
	 * Constructor con dni
	 * 
	 * @param dni:    dni del usuario
	 */
	public CuentaCorriente(String dni) {
		super();
		this.dni = dni;
	}

	/**
	 * Getter getDNI
	 * 
	 * @return dni del usuario
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Setter setDNI
	 * 
	 * @param dni dni del usuario
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Getter getNombre
	 * 
	 * @return nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter setNombre
	 * 
	 * @param nombre nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter getSaldo
	 * 
	 * @return saldo del usuario
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * Setter setSaldo
	 * 
	 * @param saldo saldo del usuario
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String mensaje = "";
		mensaje += "Dni: " + dni + " | ";
		mensaje += "Nombre: " + nombre + " | ";
		mensaje += "Saldo: " + saldo + "$NS";
		return mensaje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		
		// Boolean iguales: booleana a devolver
		boolean iguales = false;
		
		CuentaCorriente cc = (CuentaCorriente) obj;
		
		// Si el dni de este usuario es igual al dni del usuario a analizar
		if (this.dni.equals(cc.dni)) {
			// iguales sera true
			iguales = true;
		}
			
		// Devuelve iguales
		return iguales;
	}

}
