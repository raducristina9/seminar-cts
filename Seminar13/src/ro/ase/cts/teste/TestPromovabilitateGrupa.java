package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mockuri.StudentDummy;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TestPromovabilitateGrupa {
	
	private Grupa grupa;
	
	@Before
	public void setUp() {
		grupa=new Grupa(1085);
		  for( int i=0;i<35;i++){
	            IStudent student= new Student();
	            student.adaugaNota(10);
	            student.adaugaNota(7);
	            grupa.adaugaStudent(student);
	        }
	}

	@Test
	public void testRight() {
	Grupa grupa=new Grupa(1085);
	//restantieri
	for(int i=0;i<3;i++) {
			IStudent student=new Student();
			student.adaugaNota(5);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
	}
	//integralist
	for(int i=0;i<7;i++) {
		IStudent student=new Student();
		student.adaugaNota(5);
		student.adaugaNota(10);
		grupa.adaugaStudent(student);
}
	
	assertEquals(0.7, grupa.getPromovabilitate(),0.1);
	}
	
	 @Test
	    public void testGetPromovabilitateLimitaInferioara(){
	        Grupa grupa= new Grupa(1085);
	        for( int i=0;i<5;i++){
	            IStudent student= new Student();
	            student.adaugaNota(4);
	            student.adaugaNota(7);
	            grupa.adaugaStudent(student);
	        }

	        assertEquals(0,grupa.getPromovabilitate(),0.1);
	    }

	    @Test
	    public void testGetPromovabilitateLimitaSuperioara(){
	        Grupa grupa= new Grupa(1085);
	        for( int i=0;i<5;i++){
	            IStudent student= new Student();
	            student.adaugaNota(10);
	            student.adaugaNota(7);
	            grupa.adaugaStudent(student);
	        }

	        assertEquals(1,grupa.getPromovabilitate(),0.1);
	    }
	    
	    @Test (expected = IndexOutOfBoundsException.class)
	    public void testErrorConditions(){
	        Grupa grupa=new Grupa(1085);

	        grupa.getPromovabilitate();
	    }

	    
	    @Test(timeout = 500)
	    public void testPerformanceTimp(){
		   grupa.getPromovabilitate();

	    }
	    
	  
}
