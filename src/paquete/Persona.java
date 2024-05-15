package paquete;

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
		private String fecha_nac;
		
		/**
		 * 
		 * @param Permite ingresar el nombre de la persona
		 * @param Permite ingresar los apellidos de la persona
		 * @param Permite ingresar la fecha de nacimiento de la persona
		 */
		public Persona(String nombre, String apellidos, String fecha_nac) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_nac = fecha_nac;
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
		public String getFecha_nac() {
			return fecha_nac;
		}
		
		/**
		 * 
		 * @param Permite establecer una nueva fecha de nacimiento para la persona
		 */
		public void setFecha_nac(String fecha_nac) {
			this.fecha_nac = fecha_nac;
		}
		
		
	
}
