package paquete;

import java.io.Serializable;

/**
 * Clase en la que se guardan los datos de los contactos del usuario
 */
public class Contacto extends Persona implements Serializable{ //Serializable Sirve para poder convertir una clase en un flujo de bytes
	
	/**
	 * Atributo int telefono, Sirve para guardar el telefono del contacto
	 */
	private int telefono;
	/**
	 * Atributo String email, Sirve para guardar el email del contacto
	 */
	private String email;
	
	/**
	 * Crea una instancia de Contacto con los detalles proporcionados.
	 * 
	 * @param nombre    Es el nombre del contacto, heredado de Persona.
	 * @param apellidos Son los apellidos del contacto, heredado de Persona.
	 * @param anio      Es el año de nacimiento del contacto, heredado de Persona.
	 * @param mes       Es el mes de nacimiento del contacto, heredado de Persona.
	 * @param dia       Es el día de nacimiento del contacto, heredado de Persona.
	 * @param telefono  Es el teléfono del contacto.
	 * @param email     Es el email del contacto.
	 * @see <a href="Persona.java">Link a la clase Persona</a>
	 * 
	 */
	public Contacto(String nombre, String apellidos, int anio, int mes, int dia, int telefono, String email) {
		super(nombre, apellidos, anio, mes, dia);
		this.telefono = telefono;
		this.email = email;
	}

	/**
	 * 
	 * @return El telefono del contacto de tipo int
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Permite actualizar el telefono del contacto
	 * 
	 * @param telefono El numero de telefono nuevo
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return El email del contacto de tipo String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Permite actualizar el email del contacto
	 * 
	 * @param email Es el email del contacto
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return Un String con la descripcion del contacto
	 */
	public String describir() {
		String des = "";
		des+=super.getApellidos();
		des+=" , ";
		des+=super.getNombre();
		des+="\n";
		des+=super.getFecha_nac();
		des+=" , ";
		des+=telefono;
		des+=" , ";
		des+=email;
		return des;
	}
}
