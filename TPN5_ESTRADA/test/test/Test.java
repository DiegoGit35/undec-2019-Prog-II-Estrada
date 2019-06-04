package test;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {
		//Arrange
		String expectedNombre="Licenciatura en Enologia";
		String expectedAbreviatura="Lic. Enolog.";
		String expectedPlan="128/02";
		//Act
		Carrera c01 = new Carrera(expectedNombre, expectedAbreviatura, expectedPlan);
		String actualNombre=c01.getNombre();
		String actualPlan=c01.getPlan();
		String actualAbreviatura=c01.getAbreviatura();
		
		//Assert
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedPlan, actualPlan);
	}

	@org.junit.jupiter.api.Test
	void test02() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Carrera c02 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "070/08");
		Carrera c03 = new Carrera("Ingenieria en Sistemas", "Ing. Sist.", "071/08");
		//Act
		boolean actual01=c01.equals(c02);
		boolean actual02=c01.equals(c03);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(true, actual02);
	}
	@org.junit.jupiter.api.Test
	void test03() {
		//Arrange
		String expectedNombre="Programacion I";
		String expectedAbreviatura="Prog. I";
		AnioAcademico expectedAnio="AnioAcademico.II";
		//Act
		Materia m01 = new Materia(expectedNombre, expectedAbreviatura, expectedAnio);
		String actualNombre=m01.getNombre();
		String actualAbreviatura=m01.getAbreviatura();
		AnioAcademico actualAnio=m01.getAnio();
		
		//Assert
		assertEquals(expectedNombre, actualNombre);
		assertEquals(expectedAbreviatura, actualAbreviatura);
		assertEquals(expectedAnio, actualAnio);
	}
	@org.junit.jupiter.api.Test
	void test04() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m02 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		String listadMaterias [] = {"Programacion II"};
		//Act
		boolean actual01=c01.addMateria(m01);
		String [] actual02=c01.getMaterias(AnioAcademico.III);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(listadoMaterias, actual02);
	}
	@org.junit.jupiter.api.Test
	void test06() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m02 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		String listadMaterias [] = {"Programacion II"};
		//Act
		boolean actual01=c01.addMateria(m02);
		boolean actual02=c01.addMateria(m02);
		String [] actual03=c01.getMaterias(AnioAcademico.III);
		
		//Assert
		assertEquals(true, actual01);
		assertEquals(false, actual02);
		assertEquals(listadoMaterias, actual03);
	@org.junit.jupiter.api.Test
	void test07() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		Materia m01 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		Materia m02 = new Materia("Sistemas I", "Sist. I", AnioAcademico.I);
		Materia m03 = new Materia("Analisis Matematico II", "An. Mat. II", AnioAcademico.I);
		Materia m04 = new Materia("Sistemas Operativos II", "Sist Ope. II", AnioAcademico.I);
		//Act
		boolean actual01=c01.addMateria(m01);
		boolean actual02=c01.addMateria(m02);
		boolean actual03=c01.addMateria(m03);
		boolean actual04=c01.addMateria(m04);
		//Assert
		assertEquals(true, actual01);
		assertEquals(true, actual02);
		assertEquals(true, actual03);
		assertEquals(false, actual04);
	}
	@org.junit.jupiter.api.Test
	void test09(){
		//Arrange
		Materia m01 = new Materia("Progracacion I", "Prog. I", AnioAcademico.I);
		String anioCalendario= "2019";
		String fechaInicio= "12/12";
		String fechaFin= "12/12";
		Alumno listadoAlumno[]= null
		Implementacion inm01 = new Implementacion(m1, anioCalendario, fechaInicio, FechaFin);
		//Act
		Materia act01 = imp01.getMateria();
		String act02 = imp01.getAnioCalendario();
		String act02 = imp01.getFechaInicio();
		String act03 = imp01.getFechaInicio();
		Alumnos act05 = imp01.getListadoAlumno().Length();
		//Assert
		assertEquals(act01, true);
		assertEquals(act02, false);
		assertEquals(act03, false);
		assertEquals(act04, true);
		assertEquals(act05, true);
		assertEquals(act06, false);
	}
	}
}
