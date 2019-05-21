package dominio;

public class Ejercicio01 {
	static int r;
	public static int mcd(int a, int b) {
		int aux;
		if(a<b) {
			aux=b;
			b=a;
			a=aux;
		}
		while(b>0) {
			r=a%b;
			a=b;
			b=r;
		}
		return (a);
	}
	
	public static int mcm(int a, int b) {
		int x,y,aux;
		if(a<b) {
			aux=b;
			b=a;
			a=aux;
		}
		x=a;
		y=b;
		while(b>0) {
			r=a%b;
			a=b;
			b=r;
		}
		return (x/a)*y;
	}
	
	
}
