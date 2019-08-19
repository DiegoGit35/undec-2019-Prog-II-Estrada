package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import escuela.fecha;

class FechaTests {

	@Test
	void test01() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int diaEsperado = 01;
		//Act
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test02() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int mesEsperado = 01;
		//Act
		int actual = f1.getMes();
		//Assert
		assertEquals(mesEsperado, actual);
	}
	@Test
	void test03() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int anioEsperado = 2000;
		//Act
		int actual = f1.getAnio();
		//Assert
		assertEquals(anioEsperado, actual);
	}
	@Test
	void test04_setDia() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int diaEsperado = 10;
		f1.setDia(10);
		//Act
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test05_setMes() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int mesEsperado = 07;
		f1.setMes(07);
		//Act
		int actual = f1.getMes();
		//Assert
		assertEquals(mesEsperado, actual);
	}
	@Test
	void test06_setAnio() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int anioEsperado = 2019;
		f1.setAnio(2019);
		//Act
		int actual = f1.getAnio();
		//Assert
		assertEquals(anioEsperado, actual);
	}
	@Test
	void test07_addDia() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int diaEsperado = 9;
		//Act
		f1.addFecha(8, 'd');
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test08_addDia() {
		//Arrange
		fecha f1 = new fecha(01,02,2000);
		int diaEsperado = 3;
		//Act
		f1.addFecha(30, 'd');
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test09_addMes() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int mesEsperado = 3;
		//Act
		f1.addFecha(2, 'm');
		int actual = f1.getMes();
		//Assert
		assertEquals(mesEsperado, actual);
	}
	@Test
	void test10_addMes() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int mesEsperado = 4;
		//Act
		f1.addFecha(15, 'm');
		int actual = f1.getMes();
		//Assert
		assertEquals(mesEsperado, actual);
	}
	@Test
	void test11_addAnio() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int anioEsperado = 2019;
		//Act
		f1.addFecha(19, 'y');
		int actual = f1.getAnio();
		//Assert
		assertEquals(anioEsperado, actual);
	}
	@Test
	void test12_addAnio() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int anioEsperado = 1981;
		//Act
		f1.addFecha(-19, 'y');
		int actual = f1.getAnio();
		//Assert
		assertEquals(anioEsperado, actual);
	}
	@Test
	void test13_addWeeks() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int diaEsperado = 8;
		//Act
		f1.addFecha(1, 'w');
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test14_addWeeks() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		int diaEsperado = 12;
		//Act
		f1.addFecha(6, 'w');
		int actual = f1.getDia();
		//Assert
		assertEquals(diaEsperado, actual);
	}
	@Test
	void test15_diffFecha() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(15,01,2000);
		int diffEsperado = 14;
		//Act
		int actual = f1.diffFecha(f2);
		//Assert
		assertEquals(diffEsperado, actual);
	}
	@Test
	void test16_diffFecha() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(28,02,2000);
		int diffEsperado = 59;
		//Act
		int actual = f1.diffFecha(f2);
		//Assert
		assertEquals(diffEsperado, actual);
	}
	@Test
	void test17_diffFecha() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(28,02,2000);
		int diffEsperado = 59;
		//Act
		int actual = f2.diffFecha(f1);
		//Assert
		assertEquals(diffEsperado, actual);
	}
	@Test
	void test18_diffFecha() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(01,01,2001);
		int diffEsperado = 365;
		//Act
		int actual = f2.diffFecha(f1);
		//Assert
		assertEquals(diffEsperado, actual);
	}
	@Test
	void test19_MayorQue() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(01,01,2001);
		boolean esperado = false;
		//Act
		boolean actual = f1.greaterThan(f2);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test19_MayorQue2() {
		//Arrange
		fecha f1 = new fecha(01,01,2000);
		fecha f2 = new fecha(31,12,1999);
		boolean esperado = true;
		//Act
		boolean actual = f1.greaterThan(f2);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test20_MenorQue() {
		//Arrange
		fecha f1 = new fecha(31,12,0);
		fecha f2 = new fecha(01,01,1);
		boolean esperado = true;
		//Act
		boolean actual = f1.lessThan(f2);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test21_MenorQue() {
		//Arrange
		fecha f1 = new fecha(01,01,1);
		fecha f2 = new fecha(31,12,0);
		boolean esperado = true;
		//Act
		boolean actual = f2.lessThan(f1);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test22_EsValida() {
		//Arrange
		fecha f1 = new fecha(01,01,1);
		boolean esperado = true;
		//Act
		boolean actual = f1.esFechaValida(01,01,0000);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test23_EsValida() {
		//Arrange
		fecha f1 = new fecha(01,01,1);
		boolean esperado = false;
		//Act
		boolean actual = f1.esFechaValida(00,01,0000);
		//Assert
		assertEquals(esperado, actual);
	}
	@Test
	void test24_EsValida() {
		//Arrange
		fecha f1 = new fecha(01,01,1);
		boolean esperado = false;
		//Act
		boolean actual = f1.esFechaValida(01,13,0000);
		//Assert
		assertEquals(esperado, actual);
	}

}
