package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	static Cuenta ctapruebas;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctapruebas=new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctapruebas.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		ctapruebas.retirar(50);
		assertEquals(-50, ctapruebas.getSaldo());
	}
	
	@Test
	void testIngresar() {
		ctapruebas.ingresar(3000);
		assertEquals(3000, ctapruebas.getSaldo());
	}
	
	

}
