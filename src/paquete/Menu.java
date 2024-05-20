package paquete;

import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Cifrado cifrado = new Cifrado();
	private boolean tipoC;
	private int clave;
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
		System.out.printf("|         Elige una opcion: ");
		int opcion = sc.nextInt();
		return opcion;
	}
	public void mostrarOpcion(int opcion) {
		switch (opcion) {
            case 0:
            	System.out.printf("Introduce un numero: ");
                clave = sc.nextInt();
                String xor;
                do {
                	System.out.printf("Quieres cifrar en XOR o Cesar (X/C)(por defecto xor): ");
                    xor = sc.next();
                    
                    if(xor.toUpperCase() == "X" || xor.toUpperCase() == "C") {
                    	if(xor.toUpperCase() == "C")
                        	tipoC = false;
                        else
                        	tipoC = true;
                    }else 
                    	System.out.println("Ha introducido una letra no valida vuelva a introducir X o C");
				} while (xor.toUpperCase() != "X" && xor.toUpperCase() != "C");
                
                mostrarOpcion(mostrarMenu());
                break;
            case 1:
                System.out.printf("Introduzca el nombre: ");
                String nombre = sc.next();
                System.out.printf("Introduzca los apellidos: ");
                String apellidos = sc.next();
                System.out.printf("Introduzca la fecha de nacimiento: ");
                String fecha_nac = sc.next();
                System.out.printf("Introduzca el telefono: ");
                int telefono = sc.nextInt();
                System.out.printf("Introduzca el email: ");
                String email = sc.next();
                System.out.printf("Introduzca la direccion postal: ");
                String direccion = sc.next();
                contacto = new Contacto(nombre,apellidos,fecha_nac,telefono,email,direccion);
                lista.agregarContacto(contacto);
                mostrarOpcion(mostrarMenu());
                break;
            case 2:
                System.out.println("Editar contacto");
                mostrarOpcion(mostrarMenu());
                break;
            case 3:
                System.out.println("Consultar contacto");
                mostrarOpcion(mostrarMenu());
                break;
            case 4:
                System.out.println("Consultar contacto");
                mostrarOpcion(mostrarMenu());
                break;
            case 5:
                System.out.println("Obtener el número de contactos");
                mostrarOpcion(mostrarMenu());
                break;
            case 6:
                System.out.println("Generar un listado en pantalla");
                mostrarOpcion(mostrarMenu());
                break;
            case 7:
                System.out.println("Generar un listado en fichero");
                mostrarOpcion(mostrarMenu());
                break;
            case 8:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción incorrecta");
                mostrarOpcion(mostrarMenu());
        }
    }
}
