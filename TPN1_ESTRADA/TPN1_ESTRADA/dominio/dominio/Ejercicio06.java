package dominio;

import org.junit.jupiter.api.Test;

public class Ejercicio06 {
	
	public static String imprimirRectagulo(int base, int altura, char caracter) {
		String a="";
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				a=a+caracter;
			}
			if(i==altura-1)
				break;
			a=a+"\n";
		}
		return a;
	}
	
	public static String imprimirMatriz(int filas, int columnas, int base) {
		String b="";
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				b=b+base;
				base++;
				if(j==columnas-1)
					break;
				b=b+"\t";
			}
			if(i==filas-1)
				break;
			b=b+"\n";
		}
		return b;
	}
	
	
}


