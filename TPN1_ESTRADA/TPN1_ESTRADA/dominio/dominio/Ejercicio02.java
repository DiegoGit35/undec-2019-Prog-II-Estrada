package dominio;

public class Ejercicio02 {
	public static boolean esPrimo(int n) {
		int cont=0;
		boolean r=true;
		for (int i = 1; i <= n; i++) {
			r=true;
			if(n%i==0) {
				cont++;
			}
			if (cont>2) {
				r=false;
				break;
			}
		}
		return r;
	}
	
	public static int primosEntre(int limInf, int limSup) {
		int cont=0, cont2=0;
		for (int i = limInf; i <= limSup; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%j==0) {
					cont++;
				}
			}
			if(cont==2) {
				cont2++;
			}
			cont=0;
		}
		return cont2;
	}
	
}
