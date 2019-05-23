package dominio;

public class Divisibilidad {
	public int num;
	public static int b=0, c=0, suma1=0, suma2=0;
	public static boolean a=false;
	public static boolean esDivisiblePorDos(int num) {
		num=num%10;
		if(num%2==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorTres(int num) {
		suma1=0;
		if(num<10)
			suma1=num;
		while(num>10) {
			b=num%10;
			num/=10;
			suma1+=b;
		}
		suma1+=num;
		if(suma1%3==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorCuatro(int num) {
		if(num>100)
			num=num%100;
		if(num%4==0 || num==00)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorCinco(int num) {
		if(num>10)
			num%=10;
		if(num==5 || num==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorSeis(int num) {
		if(num%3==0 && num%2==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorSiete(int num) {
		b=0;
		if(num>10) {
			b=num%10;
			b*=2;
			num/=10;
		}
		if(b-num==0 || (b-num)%7==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorOcho(int num) {
		if(num>1000)
			num=num%1000;
		if(num%8==0 || num==000)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorNueve(int num) {
		suma1=0;
		if(num<10)
			suma1=num;
		while(num>10) {
			b=num%10;
			num/=10;
			suma1+=b;
		}
		suma1+=num;
		if(suma1%9==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorDiez(int num) {
		if(num%10==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorOnce(int num) {
		suma1=0;
		suma2=0;
		int o=0;
		if(num<10)
			suma1=num;
		while(num>10) {
			b=num%10;
			num/=10;
			suma1+=b;
			o=1;
			if(num<10)
				break;
			c=num%10;
			num/=10;
			suma2+=c;
			o=0;
		}
		if(o==1)
			suma2+=num;
		else
			suma1+=num;
		if(suma1-suma2==0 || (suma1-suma2)%11==0)
			return true;
		else
			return false;
	}
	
}
