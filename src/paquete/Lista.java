package paquete;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	/**
	 * Atributo array de tipo Contacto, Sirve para guardar los contactos
	 */
	List<Contacto> listacontactos = new ArrayList<Contacto>();
	
	public void agregarContacto(Contacto contacto) {
		listacontactos.add(contacto);
	}
	
	public void mostrarLista() {
		for (Contacto contacto : listacontactos) {
			System.out.println(contacto.describir());
		}
	}

}
