package paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public Contacto buscarContacto(String nombre) {
		for (Contacto contacto : listacontactos) {
			if(contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}
	
	public void editarContacto(Contacto contacto) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-----------------------------------|");
			System.out.println("|   1. Cambiar nombre y apellidos   |");
			System.out.println("|   2. Cambiar numero de telefono   |");
			System.out.println("|   3. Cambiar fecha de nacimiento  |");
			System.out.println("|   4. Cambiar email                |");
			System.out.println("|   5. Cambiar direccion            |");
			System.out.println("|   6. Salir                        |");
			System.out.println("|-----------------------------------|");
			System.out.println("| Elige una opcion: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				String nombre;
				String apellidos;
				System.out.println("Introduzca el nuevo nombre: ");
				nombre = sc.next();
				System.out.println("Introduzca los nuevos apellidos: ");
				apellidos = sc.next();
				contacto.setNombre(nombre);
				contacto.setApellidos(apellidos);
				break;
			}
			case 2: {
				int numero;
				System.out.println("Introduzca el nuevo numero de telefono: ");
				numero = sc.nextInt();
				contacto.setTelefono(numero);
				break;
			}
			case 3: {
				String fecha;
				System.out.println("Introduzca la nueva fecha de nacimiento: ");
				fecha = sc.next();
				contacto.setFecha_nac(fecha);
				break;
			}
			case 4: {
				String email;
				System.out.println("Introduzca el nuevo email: ");
				email = sc.next();
				contacto.setEmail(email);
				break;
			}
			case 5: {
				String direccion;
				System.out.println("Introduzca la nueva direccion");
				direccion = sc.next();
				contacto.setDireccion(direccion);
				break;
			}
			case 6: {
				System.out.println("Saliendo....");
				break;
			}
			default:
				System.out.println("No has seleccionado una opcion valida");
			}
		} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6);
		
	}
	
	public void consultarContacto(Contacto contacto) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-----------------------------------|");
			System.out.println("|   1. Cosultar nombre y apellidos  |");
			System.out.println("|   2. Consultar numero de telefono |");
			System.out.println("|   3. Consultar fecha de nacimiento|");
			System.out.println("|   4. Consultar email              |");
			System.out.println("|   5. Consultar direccion          |");
			System.out.println("|   6. Salir                        |");
			System.out.println("|-----------------------------------|");
			System.out.println("| Elige una opcion: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: {
				System.out.println("Nombre: "+contacto.getNombre());
				System.out.println("Apellidos: "+contacto.getApellidos());
				break;
			}
			case 2: {
				System.out.println("Telefono: "+contacto.getTelefono());
				break;
			}
			case 3: {
				System.out.println("Fecha: "+contacto.getFecha_nac());
				break;
			}
			case 4: {
				System.out.println("Email: "+contacto.getEmail());
				break;
			}
			case 5: {
				System.out.println("Direccion: "+contacto.getDireccion());
				break;
			}
			case 6: {
				System.out.println("Saliendo....");
				break;
			}
			default:
				System.out.println("No has seleccionado una opcion valida");
			}
		} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6);
		
	}

}
