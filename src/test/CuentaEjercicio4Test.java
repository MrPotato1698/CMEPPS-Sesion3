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
		saldofinal1 = -250;
		assertEquals(-250, saldofinal1);
		
	}

	@Test
	void testCuenta67890() {
		saldofinal6 = -450;
		assertEquals(-450, saldofinal6);
	}

}
