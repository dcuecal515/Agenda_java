package paquete;

import java.time.LocalDate;

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
		 * Atributo String fecha_nac, Sirve para guardar la fecha de nacimiento de la persona
		 */
		private LocalDate fecha_nac;
		
		/**
		 * 
		 * @param nombre Permite ingresar el nombre de la persona
		 * @param apellidos Permite ingresar los apellidos de la persona
		 * @param fecha_nac Permite ingresar la fecha de nacimiento de la persona
		 */
		public Persona(String nombre, String apellidos, int anio, int mes, int dia) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_nac = LocalDate.of(anio, mes, dia);
		}

		/**
		 * 
		 * @return devuelve un String con el nombre de la persona
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * 
		 * @param Permite establecer un nuevo nombre a la persona
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return devuelve un String con los apellidos de la persona
		 */
		public String getApellidos() {
			return apellidos;
		}

		/**
		 * 
		 * @param Permite establecer unos nuevos apellidos a la persona
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		/**
		 * 
		 * @return devuelve un String con la fecha de nacimiento de la persona
		 */
		public LocalDate getFecha_nac() {
			return fecha_nac;
		}
		
		/**
		 * 
		 * @param Permite introducir el año de nacimiento
		 * @param Permite introducir el mes de nacimiento
		 * @param Permite introducir el dia de nacimiento
		 */
		public void setFecha_nac(int anio, int mes, int dia) {
			this.fecha_nac = LocalDate.of(anio, mes, dia);
		}
		
		
	
}
