package escuela;

public class fecha {
	int dia, mes, anio;
	
	public fecha() {
		super();
	}

	public fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setDia(int i) {
		this.dia=i;
	}

	public void setMes(int i) {
		this.mes=i;
	}

	public void setAnio(int i) {
		this.anio=i;
	}

	public void addFecha(int i, char letra) {
		switch(letra) {
			case 'd':
			{
				this.dia+=i;
				corroborarFecha();
				break;
			}
			case 'm':
			{
				this.mes+=i;
				corroborarFecha();
				break;
			}
			case 'y':
			{
				this.anio+=i;
				break;
			}
			case 'w':
			{
				this.dia+=i*7;
				corroborarFecha();
				break;
			}
		}
	}

	private void corroborarFecha() 
	{
		int [] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(this.mes > meses.length)
		{
			this.anio+=this.mes/12;
			this.mes=this.mes%12;
		}
		if (this.dia > meses[this.mes-1])
		{
			this.anio+=this.dia/365;
			this.dia=this.dia%365;
			for (int i = this.mes-1; i < meses.length; i++) 
			{
				if(this.dia>meses[i])
				{
					this.mes++;
					this.dia-=meses[i];
				}
			}
		}
	}

	public int diffFecha(fecha f2) {
		return 0;
	}

	public boolean greaterThan(fecha f2) {
		if(this.anio < f2.anio)
			return false;
		if(this.anio > f2.anio)
			return true;
		else
		{
			if(this.mes < f2.mes)
				return false;
			if(this.mes > f2.mes)
				return true;
			else
			{
				if(this.dia < f2.dia)
					return false;
				else
					return true;
			}
		}
	}

	public boolean lessThan(fecha f2) {
		return (!greaterThan(f2));
	}
	public boolean esFechaValida(int d, int m, int a) {
		int [] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(d <= 0 || m <= 0 || m>12)
			return false;
		if(d > meses[m-1])
			return false;
		else
			return true;
	}
}
