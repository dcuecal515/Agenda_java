package paquete;

public class Cifrado {
	
	
	/**
	 * 
	 * @param cadena Frase a cifrar
	 * @param clave Clave necesaria para cifrar
	 * @param esXOR true es cifrado XOR, false es cifrado Cesar
	 * @return devuelve la frase cifrada según el tipo de cifrado
	 */
	public static String cifrar(String cadena, int clave, boolean esXOR) {
		
		String res = "";
		if(esXOR) {
			
			for (int i = 0; i < cadena.length(); i++) {
				char c = (char)(cadena.charAt(i) ^ clave);
				res += c;
			}
		}
		else {
			String min = "abcdefghijklmnñopqrstuvwxyz";
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
	
	
	
	
	
}

