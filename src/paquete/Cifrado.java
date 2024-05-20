package paquete;

public class Cifrado {
	
	/**
	 * 
	 * @param cadena, Permite ingresar la cadena de texto a cifrar
	 * @param clave, Permite ingresar la clave para cifrar la cadena de texto con los distintos cifrados
	 * @param esXOR Permite ingresar un boolean que si es true es cifrado XOR, false si es cifrado Cesar
	 * @return devuelve la frase cifrada según el tipo de cifrado en forma de String
	 */
	public static String cifrar(String cadena, int clave, boolean esXOR) {
		
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
	
public static int cifrar2(int numero, int clave, boolean esXOR) {
		
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
	
}