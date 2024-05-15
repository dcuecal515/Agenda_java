package paquete;

public class Lista {
	
	/**
	 * Atributo array de tipo Contacto, Sirve para guardar los contactos
	 */
	Contacto[] arraycontactos = new Contacto[20];
	
	/**
	 * Atributo int pos, Sirve para saber la posicion en el array
	 */
	private int pos=0;

	public int getPos() {
		return pos;
	}
	
	public void agregarContacto(Contacto contacto) {
		arraycontactos[pos]=contacto;
		pos++;
	}
	
	public void mostrarLista() {
		for (int i = 0; i < pos; i++) {
			System.out.println(arraycontactos[i].describir());
		}
	}

}
