package utiles;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		if(hora>23 || hora<0)
			hora=0;
		this.hora=hora;
		if(minuto>59 || minuto<0)
			minuto=0;
		this.minuto=minuto;
		if(segundo>59 || segundo<0)
			segundo=0;
		this.segundo=segundo;
	}
	public int getHora() {
		return this.hora;
	}
	public int getMinuto() {
		return this.minuto;
	}
	public int getSegundo() {
		return this.segundo;
	}
	public Hora() {
		super();
	}
	public String getHoraConFormato() {
		return Utiles.LPAD(this.hora, 2)+":"+Utiles.LPAD(this.minuto, 2)+":"+Utiles.LPAD(this.segundo, 2);
	}
	public String setHora(int hora) {
		this.hora=hora;
		return getHoraConFormato();
	}
	public String setMinuto(int minuto) {
		this.minuto=minuto;
		return getHoraConFormato();
	}
	public String setSegundo(int segundo) {
		this.segundo=segundo;
		return getHoraConFormato();
	}
	public String addHora(int hora) {
		int a=0;
		this.hora+= hora;  
		a=this.hora/24;
		while(this.hora>23) {
			this.hora-=24*a;
		}
		while(this.hora<0)
			this.hora=24+(this.hora%24);
		if(this.hora==24)
			this.hora=00;
		return getHoraConFormato();
	}
	public String addMinuto(int minuto) {
		int c=0, a = 1;
		this.minuto+= minuto; 
		a=this.minuto/60;
		while(this.minuto>59) {
			this.minuto=this.minuto%60;
			c=1;
		}
		if(this.minuto<0) {
			this.minuto=60+(this.minuto%60);
			c=-1;
		}
		if(c==1)
			addHora(a);
		if(c==-1)
			addHora(a-1);
		return getHoraConFormato();
	}
	public String addSegundo(int segundo) {
		int c=0, a = 0;
		this.segundo+= segundo;  
		a=this.segundo/60;
		while(this.segundo>59) {
			this.segundo=this.segundo%60;
			c=1;
		}
		if(this.segundo<0) {
			this.segundo=60+(this.segundo%60);
			c=-1;
		}
		if(c==1)
			addMinuto(a);
		if(c==-1)
			addMinuto(a-1);
		return getHoraConFormato();
	}
}
