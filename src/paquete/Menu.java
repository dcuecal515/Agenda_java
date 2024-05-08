package paquete;

public class Menu {
	public void mostrarOpcion(int opcion) {
        switch (opcion) {
            case 0:
                System.out.println("Configuración cifrado");
                break;
            case 1:
                System.out.println("Nuevo contacto");
                break;
            case 2:
                System.out.println("Editar contacto");
                break;
            case 3:
                System.out.println("Consultar contacto");
                break;
            case 4:
                System.out.println("Consultar contacto");
                break;
            case 5:
                System.out.println("Obtener el número de contactos");
                break;
            case 6:
                System.out.println("Generar un listado en pantalla");
                break;
            case 7:
                System.out.println("Generar un listado en fichero");
                break;
            case 8:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
