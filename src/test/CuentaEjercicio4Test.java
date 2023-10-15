package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.*;

class CuentaEjercicio4Test {

	static Cuenta ctapruebas1, ctapruebas6;
	static double saldofinal1, saldofinal6;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctapruebas1 = new Cuenta(50);
		ctapruebas6 = new Cuenta(0);
		saldofinal1 = saldofinal6 = 0;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCuenta12345() {
		ctapruebas1.retirar(200);
		ctapruebas1.ingresar(100);
		ctapruebas1.retirar(200);

		saldofinal1 = -250;
		assertEquals(saldofinal1, ctapruebas1.getSaldo());
		
	}

	@Test
	void testCuenta67890() {
		ctapruebas6.retirar(350);
		ctapruebas6.retirar(200);
		ctapruebas6.retirar(150);
		ctapruebas6.ingresar(50);
		ctapruebas6.retirar(100);

		saldofinal6 = -450;
		assertEquals(saldofinal6, ctapruebas6.getSaldo());
	}

}
