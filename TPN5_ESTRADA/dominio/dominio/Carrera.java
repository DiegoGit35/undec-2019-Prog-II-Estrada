package dominio;

public class Carrera {
	String nombre, abreviatura, codigo;
	
	public Carrera(String nombre, String abreviatura, String codigo) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.codigo = codigo;
	}

	public String getNombreEnMayusculas() {
		return nombre.toUpperCase();
	}
	public String getNombreTipoOracion() {
		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
	}

	public String getNombrePrimeraLetra() {
		String n="";
		int i;
		String [] palabras= nombre.split(" ");
		for(i=0; i< palabras.length; i++)
			if(palabras[i].length()>3)
				n+=palabras[i].substring(0, 1)+"";
		return n;
	}
}
