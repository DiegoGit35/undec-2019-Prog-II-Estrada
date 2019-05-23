package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Divisibilidad;
class TestDivisibilidad {

	@Test
	void test01DivisiblePorDos_NoValido() {
		//Arrange
		
		//Act
		boolean actual01= Divisibilidad.esDivisiblePorDos(3);
		boolean actual02= Divisibilidad.esDivisiblePorDos(5);
		boolean actual03= Divisibilidad.esDivisiblePorDos(7);
		boolean actual04= Divisibilidad.esDivisiblePorDos(9);
		boolean actual05= Divisibilidad.esDivisiblePorDos(11);
		boolean actual06= Divisibilidad.esDivisiblePorDos(457);
		boolean actual07= Divisibilidad.esDivisiblePorDos(895);
		boolean actual08= Divisibilidad.esDivisiblePorDos(983);
		boolean actual09= Divisibilidad.esDivisiblePorDos(1297);
		
		//Assert
		assertEquals(false, actual01);
		assertEquals(false, actual02);
		assertEquals(false, actual03);
		assertEquals(false, actual04);
		assertEquals(false, actual05);
		assertEquals(false, actual06);
		assertEquals(false, actual07);
		assertEquals(false, actual08);
		assertEquals(false, actual09);
	}
	@Test
	void test02DivisiblePorDosValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorDos(12);
	boolean actual02 = Divisibilidad.esDivisiblePorDos(2);
	boolean actual03 = Divisibilidad.esDivisiblePorDos(4);
	boolean actual04 = Divisibilidad.esDivisiblePorDos(56);
	boolean actual05 = Divisibilidad.esDivisiblePorDos(58);
	boolean actual06 = Divisibilidad.esDivisiblePorDos(22);
	boolean actual07 = Divisibilidad.esDivisiblePorDos(28);
	boolean actual08 = Divisibilidad.esDivisiblePorDos(12);
	boolean actual09 = Divisibilidad.esDivisiblePorDos(50);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}

	@Test
	void test03DivisiblePorTres_NoValido() {
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorTres(2);
	boolean actual02 = Divisibilidad.esDivisiblePorTres(7);
	boolean actual03 = Divisibilidad.esDivisiblePorTres(8);
	boolean actual04 = Divisibilidad.esDivisiblePorTres(17);
	boolean actual05 = Divisibilidad.esDivisiblePorTres(19);
	boolean actual06 = Divisibilidad.esDivisiblePorTres(61);
	boolean actual07 = Divisibilidad.esDivisiblePorTres(100);
	boolean actual08 = Divisibilidad.esDivisiblePorTres(530);
	boolean actual09 = Divisibilidad.esDivisiblePorTres(937);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	
	@Test
	void test04DivisiblePorTres_Valido() {
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorTres(3);
	boolean actual02 = Divisibilidad.esDivisiblePorTres(27);
	boolean actual03 = Divisibilidad.esDivisiblePorTres(333);
	boolean actual04 = Divisibilidad.esDivisiblePorTres(3000);
	boolean actual05 = Divisibilidad.esDivisiblePorTres(243);
	boolean actual06 = Divisibilidad.esDivisiblePorTres(729);
	boolean actual07 = Divisibilidad.esDivisiblePorTres(708);
	boolean actual08 = Divisibilidad.esDivisiblePorTres(699);
	boolean actual09 = Divisibilidad.esDivisiblePorTres(231);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test05DivisiblePorCuatroValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorCuatro(4);
	boolean actual02 = Divisibilidad.esDivisiblePorCuatro(8);
	boolean actual03 = Divisibilidad.esDivisiblePorCuatro(12);
	boolean actual04 = Divisibilidad.esDivisiblePorCuatro(16);
	boolean actual05 = Divisibilidad.esDivisiblePorCuatro(20);
	boolean actual06 = Divisibilidad.esDivisiblePorCuatro(32);
	boolean actual07 = Divisibilidad.esDivisiblePorCuatro(40);
	boolean actual08 = Divisibilidad.esDivisiblePorCuatro(80);
	boolean actual09 = Divisibilidad.esDivisiblePorCuatro(200);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test06DivisiblePorCuatroNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorCuatro(5);
	boolean actual02 = Divisibilidad.esDivisiblePorCuatro(9);
	boolean actual03 = Divisibilidad.esDivisiblePorCuatro(13);
	boolean actual04 = Divisibilidad.esDivisiblePorCuatro(17);
	boolean actual05 = Divisibilidad.esDivisiblePorCuatro(21);
	boolean actual06 = Divisibilidad.esDivisiblePorCuatro(25);
	boolean actual07 = Divisibilidad.esDivisiblePorCuatro(33);
	boolean actual08 = Divisibilidad.esDivisiblePorCuatro(61);
	boolean actual09 = Divisibilidad.esDivisiblePorCuatro(39);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test07DivisiblePorCincoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorCinco(125);
	boolean actual02 = Divisibilidad.esDivisiblePorCinco(135);
	boolean actual03 = Divisibilidad.esDivisiblePorCinco(2345);
	boolean actual04 = Divisibilidad.esDivisiblePorCinco(3120);
	boolean actual05 = Divisibilidad.esDivisiblePorCinco(5325);
	boolean actual06 = Divisibilidad.esDivisiblePorCinco(430);
	boolean actual07 = Divisibilidad.esDivisiblePorCinco(4345);
	boolean actual08 = Divisibilidad.esDivisiblePorCinco(430);
	boolean actual09 = Divisibilidad.esDivisiblePorCinco(4385);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test08DivisiblePorCincoNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorCinco(234);
	boolean actual02 = Divisibilidad.esDivisiblePorCinco(4324);
	boolean actual03 = Divisibilidad.esDivisiblePorCinco(623);
	boolean actual04 = Divisibilidad.esDivisiblePorCinco(421);
	boolean actual05 = Divisibilidad.esDivisiblePorCinco(137);
	boolean actual06 = Divisibilidad.esDivisiblePorCinco(521);
	boolean actual07 = Divisibilidad.esDivisiblePorCinco(342);
	boolean actual08 = Divisibilidad.esDivisiblePorCinco(136);
	boolean actual09 = Divisibilidad.esDivisiblePorCinco(234);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test09DivisiblePorSeisValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorSeis(54);
	boolean actual02 = Divisibilidad.esDivisiblePorSeis(6);
	boolean actual03 = Divisibilidad.esDivisiblePorSeis(12);
	boolean actual04 = Divisibilidad.esDivisiblePorSeis(18);
	boolean actual05 = Divisibilidad.esDivisiblePorSeis(66);
	boolean actual06 = Divisibilidad.esDivisiblePorSeis(300);
	boolean actual07 = Divisibilidad.esDivisiblePorSeis(666);
	boolean actual08 = Divisibilidad.esDivisiblePorSeis(36);
	boolean actual09 = Divisibilidad.esDivisiblePorSeis(150);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test10DivisiblePorSeisNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorSeis(123);
	boolean actual02 = Divisibilidad.esDivisiblePorSeis(125);
	boolean actual03 = Divisibilidad.esDivisiblePorSeis(847);
	boolean actual04 = Divisibilidad.esDivisiblePorSeis(541);
	boolean actual05 = Divisibilidad.esDivisiblePorSeis(321);
	boolean actual06 = Divisibilidad.esDivisiblePorSeis(13);
	boolean actual07 = Divisibilidad.esDivisiblePorSeis(169);
	boolean actual08 = Divisibilidad.esDivisiblePorSeis(125);
	boolean actual09 = Divisibilidad.esDivisiblePorSeis(179);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test11DivisiblePorSieteValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorSiete(7);
	boolean actual02 = Divisibilidad.esDivisiblePorSiete(14);
	boolean actual03 = Divisibilidad.esDivisiblePorSiete(21);
	boolean actual04 = Divisibilidad.esDivisiblePorSiete(28);
	boolean actual05 = Divisibilidad.esDivisiblePorSiete(35);
	boolean actual06 = Divisibilidad.esDivisiblePorSiete(42);
	boolean actual07 = Divisibilidad.esDivisiblePorSiete(49);
	boolean actual08 = Divisibilidad.esDivisiblePorSiete(56);
	boolean actual09 = Divisibilidad.esDivisiblePorSiete(63);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test12DivisiblePorSieteNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorSiete(8);
	boolean actual02 = Divisibilidad.esDivisiblePorSiete(16);
	boolean actual03 = Divisibilidad.esDivisiblePorSiete(24);
	boolean actual04 = Divisibilidad.esDivisiblePorSiete(22);
	boolean actual05 = Divisibilidad.esDivisiblePorSiete(36);
	boolean actual06 = Divisibilidad.esDivisiblePorSiete(41);
	boolean actual07 = Divisibilidad.esDivisiblePorSiete(43);
	boolean actual08 = Divisibilidad.esDivisiblePorSiete(59);
	boolean actual09 = Divisibilidad.esDivisiblePorSiete(62);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test13DivisiblePorOchoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorOcho(8);
	boolean actual02 = Divisibilidad.esDivisiblePorOcho(16);
	boolean actual03 = Divisibilidad.esDivisiblePorOcho(24);
	boolean actual04 = Divisibilidad.esDivisiblePorOcho(32);
	boolean actual05 = Divisibilidad.esDivisiblePorOcho(40);
	boolean actual06 = Divisibilidad.esDivisiblePorOcho(48);
	boolean actual07 = Divisibilidad.esDivisiblePorOcho(56);
	boolean actual08 = Divisibilidad.esDivisiblePorOcho(64);
	boolean actual09 = Divisibilidad.esDivisiblePorOcho(72);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test14DivisiblePorOchoNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorOcho(3);
	boolean actual02 = Divisibilidad.esDivisiblePorOcho(2);
	boolean actual03 = Divisibilidad.esDivisiblePorOcho(65);
	boolean actual04 = Divisibilidad.esDivisiblePorOcho(461);
	boolean actual05 = Divisibilidad.esDivisiblePorOcho(167);
	boolean actual06 = Divisibilidad.esDivisiblePorOcho(23);
	boolean actual07 = Divisibilidad.esDivisiblePorOcho(85);
	boolean actual08 = Divisibilidad.esDivisiblePorOcho(589);
	boolean actual09 = Divisibilidad.esDivisiblePorOcho(35);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test15DivisiblePorNueveValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorNueve(9);
	boolean actual02 = Divisibilidad.esDivisiblePorNueve(18);
	boolean actual03 = Divisibilidad.esDivisiblePorNueve(27);
	boolean actual04 = Divisibilidad.esDivisiblePorNueve(36);
	boolean actual05 = Divisibilidad.esDivisiblePorNueve(45);
	boolean actual06 = Divisibilidad.esDivisiblePorNueve(54);
	boolean actual07 = Divisibilidad.esDivisiblePorNueve(63);
	boolean actual08 = Divisibilidad.esDivisiblePorNueve(72);
	boolean actual09 = Divisibilidad.esDivisiblePorNueve(81);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test16DivisiblePorNueveNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorNueve(10);
	boolean actual02 = Divisibilidad.esDivisiblePorNueve(19);
	boolean actual03 = Divisibilidad.esDivisiblePorNueve(28);
	boolean actual04 = Divisibilidad.esDivisiblePorNueve(37);
	boolean actual05 = Divisibilidad.esDivisiblePorNueve(46);
	boolean actual06 = Divisibilidad.esDivisiblePorNueve(55);
	boolean actual07 = Divisibilidad.esDivisiblePorNueve(64);
	boolean actual08 = Divisibilidad.esDivisiblePorNueve(73);
	boolean actual09 = Divisibilidad.esDivisiblePorNueve(82);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test15DivisiblePorDiezValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorDiez(10);
	boolean actual02 = Divisibilidad.esDivisiblePorDiez(20);
	boolean actual03 = Divisibilidad.esDivisiblePorDiez(30);
	boolean actual04 = Divisibilidad.esDivisiblePorDiez(40);
	boolean actual05 = Divisibilidad.esDivisiblePorDiez(50);
	boolean actual06 = Divisibilidad.esDivisiblePorDiez(60);
	boolean actual07 = Divisibilidad.esDivisiblePorDiez(70);
	boolean actual08 = Divisibilidad.esDivisiblePorDiez(80);
	boolean actual09 = Divisibilidad.esDivisiblePorDiez(90);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test16DivisiblePorDiezNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorDiez(11);
	boolean actual02 = Divisibilidad.esDivisiblePorDiez(21);
	boolean actual03 = Divisibilidad.esDivisiblePorDiez(31);
	boolean actual04 = Divisibilidad.esDivisiblePorDiez(41);
	boolean actual05 = Divisibilidad.esDivisiblePorDiez(51);
	boolean actual06 = Divisibilidad.esDivisiblePorDiez(61);
	boolean actual07 = Divisibilidad.esDivisiblePorDiez(71);
	boolean actual08 = Divisibilidad.esDivisiblePorDiez(81);
	boolean actual09 = Divisibilidad.esDivisiblePorDiez(91);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
	@Test
	void test15DivisiblePorOnceValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorOnce(11);
	boolean actual02 = Divisibilidad.esDivisiblePorOnce(22);
	boolean actual03 = Divisibilidad.esDivisiblePorOnce(33);
	boolean actual04 = Divisibilidad.esDivisiblePorOnce(44);
	boolean actual05 = Divisibilidad.esDivisiblePorOnce(55);
	boolean actual06 = Divisibilidad.esDivisiblePorOnce(66);
	boolean actual07 = Divisibilidad.esDivisiblePorOnce(77);
	boolean actual08 = Divisibilidad.esDivisiblePorOnce(88);
	boolean actual09 = Divisibilidad.esDivisiblePorOnce(99);
	//Assert
	assertEquals(true, actual01);
	assertEquals(true, actual02);
	assertEquals(true, actual03);
	assertEquals(true, actual04);
	assertEquals(true, actual05);
	assertEquals(true, actual06);
	assertEquals(true, actual07);
	assertEquals(true, actual08);
	assertEquals(true, actual09);
	}
	@Test
	void test16DivisiblePorOnceNoValido(){
	//Arrange
	//Act
	boolean actual01 = Divisibilidad.esDivisiblePorOnce(10);
	boolean actual02 = Divisibilidad.esDivisiblePorOnce(21);
	boolean actual03 = Divisibilidad.esDivisiblePorOnce(32);
	boolean actual04 = Divisibilidad.esDivisiblePorOnce(43);
	boolean actual05 = Divisibilidad.esDivisiblePorOnce(54);
	boolean actual06 = Divisibilidad.esDivisiblePorOnce(65);
	boolean actual07 = Divisibilidad.esDivisiblePorOnce(76);
	boolean actual08 = Divisibilidad.esDivisiblePorOnce(87);
	boolean actual09 = Divisibilidad.esDivisiblePorOnce(98);
	//Assert
	assertEquals(false, actual01);
	assertEquals(false, actual02);
	assertEquals(false, actual03);
	assertEquals(false, actual04);
	assertEquals(false, actual05);
	assertEquals(false, actual06);
	assertEquals(false, actual07);
	assertEquals(false, actual08);
	assertEquals(false, actual09);
	}
}
