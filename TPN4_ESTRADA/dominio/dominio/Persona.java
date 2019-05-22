package dominio;

public class Persona {
	
	public String apellido;
	public String nombre;
	public String dni;
	
	public Persona() {
		this.apellido="";
		this.nombre="";
		this.dni="";
	}
	public Persona(String apellido, String nombre, String dni) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.dni=dni;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellido;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}

	public String getDniConFormato() {
		
		return "D.N.I.: "+this.dni;
	}

	public String getApellidoYNombreConFormato() {
		
		return this.apellido+", "+this.nombre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
