package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import mockuri.StudentDummy;
import mockuri.StudentFake;
import mockuri.StudentStub;
import ro.ase.cts.clase.Grupa;
import suite.categorii.TestePromovabilitateCategory;
import suite.categorii.TesteUrgenteCategory;

public class TesteMock {

	  @Test
	    public void testReferenceAdaugAtudent() {
	    	 Grupa grupa=new Grupa(1085);
	    	 
	    	 grupa.adaugaStudent(new StudentDummy());
	    	 grupa.adaugaStudent(new StudentDummy());
	    	 
	    	 assertEquals(2, grupa.getStudenti().size());
	    }
	  
	  	@Test
	  	@Category({TestePromovabilitateCategory.class ,TesteUrgenteCategory.class})
	    public void testReferenceGetPromovabilitate() {
	    	 Grupa grupa=new Grupa(1085);
	    	 
	    	 grupa.adaugaStudent(new StudentStub());
	    	 grupa.adaugaStudent(new StudentStub());
	    	  
	    	 assertEquals(1, grupa.getPromovabilitate(),0.01);
	    }
	  	
		@Test
	    public void testReferenceCuFake() {

	        Grupa grupa =new Grupa(1085);
	        for(int i=0;i<7;i++){
	           
	            StudentFake studentFake=new StudentFake();
	            studentFake.setValoareAreRestante(false);

	            grupa.adaugaStudent(studentFake);
	        }
	        for(int i=0;i<3;i++){
	            StudentFake studentFake=new StudentFake();
	            studentFake.setValoareAreRestante(true);

	            grupa.adaugaStudent(studentFake);
	        }

	        assertEquals(0.7,grupa.getPromovabilitate(),0.01);
		}

}
