package paquete;

import java.io.Serializable;

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
	 * 
	 * @param Permite ingresar el nombre del contacto, heredado de Persona
	 * @param Permite ingresar los apellidos del contacto, heredado de Persona
	 * @param Permite ingresar la fecha de nacimiento del contacto, heredado de Persona
	 * @param Permite ingresar el telefono del contacto
	 * @param Permite ingresar el email del contacto
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
	 * @return devuelve el telefono del contacto de tipo int
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param Permite ingresar el nuevo telefono que se guardará en la variable telefono del contacto
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return devuelve el email del contacto de tipo String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param Permite ingresar el nuevo email que se guardará en la variable email del contacto
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return devuelve un String con la descripcion del contacto
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
