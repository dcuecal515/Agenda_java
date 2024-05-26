package paquete;

import java.io.EOFException;
import java.io.IOException;

public class Main {

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
