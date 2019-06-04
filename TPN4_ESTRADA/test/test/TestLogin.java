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
		void test03ContraseniaNoValida_MinDosLetrasMinuscula() {
		//Arrange
		String passNoValida01="GRsERVBTEWE";
		String passNoValida02="ASDASDASDAS";
		String passNoValida03="RETRVTOCEOG";
		String passNoValida04="WKLIORCCDEE";
		String passNoValida05="EWNFODPSfSE";
		String passNoValida06="DSFWEWFFREG";
		String passNoValida07="FEWFCEWRGTG";
		String passNoValida08="WWRCREWWERHB";
		String passNoValida09="FEWFJWPEFJC";
		
		//Act
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida01);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida02);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida03);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida04);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida05);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida06);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida07);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida08);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida09);

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
		void test04ContraseniaNoValida_MinusculaPermitido() {
		
		//Arrange
		String passValida01="GrsERVBTEWE";
		String passValida02="asDASDASDAS";
		String passValida03="REtrvTOCEOG";
		String passValida04="WKliORCCDEE";
		String passValida05="EWNFODpsfSE";
		String passValida06="DSFWEWffREG";
		String passValida07="FEWFCEwrGTG";
		String passValida08="WWRCREWWErhB";
		String passValida09="FEWFJWPEFjc";
		
		//Act
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida01);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida02);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida03);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida04);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida05);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida06);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida07);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida08);
		boolean actual01 = ValidarContrasenia.MinusculaValido(passValida09);

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
		void test05ContraseniaNoValida_MinDosLetrasMayusc() {
		
		//Arrange
		String passNoValida01="1f651ewcDw";
		String passNoValida02="3545efvsvD";
		String passNoValida03="fdse52sfce";
		String passNoValida04="ds2cef3200";
		String passNoValida05="fsdfew555e";
		String passNoValida06="csecsddsc4";
		String passNoValida07="windsofwinter1";
		String passNoValida08="Songoficeandfire20";
		String passNoValida09="Dewrffseeew";
		
		//Act
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida01);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida02);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida03);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida04);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida05);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida06);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida07);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida08);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passNoValida09);
		
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
		void test06ContraseniaNoValida_MayuscPermitido() {
		//Arrange
		String passValida01="1F651ewcDw";
		String passValida02="3545EFvsvD";
		String passValida03="fdse52SFce";
		String passValida04="dS2cEf3200";
		String passValida05="fSDfew555e";
		String passValida06="cseCsdDsc4";
		String passValida07="WINDsofwinter1";
		String passValida08="SoNGOficeandfire20";
		String passValida09="DewRFFSEeew";	
		//Act
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida01);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida02);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida03);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida04);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida05);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida06);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida07);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida08);
		boolean actual01 = ValidarContrasenia.MayusculaValido(passValida09);
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
		void test07ContraseniaNoValida_MinDosNumero() {
		//Arrange
		String passValida01="GrsERVBTEWE";
		String passValida02="asDASDASDAS";
		String passValida03="REtrvTOCEOG";
		String passValida04="WKliORCCDEE";
		String passValida05="EWNFODpsfSE";
		String passValida06="DSFWEWffREG";
		String passValida07="FEWFCEwrGTG";
		String passValida08="WWRCREWWErhB";
		String passValida09="FEWFJWPEFjc";
		//Act
		boolean actual01 = ValidarContrasenia.LetraValido(passNoValida01);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida02);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida03);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida04);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida05);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida06);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida07);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida08);
		boolean actual01 = ValidarContrasenia.NumeroValido(passNoValida09);
		
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
		void test08ContraseniaNoValida_MinDosNumeroPermitido() {
		//Arrange
		String passValida01="123456ffrgs";
		String passValida02="123456EEwq901";
		String passValida03="123fd6789012";
		String passValida04="123456fd90123";
		String passValida05="123456789FE234";
		String passValida06="1234fe789012345";
		String passValida07="1234as890123456";
		String passValida08="12345Qw8901234567";
		String passValida09="12345ds6789012345678";
		//Act
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida01);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida02);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida03);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida04);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida05);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida06);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida07);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida08);
		boolean actual01 = ValidarContrasenia.NumeroValido(passValida09);
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
	void test09ContraseniaNoValida_MinDosCaracters() {
		//Arrange
		String passValida01="123456ffrgs";
		String passValida02="123456EEwq901";
		String passValida03="123fd6789012";
		String passValida04="123456fd90123";
		String passValida05="123456789FE234";
		String passValida06="1234fe789012345";
		String passValida07="1234as890123456";
		String passValida08="12345Qw8901234567";
		String passValida09="12345ds6789012345678";
		//Act
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida01);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida02);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida03);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida04);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida05);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida06);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida07);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida08);
		boolean actual01 = ValidarContrasenia.CaracteresValido(passNoValida09);
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
		void test10ContraseniaNoValida_MinDosCaracteresPermitido() {
		//Arrange
		String passValida01="1234&&&ffrgs";
		String passValida02="1234#$#$Ewq901";
		String passValida03="12#$%&789012";
		String passValida04="123#$&6fd90123";
		String passValida05="123456789FE234";
		String passValida06="123$$e789012345";
		String passValida07="1234as89017&&456";
		String passValida08="12345Qw8901234#&7";
		String passValida09="12345ds678901234###";
		//Act
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida01);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida02);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida03);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida04);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida05);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida06);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida07);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida08);
		boolean actual01 = ValidarContrasenia.CaracteresValdio(passValida09);
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
	void test11ContraseniaNoValida_CaracteresNoEspecificado() {
		//Arrange
		String passValida01="123456f**gs";
		String passValida02="123456E!!q901";
		String passValida03="123fd67@*9012";
		String passValida04="123456@@90123";
		String passValida05="123456!!9FE234";
		String passValida06="1234fe789^^2345";
		String passValida07="1234as890123*6";
		String passValida08="12345Qw8901234**7";
		String passValida09="12345ds6789012345678";
		//Act
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida01);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida02);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida03);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida04);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida05);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida06);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida07);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida08);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passNoValida09);
		Assert
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
	void test10ContraseniaNoValida_CaracteresNoEspecificadoPermitido() {
		//Arrange
		String passValida01="123456ffrgs";
		String passValida02="123456EEwq901";
		String passValida03="123fd6789012";
		String passValida04="123456fd90123";
		String passValida05="123456789FE234";
		String passValida06="1234fe789012345";
		String passValida07="1234as890123456";
		String passValida08="12345Qw8901234567";
		String passValida09="12345ds6789012345678";
		//Act
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida01);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida02);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida03);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida04);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida05);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida06);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida07);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida08);
		boolean actual01 = ValidarContrasenia.CaracNoEspValido(passValida09);
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
}