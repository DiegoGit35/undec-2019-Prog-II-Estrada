package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Carrera;
import dominio.Materia;
import dominio.anio_academico;

class Test02 {

	@Test
	void test01() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado = "LICENCIATURA EN SISTEMAS";
		//Act
		String actual = c01.getNombreEnMayusculas();
		//AssertassertEquals(nombreEsperado, actual);
		assertEquals(nombreEsperado, actual);
	}
	@Test
	void test02() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "Licenciatura en sistemas";
		Carrera c02 = new Carrera("Abogacia", "Abog.", "071/08");
		String nombreEsperado02 = "Abogacia";
		Carrera c03 = new Carrera("abogacia", "Abog.", "071/08");
		String nombreEsperado03 = "Abogacia";
		Carrera c04 = new Carrera("aBOGACIA", "Abog.", "071/08");
		String nombreEsperado04 = "Abogacia";
		//Act
		String actual01 = c01.getNombreTipoOracion();
		String actual02 = c02.getNombreTipoOracion();
		String actual03 = c03.getNombreTipoOracion();
		String actual04 = c04.getNombreTipoOracion();
		//Assert
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
		assertEquals(nombreEsperado03, actual03);
		assertEquals(nombreEsperado04, actual04);
	}
	@Test
	void test03() {
		//Arrange
		Carrera c01 = new Carrera("Licenciatura en Sistemas", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "LS";
		Carrera c02 = new Carrera("Tecnologias del DESARROLLO  DE aplicaciones Web", "Lic. Sist.", "071/08");
		String nombreEsperado02 = "TDA";
		//Act
		String actual01 = c01.getNombrePrimeraLetra();
		String actual02 = c02.getNombrePrimeraLetra();
		//AssertassertEquals(nombreEsperado, actual);
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
	}
	@Test
	void test3() {
		//Arrange 
		Materia m01= new Materia("Administracion de Empresas", "Ingenieria en Sistemas", anio_academico.I);
		String MateriaEsperada01="IS - AdmDeEmp";
		Materia m02= new Materia("Electronica Digital", "Ingenieria en Sistemas", anio_academico.II);
		String MateriaEsperada02="IS - EleDig";
		Materia m03= new Materia("Sistema Operativo I", "Licenciatura en Sistemas", anio_academico.II);
		String MateriaEsperada03="LS - SisOpeI";
		//Act 
		String actual01 = m01.getNombreMatFormat5();
		String actual02 = m01.getNombreMatFormat5();
		String actual03 = m01.getNombreMatFormat5();
		//Assert
		assertEquals(MateriaEsperada01, actual01);
		assertEquals(MateriaEsperada02, actual02);
		assertEquals(MateriaEsperada03, actual03);
	}
	@Test
	void test5() {
		//Arrange
		Carrera c01 = new Carrera("LS", "Lic. Sist.", "071/08");
		String nombreEsperado01 = "IS"
				+ "IA"
				+ "IM";
		Carrera c02 = new Carrera("Tecnologias del DESARROLLO  DE aplicaciones Web", "Lic. Sist.", "071/08");
		String nombreEsperado02 = "TDA";
		//Act
		String actual01 = c01.getNombrePrimeraLetra();
		String actual02 = c02.getNombrePrimeraLetra();
		//AssertassertEquals(nombreEsperado, actual);
		assertEquals(nombreEsperado01, actual01);
		assertEquals(nombreEsperado02, actual02);
	}
}
