package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTest {

	@Test
	public void testCorectitudineConstructorCuParametru() {
	String nume="Gigel";
	Student student=new Student(nume);
	assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaInConstructor() {
		Student student=new Student("Gigel");
		assertNotEquals(null, student.getNote());
	}
	
	@Test
	public void testCorectitudineConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull("numele nu a fost initializat",student.getNume());
		assertNotNull("lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		int nota=10;
		Student student=new Student();
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
		
	}
	
	@Test
	public void testMetodaAdaugareNoteInLista() {	
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		student.adaugaNota(8);	
		assertEquals(3, student.getNote().size());
	}
	
	@Test
	public void calculeazaMediaCorect() {	
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(9.5f,student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testStudentCuRestanta() {
		Student student=new Student();
		student.adaugaNota(4);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestanta() {
		Student student=new Student();
		student.adaugaNota(7);
		assertFalse(student.areRestante());
	}
	
	//doar asa merge in jnuit3 dar e si modul in care lucreaza junit5+4
	@Test
	public void testGetNotaIndexInvalid() {
		Student student=new Student();
		student.adaugaNota(10);
		//1	
		try {
		//2
		 student.getNota(-1);
		//3-nu se ajunge 
		 fail("Nu trebia sa ajunga aici. Metoda nu arunca exceptie");
		}
		catch(IndexOutOfBoundsException exception)		
		{
		//4
		}
		catch(Exception exception)
		{
		//5-nu se ajunge 	
			 fail("Tipul exceptiei nu este corect!");
		}
		//6
	}
	
	//exception pt junit4
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaIndexInvalidJUnit4() {
		Student student=new Student();
		student.adaugaNota(10);
		student.getNota(-1);
	}
}
