package dominio;


// Metodo 1
//Debes encontrar los tres últimos dígitos antes de la coma decimal para (3 + raíz(5)) elevado a n.
//Por ejemplo, para n = 5, (3 + √5)5 = 3935.73982... La respuesta es 935.
//Para n = 2, (3 + √5)2 = 27.4164079... La respuesta es 027.



//Metodo 2
//Debes encontrar los últimos m dígitos antes de la coma decimal para (3 + raíz(5)) elevado a n.
//Por ejemplo, para n = 5 y m = 3, (3 + √5)5 = 3935.73982... La respuesta es 935.
//Para n = 2 y m = 1, (3 + √5)2 = 27.4164079... La respuesta es 7.

public class Ejercicio08 {
	
	public static long getUltimosTresDigitos(int n) {
		long num;
		num=(long) Math.pow((3+(Math.sqrt(5))), n);
		num=(long) (num%1000);
		return num;
	}
	
	
	public static long getUltimosDigitos(int n, int cantDigitos) {
		long num, d=1;
		num=(long) Math.pow((3+(Math.sqrt(5))), n);
		for (int i = 0; i < cantDigitos; i++) {
			d*=10;
		}
		num=(long) (num%d);
		return num;
	}
	
}
