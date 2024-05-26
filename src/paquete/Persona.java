package paquete;

import java.time.LocalDate;

/**
 * Clase en la que se almacenan los datos de las personas del usuario
 */
public class Persona {
		
		/**
		 * Atributo String nombre, Sirve para guardar el nombre de la persona
		 */
		private String nombre;
		/**
		 * Atributo String apellidos, Sirve para guardar los apellidos de la persona
		 */
		private String apellidos;
		/**
		 * Atributo LocalDate fecha_nac, Sirve para guardar la fecha de nacimiento de la persona
		 */
		private LocalDate fecha_nac;
		
		/**
		 * 
		 * @param nombre Es el nombre de la persona
		 * @param apellidos Son los apellidos de la persona
		 * @param anio Es el año de nacimiento de la persona
		 * @param mes Es el mes de nacimiento de la persona
		 * @param dia Es el dia de nacimiento de la persona
		 */
		public Persona(String nombre, String apellidos, int anio, int mes, int dia) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_nac = LocalDate.of(anio, mes, dia);
		}

		/**
		 * 
		 * @return Un String con el nombre de la persona
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * 
		 * @param nombre Permite establecer un nuevo nombre a la persona
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return Un String con los apellidos de la persona
		 */
		public String getApellidos() {
			return apellidos;
		}

		/**
		 * 
		 * @param apellidos Permite establecer unos nuevos apellidos a la persona
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		/**
		 * 
		 * @return Un String con la fecha de nacimiento de la persona
		 */
		public LocalDate getFecha_nac() {
			return fecha_nac;
		}
		
		/**
		 * 
		 * @param anio Permite introducir el año de nacimiento
		 * @param mes Permite introducir el mes de nacimiento
		 * @param dia Permite introducir el dia de nacimiento
		 */
		public void setFecha_nac(int anio, int mes, int dia) {
			this.fecha_nac = LocalDate.of(anio, mes, dia);
		}
		
		
	
}
