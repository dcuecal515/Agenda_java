package paquete;

import java.io.*;
import java.util.Scanner;

/**
 * Clase que gestiona el menu de opciones que puede realizar el usuario
 */
public class Menu {
	/**
	 * Atributo de Tipo Scanner, sirve para escanear los textos introducidos por el usuario
	 */
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * Atributo de Tipo boolean, sirve para guardar el tipo de cifrado (true: xor, false: cesar)
	 */
	private boolean tipoC = true;
	
	/**
	 * Atributo de Tipo int, sirve para guardar la clave del cifrado
	 */
	private int clave=3;
	
	/**
	 * Atributo de Tipo Contacto, sirve para utilizar la clase contacto
	 */
	private Contacto contacto;
	
	/**
	 * Atributo de Tipo Lista, sirve para utilizar la clase lista;
	 */
	private Lista lista = new Lista();
	
	/**
	 * 
	 * @return La opcion elegida del menu
	 */
	public int mostrarMenu() {
		System.out.println("|--------------------------------------------|");
		System.out.println("|         0. Configuración cifrado           |");
		System.out.println("|         1. Nuevo contacto                  |");
		System.out.println("|         2. Editar datos de contacto        |");
		System.out.println("|         3. Consultar contacto              |");
		System.out.println("|         4. Eliminar contacto               |");
		System.out.println("|         5. Obtener número de contactos     |");
		System.out.println("|         6. Generar listar en pantalla      |");
		System.out.println("|         7. Generar listado en fichero      |");
		System.out.println("|         8. Salir                           |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|         Elige una opcion:                  |");
		int opcion = sc.nextInt();
		return opcion;
	}
	
	/**
	 * 
	 * @param opcion Permite introducir la opcion elegida en el menu del metodo anterior
	 * @throws ClassNotFoundException Fallo por lectura o escritura en fichero
	 * @throws EOFException Fallo por lectura o escritura en fichero
	 * @throws IOException Fallo por lectura o escritura en fichero
	 */
	public void mostrarOpcion(int opcion) throws ClassNotFoundException, EOFException, IOException {
		/**
		 * Atributo de tipo String, sirve para guardar el nombre del contacto
		 */
		String nombre;
		
		// Compara la opcion con las del case
		switch (opcion) {
            case 0:
            	// Opcion para configurar cifrado
            	
            	// Pide la clave del cifrado y la almacena en un int
            	System.out.printf("Introduce un numero: ");
                clave = sc.nextInt();
                
                // Limpia el buffer de teclado
                sc.nextLine();
                
                // Crea una variable para guardar la opcion de cifrado
                String xor;
                
                // Pide la opcion de cifrado hasta que introduzca una de las dos
                do {
                	System.out.println("Quieres cifrar en XOR o Cesar (X/C)(por defecto xor): ");
                    xor = sc.next();
                    sc.nextLine();
                    
                    // compara el String introducido con las letras x y c
                    if(xor.equalsIgnoreCase("X") || xor.equalsIgnoreCase("C")) {
                    	if(xor.equalsIgnoreCase("C")) {
                    		tipoC = false;
                    		System.out.println("A elegido cifrado cesar");
                    	}
                        else {
                        	tipoC = true;
                        	System.out.println("A elegido cifrado xor");
                        }
                        	
                    }else // Si no introduce una letra valida muestra este mensaje
                    	System.out.println("Ha introducido una letra no valida vuelva a introducir X o C: ");
				} while (!xor.equalsIgnoreCase("X") && !xor.equalsIgnoreCase("C"));
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 1:
                // Opcion para agregar nuevo contacto
            	
            	// pide los datos del contacto en la clase lista y almacena el contacto creado en el atributo contacto
                contacto = lista.pedirDatosContacto();
                
                // agrega el contacto creado a la lista
                lista.agregarContacto(contacto);
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 2:
            	// Opcion editar contacto
            	
            	// Pide el nombre del contacto para buscarlo
                System.out.println("Introduce el nombre del contacto a editar: ");
                nombre = sc.next();
                
                // Guarda el contacto si lo encuentra en la clase Lista
                contacto = lista.buscarContacto(nombre);
                // Si existe lo puede editar
                if(contacto != null)
                	lista.editarContacto(contacto);
                else // Sino no lo puede editar
                	System.out.println("No existe contacto con ese nombre");
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 3:
            	// Opcion consultar contacto
            	
            	// Pide el nombre del contacto para buscarlo
            	System.out.println("Introduce el nombre del contacto a consultar: ");
                nombre = sc.next();
                
                // Guarda el contacto si lo encuentra en la clase Lista
                contacto= lista.buscarContacto(nombre);
                
                // Si el contacto existe le hace la consulta
                if (contacto!=null)
                	lista.consultarContacto(contacto);
                else // Sino no lo puede consultar
                	System.out.println("No existe contacto con ese nombre");
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 4:
            	// Opcion eliminar contacto
            	
            	// Pide el nombre del contacto para buscarlo
            	System.out.println("Introduce el nombre del contacto a eliminar: ");
                nombre = sc.next();
                
                // Guarda el contacto si lo encuentra en la clase Lista
                contacto = lista.buscarContacto(nombre);
                
                // Si el contacto existe lo elimina
                if (contacto!=null)
                	lista.eliminarContacto(contacto);
                else // Sino no lo elimina
                	System.out.println("No existe contacto con ese nombre");
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 5:
            	// Opcion numero de contactos
            	
            	// Te muestra el numero de contactos
                lista.numeroContactos();
                
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 6:
            	// Opcion generar lista en pantalla
            	
            	// Si hay al menos un contacto muestra una lista con los contactos
            	if(lista.numContactos() != 0)
            		lista.listarContactos();
            	else
            		System.out.println("No hay contactos en la lista");
            	
            	// Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 7:
            	// Opcion generar listado en fichero
            	
            	// Pide el nombre del fichero donde guardará la lista de contactos
            	System.out.println("Introduce el fichero en el que introduciras los contactos: ");
            	String nomfichero = sc.next();
            	
            	// Crea el escritor del fichero y lo inicializa en null
            	PrintWriter fichero = null;
            	
            	try { // Inicializa el escritor de fichero para que escriba en el archivo con el nombre introducido por el usuario
            		fichero = new PrintWriter(new FileWriter(nomfichero));
            		
            		// Guarda la lista en el fichero de texto
            		lista.volcarListaATexto(fichero);
            	}catch(IOException e) { // Si hay error lo imprime
            		System.err.println(e.toString());
            	}
            	finally { // Si no esta el fichero vacio lo cierra
            		if(fichero != null)
            			fichero.close();
            	}
            	
                // Vuelve a mostrar el menu y pedir opcion
                mostrarOpcion(mostrarMenu());
                break;
            case 8:
            	// Opcion salir
            	
                System.out.println("Saliendo...");
                break;
            default:
            	// Opcion invalida
            	
            	// Te vuelve a mostrar el menu y pedir opcion
                System.out.println("Opción incorrecta");
                mostrarOpcion(mostrarMenu());
        }
		
		if(lista.numContactos() != 0) { // Guardamos la lista 
			lista.volcarLista();
		}
    }
	/*public void listaGuardada() throws ClassNotFoundException, EOFException, IOException {
		if(lista.recuperarLista() != null)
			lista.setListacontactos(lista.recuperarLista());
	}*/ // Intento de guardar lista anterior
	
	
}
