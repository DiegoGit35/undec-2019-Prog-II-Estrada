package dominio;

public class Ejercicio10 {
	
	public static int buscarLargoDeMayorSubArrayOrdenado(int [] A) {
		int cont=1, max=0;
		for (int i = 1; i < A.length; i++) {
			if (A[i-1]<A[i]) {
				cont++;
			}
			if(cont>max) {
				max=cont;
			}
			if(A[i-1]>=A[i])
				cont=1;
		}
		System.out.println(max);
		return max;
	}
}