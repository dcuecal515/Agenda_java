package paquete;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean esXOR;
		
		Contacto contacto = new Contacto("Pepe","Cordero Arrollo","12-12-2012",666231223,"PepeArrCord@gmail.com");
		
		Contacto contacto2 = new Contacto("Pepe","Cordero Arrollo","12-12-2012",666231223,"PepeArrCord@gmail.com");
		
		Lista lista = new Lista();
		
		lista.agregarContacto(contacto);
		
		lista.agregarContacto(contacto2);
		
		lista.mostrarLista();
		
		
	}

}
