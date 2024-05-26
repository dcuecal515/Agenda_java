package paquete;

// Imports
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	
	/**
	 * Atributo array de tipo Contacto, Sirve para guardar los contactos
	 */
	private List<Contacto> listacontactos = new ArrayList<Contacto>();
	/**
	 * Atributo de Tipo Scanner, sirve para escanear los textos introducidos por el usuario
	 */
	private Scanner sc = new Scanner(System.in);
	/**
	 * Atributo de Tipo Cifrado, sirve para utilizar la clase Cifrado en las listas 
	 */
	private Cifrado cifrado = new Cifrado();
	
	/**
	 * 
	 * @return Devuelve un nuevo contacto con los datos introducidos por el usuario
	 */
	public Contacto pedirDatosContacto() {
		/**
		 * Atributo de tipo int, sirve para almacenar el año para el nuevo contacto
		 */
		int anio;
		/**
		 * Atributo de tipo int, sirve para almacenar el mes para el nuevo contacto
		 */
		int mes;
		/**
		 * Atributo de tipo int, sirve para almacenar el dia para el nuevo contacto
		 */
		int dia;
		
		// Pide el nombre y lo almacena en un String
		System.out.println("Introduzca el nombre: ");
        String nombre = sc.next();
        
        // Limpia el buffer de teclado
        sc.nextLine();
        
        // Pide los apellidos y los almacena en un String
        System.out.println("Introduzca los apellidos: ");
        String apellidos = sc.nextLine();
        
        // Pide el año de nacimiento y lo almacena en un int
        do {
        	System.out.println("Introduzca el año de nacimiento: ");
            anio = sc.nextInt();
            if(anio<1000 || anio>2024)
            	System.out.println("Ha introducido año invalido");
        }while(anio<1000 || anio>2024);// Mientras este en el rango 1000-2024
        
        // Pide el mes de nacimiento y lo almacena en un int
        do {
        	System.out.println("Introduzca el mes de nacimiento: ");
            mes = sc.nextInt();
            if(mes<1 || mes>12)
            	System.out.println("Ha introducido el mes invalido");
		} while (mes<1 || mes>12); // Mientras que este en el rango 1-12
        
        // Pide el dia de nacimiento y lo almacena en un int
        do {
        	System.out.println("Introduzca el dia de nacimiento: ");
            dia = sc.nextInt();
            if(mes<1 || mes>12)
            	System.out.println("Ha introducido el mes invalido");
		} while (dia<1 || dia>31);// Mientras que este en el rango 1-31
        
        // Pide el telefono y lo almacena en un int
        System.out.println("Introduzca el telefono: ");
        int telefono = sc.nextInt();
        
        //Pide el email y lo almacena en un String
        System.out.println("Introduzca el email: ");
        String email = sc.next();
        
        return new Contacto(nombre, apellidos, anio, mes, dia, telefono, email);
	}
	
	/**
	 * 
	 * @param Permite introducir un contacto de tipo Contacto
	 */
	public void agregarContacto(Contacto contacto) {
		listacontactos.add(contacto);
	}
	
	/**
	 * 
	 * @param Permite introducir un nombre de tipo String
	 * @return Devuelve el contacto si lo encuentra sino devuelve null
	 */
	public Contacto buscarContacto(String nombre) {
		for (Contacto contacto : listacontactos) {
			if(contacto.getNombre().equalsIgnoreCase(nombre)) {
				return contacto;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param Permite introducir el contacto a editar
	 */
	public void editarContacto(Contacto contacto) {
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("|-----------------------------------|");
			System.out.println("|   1. Cambiar nombre y apellidos   |");
			System.out.println("|   2. Cambiar numero de telefono   |");
			System.out.println("|   3. Cambiar fecha de nacimiento  |");
			System.out.println("|   4. Cambiar email                |");
			System.out.println("|   5. Salir                        |");
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
				int anio;
				int mes;
				int dia;
				do {
		        	System.out.println("Introduzca el nuevo año de nacimiento: ");
		            anio = sc.nextInt();
		            if(anio<1000 || anio>2024)
		            	System.out.println("Ha introducido año invalido");
		        }while(anio<1000 || anio>2024);
		        
		        do {
		        	System.out.println("Introduzca el nuevo mes de nacimiento: ");
		            mes = sc.nextInt();
		            if(mes<1 || mes>12)
		            	System.out.println("Ha introducido el mes invalido");
				} while (mes<1 || mes>12);
		        
		        do {
		        	System.out.println("Introduzca el nuevo dia de nacimiento: ");
		            dia = sc.nextInt();
		            if(mes<1 || mes>12)
		            	System.out.println("Ha introducido el mes invalido");
				} while (dia<1 || dia>31);
				contacto.setFecha_nac(anio, mes, dia);
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
				System.out.println("Saliendo....");
				break;
			}
			default:
				System.out.println("No has seleccionado una opcion valida");
			}
		} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
		
	}
	
	public void consultarContacto(Contacto contacto) {
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		while (opcion != 6) {
			do {
				System.out.println("|-----------------------------------|");
				System.out.println("|   1. Cosultar nombre y apellidos  |");
				System.out.println("|   2. Consultar numero de telefono |");
				System.out.println("|   3. Consultar fecha de nacimiento|");
				System.out.println("|   4. Consultar email              |");
				System.out.println("|   5. Salir                        |");
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
					System.out.println("Saliendo....");
					break;
				}
				default:
					System.out.println("No has seleccionado una opcion valida");
				}
			} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
		}
	}
	
	public void eliminarContacto(Contacto contacto) {
		listacontactos.remove(contacto);
		System.out.println("Eliminando contacto con nombre: "+contacto.getNombre());
	}
	
	public void numeroContactos() {
		System.out.println("Tienes un total de "+listacontactos.size()+" contactos");
	}
	
	public void listarContactos() {
		System.out.println("Contactos: ");
		for (Contacto contacto : listacontactos) {
			System.out.println(contacto.describir());
		}
	}
	
	public int numContactos() {
		return listacontactos.size();
	}
	
	public void cifrarContactos(int clave, boolean tipoC) {
		listacontactos=cifrado.cifrarContactos(listacontactos, clave, tipoC);
	}
	
	public void descifrarContactos(int clave, boolean tipoC) {
		listacontactos=cifrado.descifrarContactos(listacontactos, clave, tipoC);
	}
	
	public void volcarLista() {
		try { 
			FileOutputStream archivo = new FileOutputStream("contactos.bin");
			ObjectOutputStream escritura = new ObjectOutputStream(archivo);
			for (Contacto contacto : listacontactos) {
				escritura.writeObject(contacto);
				System.out.println("Objeto añadido con exito");
			}
			escritura.close();
		}catch (IOException error) {
			error.printStackTrace(System.out);
		}
	}
	
	public List<Contacto> recuperarLista() throws ClassNotFoundException, EOFException, IOException {
		List<Contacto> contactos = new ArrayList<Contacto>();
		Contacto contacto = null;
		
			
		FileInputStream archivo = new FileInputStream("contactos.bin");
		ObjectInputStream lectura = new ObjectInputStream(archivo);
		
		contacto = (Contacto) lectura.readObject();
		
		while(contacto != null) {
			contactos.add(contacto);
			contacto = (Contacto) lectura.readObject();
		}
		return contactos;
			
	}
	
	public void volcarListaATexto(PrintWriter fichero) {
		for (Contacto contacto : listacontactos) {
			fichero.println(contacto.describir());
		}
	}
	
	public void setListacontactos(List<Contacto> listacontactos) {
		this.listacontactos = listacontactos;
	}

}
