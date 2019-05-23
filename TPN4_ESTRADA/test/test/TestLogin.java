package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test
	void test01ContraseniaNoValida_LargoMenorAlMinimo(){
		//Arrange
		String passNoValida01="123456789";
		String passNoValida02="12345678";
		String passNoValida03="1234567";
		String passNoValida04="123456";
		String passNoValida05="12345";
		String passNoValida06="1234";
		String passNoValida07="123";
		String passNoValida08="12";
		String passNoValida09="1";
		String passNoValida10="";
		String passNoValida11=null;
		
		//Act
		boolean actual01 = ValidarContrasenia.esLargoValido(passNoValida01);
		boolean actual02 = ValidarContrasenia.esLargoValido(passNoValida02);
		boolean actual03 = ValidarContrasenia.esLargoValido(passNoValida03);
		boolean actual04 = ValidarContrasenia.esLargoValido(passNoValida04);
		boolean actual05 = ValidarContrasenia.esLargoValido(passNoValida05);
		boolean actual06 = ValidarContrasenia.esLargoValido(passNoValida06);
		boolean actual07 = ValidarContrasenia.esLargoValido(passNoValida07);
		boolean actual08 = ValidarContrasenia.esLargoValido(passNoValida08);
		boolean actual09 = ValidarContrasenia.esLargoValido(passNoValida09);
		boolean actual10 = ValidarContrasenia.esLargoValido(passNoValida10);
		boolean actual11 = ValidarContrasenia.esLargoValido(passNoValida11);
		
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
		assertEquals(false, actual10);
		assertEquals(false, actual11);
	}
	@Test
		void test02ContraseniaNoValida_LargoPermitido() {
		//Arrange
		String passValida01="1234567890";
		String passValida02="12345678901";
		String passValida03="123456789012";
		String passValida04="1234567890123";
		String passValida05="12345678901234";
		String passValida06="123456789012345";
		String passValida07="1234567890123456";
		String passValida08="12345678901234567";
		String passValida09="123456789012345678";
		//Act
		boolean actual01 = ValidarContrasenia.esLargoValido(passValida01);
		boolean actual02 = ValidarContrasenia.esLargoValido(passValida02);
		boolean actual03 = ValidarContrasenia.esLargoValido(passValida03);
		boolean actual04 = ValidarContrasenia.esLargoValido(passValida04);
		boolean actual05 = ValidarContrasenia.esLargoValido(passValida05);
		boolean actual06 = ValidarContrasenia.esLargoValido(passValida06);
		boolean actual07 = ValidarContrasenia.esLargoValido(passValida07);
		boolean actual08 = ValidarContrasenia.esLargoValido(passValida08);
		boolean actual09 = ValidarContrasenia.esLargoValido(passValida09);
		
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
	void test03ContraseniaValida() {
	//Arrange
		String passValida01="1fh6DR#a&";
		String passValida02="jkh&%2AJF3";
		String passValida03="984uK$SJFWR%";
		String passValida04="24KLMd%sj$";
		String passValida05="pḱ42$SD5%SGd";
		String passValida06="ñlm3$DSF$5%";
		String passValida07="G4%dHT5%$ddS";
		String passValida08="FE3dGR4%&da";
		String passValida09="FE#$df3532DSs";
		String passValida10="12erER%&1fg";
	//Act
		boolean actual1 = ValidarContrasenia.esValida(passValida1);
		boolean actual2 = ValidarContrasenia.esValida(passValida2);
		boolean actual3 = ValidarContrasenia.esValida(passValida3);
		boolean actual4 = ValidarContrasenia.esValida(passValida4);
		boolean actual5 = ValidarContrasenia.esValida(passValida5);
		boolean actual6 = ValidarContrasenia.esValida(passValida6);
		boolean actual7 = ValidarContrasenia.esValida(passValida7);
		boolean actual8 = ValidarContrasenia.esValida(passValida8);
		boolean actual9 = ValidarContrasenia.esValida(passValida9);
		boolean actual10 = ValidarContrasenia.esValida(passValida10);

	//Assert
		assertEquals(true, actual1);
		assertEquals(true, actual2);
		assertEquals(true, actual3);
		assertEquals(true, actual4);
		assertEquals(true, actual5);
		assertEquals(true, actual6);
		assertEquals(true, actual7);
		assertEquals(true, actual8);
		assertEquals(true, actual9);
		assertEquals(true, actual10);
	}
}
