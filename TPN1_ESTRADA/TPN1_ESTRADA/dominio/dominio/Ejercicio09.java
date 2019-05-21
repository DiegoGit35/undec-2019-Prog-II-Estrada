package dominio;


public class Ejercicio09 {
	
	public static int invertirNumero(int n) {
		int inv=0, r;
		do{
			r=n%10;
			n/=10;
			inv=(inv*10)+r;
		}while(n>=10);
		inv=(inv*10)+n;
		return inv;
	}
	
}
