package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import suite.categorii.TestePromovabilitateCategory;
import suite.categorii.TesteUrgenteCategory;

public class TesteConstructorGrupa {

	@Test
	public void testRight() {
		Grupa grupa=new Grupa (1085);
		assertEquals(1085, grupa.getNrGrupa());
	}
	
	@Test
	@Category(TesteUrgenteCategory.class)
	public void testBounderyLimitaInferioara() {
		Grupa grupa=new Grupa (1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category(TesteUrgenteCategory.class)
	public void testBounderyLimitaSuperioara() {
		Grupa grupa=new Grupa (1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testErrorLimitaInferioara() {
		Grupa grupa=new Grupa (700);
	
	}
	@Test(expected = IllegalArgumentException.class)
	public void testErrorLimitaSuperioara() {
		Grupa grupa=new Grupa (2000);
	
	}
	
	@Test(timeout = 500)
	@Category(TesteUrgenteCategory.class)
	public void testPerformanta() {
		Grupa grupa=new Grupa (1085);
	}
	
	@Test
	public void testExistance() {
		Grupa grupa=new Grupa(1085);	
		assertNotNull(grupa.getStudenti());
	}
	
	
}
