package TestesUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import C.ValidadorUsuarios;

@RunWith(JUnit4.class)
public class Validador_Tste_Unit {
	
	private ValidadorUsuarios validadorUsuarios;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Prints.msg("BeforeClass <--> Passei pelo setUpBeforeClass - Antes da classe.");
	}

	@AfterClass //Onde estava o erro @AfterClass e estava @After
	public static void tearDownAfterClass() throws Exception {
		//Prints.msg("AfterClass <--> Passei pelo tearDownAfterClass - Depois da Classe");
	}

	@Before
	public void setUp() throws Exception {
		validadorUsuarios = new ValidadorUsuarios();
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void validaSenha(){
		assertTrue("Valida senha: ", validadorUsuarios.validaSenha("123") == true);		
	}

	@Test
	public void validaNome(){	
		assertTrue("Valida nome: ", validadorUsuarios.validaNome("ams") == true);		
	}
	
}
