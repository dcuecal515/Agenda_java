package paquete;

// Imports
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que gestiona la lista de contactos del usuario
 */
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
	 * @return Un nuevo contacto con los datos introducidos por el usuario
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
	 * @param contacto Permite introducir un contacto de tipo Contacto
	 */
	public void agregarContacto(Contacto contacto) {
		listacontactos.add(contacto);
	}
	
	/**
	 * 
	 * @param nombre Permite introducir un nombre de tipo String
	 * @return El contacto si lo encuentra sino devuelve null
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
	 * @param contacto Permite introducir el contacto a editar
	 */
	public void editarContacto(Contacto contacto) {
		
		/**
		 * Atributo de tipo int, sirve para almacenar la opcion que quiere editar
		 */
		int opcion;
		/**
		 * Atributo de tipo Scanner, sirve para pedir los datos al usuario
		 */
		Scanner sc = new Scanner(System.in);
		
		// Muestra las opciones posibles y pide una opcion
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
			
			// Actualiza segun la opcion el contacto los nuevos datos
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
	
	/**
	 * 
	 * @param contacto Permite introducir el contacto a consultar
	 */
	public void consultarContacto(Contacto contacto) {
		
		/**
		 * Atributo de tipo int, sirve para almacenar la opcion que quiere consultar
		 */
		int opcion=0;
		
		/**
		 * Atributo de tipo Scanner, sirve para pedir los datos al usuario
		 */
		Scanner sc = new Scanner(System.in);
		
		// Muestra las opciones posibles y pide una opcion
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
				
				// Muestra segun la opcion el contacto los nuevos datos
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
		sc.close();
	}
	
	/**
	 * 
	 * @param contacto Permite introducir un contacto para eliminarlo
	 */
	public void eliminarContacto(Contacto contacto) {
		// Elimina el contacto de la lista de contactos
		listacontactos.remove(contacto);
		
		// Muestra el nombre del del contacto que se elimino
		System.out.println("Eliminando contacto con nombre: "+contacto.getNombre());
	}
	
	/**
	 * Muestra el numero de contactos
	 */
	public void numeroContactos() {
		System.out.println("Tienes un total de "+listacontactos.size()+" contactos");
	}
	
	/**
	 * Muestra la lista de los contactos
	 */
	public void listarContactos() {
		System.out.println("Contactos: ");
		for (Contacto contacto : listacontactos) {
			System.out.println(contacto.describir());
		}
	}
	
	/**
	 * 
	 * @return El numero de contactos de la lista
	 */
	public int numContactos() {
		return listacontactos.size();
	}
	
	/**
	 * 
	 * @param clave Permite introducir la clave de cifrado
	 * @param tipoC Permite introducir el tipo de cifrado 
	 */
	public void cifrarContactos(int clave, boolean tipoC) {
		// Cifra la lista de contatos con una clave y un tipo de cifrado
		listacontactos=cifrado.cifrarContactos(listacontactos, clave, tipoC);
	}
	
	/**
	 * 
	 * @param clave Permite introducir la clave de cifrado
	 * @param tipoC Permite introducir el tipo de cifrado
	 */
	public void descifrarContactos(int clave, boolean tipoC) {
		// Descifra la lista de contactos con una clave y un tipo de cifrado
		listacontactos=cifrado.descifrarContactos(listacontactos, clave, tipoC);
	}
	
	/**
	 * Pasa la lista de contactos a un archivo binario llamado: "contactos.bin"
	 */
	public void volcarLista() {
		try { 
			// Crea un objeto fichero de escritura con el nombre contactos.bin y lo convierte en 
			// un fichero al que se puede introducir objetos en binario
			FileOutputStream archivo = new FileOutputStream("contactos.bin");
			ObjectOutputStream escritura = new ObjectOutputStream(archivo);
			// Le añade todos los contactos
			for (Contacto contacto : listacontactos) {
				escritura.writeObject(contacto);
				System.out.println("Objeto añadido con exito");
			}
			// Cierra el fichero de escritura
			escritura.close();
		}catch (IOException error) { // Si hay error al escribir lo muestra
			error.printStackTrace(System.out);
		}
	}
	/**
	 * 
	 * @return Una lista de Contactos con los contactos guardados en el fichero contactos.bin
	 * Excepciones que lanza:
	 * @throws ClassNotFoundException Fallo por lectura o escritura en fichero
	 * @throws EOFException Fallo por lectura o escritura en fichero
	 * @throws IOException Fallo por lectura o escritura en fichero
	 */
	public List<Contacto> recuperarLista() throws ClassNotFoundException, EOFException, IOException {
		// Crea una lista nueva para almacenar los contactos guardados
		List<Contacto> contactos = new ArrayList<Contacto>();
		// Crea un contacto para guardar los contactos dentro de la lista
		Contacto contacto = null;
		
		// Busca un archivo de lectura llamado contactos.bin de objetos
		FileInputStream archivo = new FileInputStream("contactos.bin");
		ObjectInputStream lectura = new ObjectInputStream(archivo);
		
		// Intenta leer el primer objeto
		contacto = (Contacto) lectura.readObject();
		
		// si hay objetos lo añade a la lista y busca otro
		while(contacto != null) {
			contactos.add(contacto);
			contacto = (Contacto) lectura.readObject();
		}
		
		// Devuelve la lista
		return contactos;	
	}
	
	/**
	 * 
	 * @param fichero Permite introducir el fichero en el que se va a guardar la lista actual de contactos
	 */
	public void volcarListaATexto(PrintWriter fichero) {
		for (Contacto contacto : listacontactos) {
			fichero.println(contacto.describir());
		}
	}
	
	/**
	 * 
	 * @param listacontactos Permite actualizar la lista de contactos
	 */
	public void setListacontactos(List<Contacto> listacontactos) {
		this.listacontactos = listacontactos;
	}

}
