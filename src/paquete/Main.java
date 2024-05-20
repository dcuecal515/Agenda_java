package paquete;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean esXOR;
		
		Contacto contacto = new Contacto("Pepe","Cordero Arrollo","12-12-2012",666231223,"PepeArrCord@gmail.com","C/Francia 25190");
		
		Contacto contacto2 = new Contacto("Pepe","Cordero Arrollo","12-12-2012",666231223,"PepeArrCord@gmail.com","C/Mexico 25113");
		
		Lista lista = new Lista();
		
		lista.agregarContacto(contacto);
		
		lista.agregarContacto(contacto2);
		
		lista.mostrarLista();
		
		Menu menu = new Menu();
		
		int opcion = menu.mostrarMenu();
		
		menu.mostrarOpcion(opcion);
		
	}

}
