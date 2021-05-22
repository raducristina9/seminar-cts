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
		assertEquals(1, student.getNote().size());
	}
	
}
