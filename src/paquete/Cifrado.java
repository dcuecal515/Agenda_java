package paquete;

import java.util.ArrayList;
import java.util.List;

public class Cifrado {
	
	/**
	 * 
	 * @param cadena, Permite ingresar la cadena de texto a cifrar
	 * @param clave, Permite ingresar la clave para cifrar la cadena de texto con los distintos cifrados
	 * @param esXOR Permite ingresar un boolean que si es true es cifrado XOR, false si es cifrado Cesar
	 * @return devuelve la frase cifrada según el tipo de cifrado en forma de String
	 */
	public String cifrar(String cadena, int clave, boolean esXOR) {
		
		/**
		 * Atributo String res, Sirve para guardar la cadena de texto ya cifrada
		 */
		String res = "";
		if(esXOR) {
			
			for (int i = 0; i < cadena.length(); i++) {
				char c = (char)(cadena.charAt(i) ^ clave);
				res += c;
			}
		}
		else {
			/**
			 * Atributo String min, es el abecedario en minuscula
			 */
			String min = "abcdefghijklmnñopqrstuvwxyz";
			/**
			 * Atributo String may, es el abecedario en mayuscula
			 */
			String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			
			for (int i = 0; i < cadena.length(); i++) {
				for (int j = 0; j < min.length(); j++) {
					if(cadena.charAt(i) == min.charAt(j))
						if(j+clave > min.length())
							res += min.charAt((j+clave) % min.length());
						else
							res += min.charAt(j+clave);
				}
				for (int k = 0; k < may.length(); k++) {
					if(cadena.charAt(i) == may.charAt(k))
						if(k+clave > may.length())
							res += may.charAt((k+clave) % may.length());
						else
							res += may.charAt(k+clave);
				}
			}
		}
		return res;
	}
	
	public int cifrar2(int numero, int clave, boolean esXOR) {
		
		/**
		 * Atributo int res, Sirve para guardar los números ya cifrados
		 */
		int res = 0;
		
		int[] digitos = new int[Integer.toString(numero).length()];
		int i = digitos.length -1;
		while(numero > 0) {
			digitos[i]=numero%10;
			numero=numero/10;
			i--;
		}
		if(esXOR) {
			
			for (int j = 0; j < digitos.length; j++) {
				res += (digitos[j] ^ clave);
			}
				
		}
		else {
			
				for (int j = 0; j < digitos.length; j++) {
					res+= ((digitos[j]+clave)%10);
				}
			}
		return res;
	}
	
	public String descifrar(String cadena, int clave, boolean esXOR) {
		
		/**
		 * Atributo String res, Sirve para guardar la cadena de texto ya cifrada
		 */
		String res = "";
		if(esXOR) {
			
			for (int i = 0; i < cadena.length(); i++) {
				char c = (char)(cadena.charAt(i) ^ clave);
				res += c;
			}
		}
		else {
			/**
			 * Atributo String min, es el abecedario en minuscula
			 */
			String min = "abcdefghijklmnñopqrstuvwxyz";
			/**
			 * Atributo String may, es el abecedario en mayuscula
			 */
			String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			
			for (int i = 0; i < cadena.length(); i++) {
				for (int j = 0; j < min.length(); j++) {
					if(cadena.charAt(i) == min.charAt(j))
						if(j-clave < 0)
							res += min.charAt(((j-clave) % min.length())*-1);
						else
							res += min.charAt(j-clave);
				}
				for (int k = 0; k < may.length(); k++) {
					if(cadena.charAt(i) == may.charAt(k))
						if(k-clave < 0)
							res += may.charAt(((k-clave) % may.length())*-1);
						else
							res += may.charAt(k-clave);
				}
			}
		}
		return res;
	}
	
	public int descifrar2(int numero, int clave, boolean esXOR) {
		
		/**
		 * Atributo int res, Sirve para guardar los números ya cifrados
		 */
		int res = 0;
		
		int[] digitos = new int[Integer.toString(numero).length()];
		int i = digitos.length -1;
		while(numero > 0) {
			digitos[i]=numero%10;
			numero=numero/10;
			i--;
		}
		if(esXOR) {
			
			for (int j = 0; j < digitos.length; j++) {
				res += (digitos[j] ^ clave);
			}
				
		}
		else {
			
				for (int j = 0; j < digitos.length; j++) {
					if((digitos[j]-clave)%10 < 0)
						res+= ((digitos[j]-clave)%10*-1);
					else
						res+= ((digitos[j]-clave)%10);
				}
			}
		return res;
	}

	public List<Contacto> cifrarContactos(List<Contacto> contactos, int clave, boolean tipoC){
		String nombre; 
		String apellidos; 
		int anio; 
		int mes; 
		int dia; 
		int telefono; 
		String email; 
		List<Contacto> contactoscifrados = new ArrayList<Contacto>();
		for (Contacto contacto : contactos) {
			nombre = contacto.getNombre();
			nombre=cifrar(nombre, clave, tipoC);
			contacto.setNombre(nombre);
			
			apellidos = contacto.getApellidos();
			apellidos=cifrar(apellidos,clave,tipoC);
			contacto.setApellidos(apellidos);
			
			anio = contacto.getFecha_nac().getYear();
			anio = cifrar2(anio,clave,tipoC);
			
			mes = contacto.getFecha_nac().getMonthValue();
			mes = cifrar2(mes,clave,tipoC);
			if (mes>12)
				mes=12;
			
			dia = contacto.getFecha_nac().getDayOfMonth();
			dia = cifrar2(dia,clave,tipoC);
			if(dia>31)
				dia=31;
			contacto.setFecha_nac(anio, mes, dia);
			
			telefono = contacto.getTelefono();
			telefono = cifrar2(telefono,clave,tipoC);
			contacto.setTelefono(telefono);
			
			email = contacto.getEmail();
			email = cifrar(email,clave,tipoC);
			contacto.setEmail(email);
			
			contactoscifrados.add(contacto);
		}
		
		return contactoscifrados;
	}
	
	public List<Contacto> descifrarContactos(List<Contacto> contactos, int clave, boolean tipoC){
		String nombre; 
		String apellidos; 
		int anio; 
		int mes; 
		int dia; 
		int telefono; 
		String email; 
		List<Contacto> contactosdescifrados = new ArrayList<Contacto>();
		for (Contacto contacto : contactos) {
			nombre = contacto.getNombre();
			nombre=descifrar(nombre, clave, tipoC);
			contacto.setNombre(nombre);
			
			apellidos = contacto.getApellidos();
			apellidos=descifrar(apellidos,clave,tipoC);
			contacto.setApellidos(apellidos);
			
			anio = contacto.getFecha_nac().getYear();
			anio = descifrar2(anio,clave,tipoC);
			
			mes = contacto.getFecha_nac().getMonthValue();
			mes = descifrar2(mes,clave,tipoC);
			
			dia = contacto.getFecha_nac().getDayOfMonth();
			dia = descifrar2(dia,clave,tipoC);
			contacto.setFecha_nac(anio, mes, dia);
			
			telefono = contacto.getTelefono();
			telefono = descifrar2(telefono,clave,tipoC);
			contacto.setTelefono(telefono);
			
			email = contacto.getEmail();
			email = descifrar(email,clave,tipoC);
			contacto.setEmail(email);
			
			contactosdescifrados.add(contacto);
		}
		
		return contactosdescifrados;
	}
	
}