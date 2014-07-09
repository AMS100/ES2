package TestesUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import C.Validador;

@RunWith(JUnit4.class)
public class Validador_Teste_Unit {
	
	Validador validador = new Validador();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Prints.msg("BeforeClass <--> Passei pelo setUpBeforeClass - Antes da classe.");
	}

	@After
	public static void tearDownAfterClass() throws Exception {
		//Prints.msg("AfterClass <--> Passei pelo tearDownAfterClass - Depois da Classe");
	}

	@Before
	public void setUp() throws Exception {
		new Validador();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void validaSenha(){	

		assertTrue("Valida senha: ", validador.validaSenha("123") == true);		
	}

	@Test
	public void validaNome(){	

		assertTrue("Valida nome: ", validador.validaNome("ams") == true);		
	}
	
}
