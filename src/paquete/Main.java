package paquete;

import java.io.EOFException;
import java.io.IOException;

/**
 * Clase principal donde se llama a la clase menu
 */
public class Main {
	
	/**
	 * 
	 * @param args Es un vector de String que contiene en orden los argumentos que se le han pasado al programa
	 * @throws ClassNotFoundException Fallo por lectura o escritura en fichero
	 * @throws EOFException Fallo por lectura o escritura en fichero
	 * @throws IOException Fallo por lectura o escritura en fichero
	 */
	public static void main(String[] args) throws ClassNotFoundException, EOFException, IOException {
		// TODO Auto-generated method stub
		
		//Creamos un nuevo menu
		Menu menu = new Menu();
		
		//Elejimos la primera opcion
		int opcion = menu.mostrarMenu();
		
		//A partir de aqui todo se maneja en el menu
		menu.mostrarOpcion(opcion);
	}

}
