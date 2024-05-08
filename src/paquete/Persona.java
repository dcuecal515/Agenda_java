package paquete;

public class Persona {
	
		private String nombre;
		private String apellidos;
		private String fecha_nac;
		
		public Persona(String nombre, String apellidos, String fecha_nac) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fecha_nac = fecha_nac;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getFecha_nac() {
			return fecha_nac;
		}

		public void setFecha_nac(String fecha_nac) {
			this.fecha_nac = fecha_nac;
		}
		
		
	
}
