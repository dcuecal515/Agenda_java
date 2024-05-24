package paquete;

import java.util.Date;

public class Contacto extends Persona {
	
	/**
	 * Atributo int telefono, Sirve para guardar el telefono del contacto
	 */
	private int telefono;
	/**
	 * Atributo String email, Sirve para guardar el email del contacto
	 */
	private String email;
	
	/**
	 * Atributo String direccion, Sirve para guardar la direccion postal del contacto
	 */
	private String direccion;
	/**
	 * 
	 * @param Permite ingresar el nombre del contacto, heredado de Persona
	 * @param Permite ingresar los apellidos del contacto, heredado de Persona
	 * @param Permite ingresar la fecha de nacimiento del contacto, heredado de Persona
	 * @param Permite ingresar el telefono del contacto
	 * @param Permite ingresar el email del contacto
	 * @param Permite ingresar la direccion postal del contacto
	 * @see <a href="Persona.java">Link a la clase Persona</a>
	 * 
	 */
	public Contacto(String nombre, String apellidos, String fecha_nac, int telefono, String email, String direccion) {
		super(nombre, apellidos, fecha_nac);
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		des+=" , ";
		des+=direccion;
		return des;
	}
}
