package paquete;

import java.util.Date;

public class Contacto extends Persona {
	
	private int telefono;
	private String email;
	
	public Contacto(String nombre, String apellidos, String fecha_nac, int telefono, String email) {
		super(nombre, apellidos, fecha_nac);
		this.telefono = telefono;
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String describir() {
		String des = "";
		des+=super.getApellidos();
		des+=" , ";
		des+=super.getNombre();
		des+="/n";
		des+=super.getFecha_nac();
		des+=" , ";
		des+=telefono;
		des+=" , ";
		des+=email;
		return des;
	}
	
	
}
