package paquete;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Cifrado cifrado = new Cifrado();
	private boolean tipoC=true;
	private int clave=3;
	private Contacto contacto;
	private Lista lista = new Lista();
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
	public void mostrarOpcion(int opcion) {
		String nombre;
		switch (opcion) {
            case 0:
            	System.out.printf("Introduce un numero: ");
                clave = sc.nextInt();
                sc.nextLine();
                String xor;
                do {
                	System.out.println("Quieres cifrar en XOR o Cesar (X/C)(por defecto xor): ");
                    xor = sc.next();
                    sc.nextLine();
                    
                    if(xor.toUpperCase().equalsIgnoreCase("X") || xor.toUpperCase().equalsIgnoreCase("C")) {
                    	if(xor.toUpperCase().equalsIgnoreCase("C")) {
                    		tipoC = false;
                    		System.out.println("A elegido cifrado cesar");
                    	}
                        else {
                        	tipoC = true;
                        	System.out.println("A elegido cifrado xor");
                        }
                        	
                    }else 
                    	System.out.println("Ha introducido una letra no valida vuelva a introducir X o C: ");
				} while (!xor.toUpperCase().equalsIgnoreCase("X") && !xor.toUpperCase().equalsIgnoreCase("C"));
                
                mostrarOpcion(mostrarMenu());
                break;
            case 1:
                
                contacto = lista.pedirDatosContacto();
                lista.agregarContacto(contacto);
                mostrarOpcion(mostrarMenu());
                break;
            case 2:
                System.out.println("Introduce el nombre del contacto a editar: ");
                nombre = sc.next();
                contacto = lista.buscarContacto(nombre);
                if(contacto != null)
                	lista.editarContacto(contacto);
                else
                	System.out.println("No existe contacto con ese nombre");
                mostrarOpcion(mostrarMenu());
                break;
            case 3:
            	System.out.println("Introduce el nombre del contacto a consultar: ");
                nombre = sc.next();
                contacto= lista.buscarContacto(nombre);
                if (contacto!=null)
                	lista.consultarContacto(contacto);
                else
                	System.out.println("No existe contacto con ese nombre");
                mostrarOpcion(mostrarMenu());
                break;
            case 4:
            	System.out.println("Introduce el nombre del contacto a consultar: ");
                nombre = sc.next();
                contacto = lista.buscarContacto(nombre);
                if (contacto!=null)
                	lista.eliminarContacto(contacto);
                else
                	System.out.println("No existe contacto con ese nombre");
                mostrarOpcion(mostrarMenu());
                break;
            case 5:
                lista.numeroContactos();
                mostrarOpcion(mostrarMenu());
                break;
            case 6:
                lista.listarContactos();
                mostrarOpcion(mostrarMenu());
                break;
            case 7:
                System.out.println("Generar un listado en fichero");
                mostrarOpcion(mostrarMenu());
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta");
                mostrarOpcion(mostrarMenu());
        }
    }
	
	
}
