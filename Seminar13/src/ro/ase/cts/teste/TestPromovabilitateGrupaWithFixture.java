package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import suite.categorii.TestePromovabilitateCategory;
import suite.categorii.TesteUrgenteCategory;

public class TestPromovabilitateGrupaWithFixture {
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
	  
    @Test(timeout = 500)
	@Category({TestePromovabilitateCategory.class ,TesteUrgenteCategory.class})
    public void testPerformanceTimp(){
	   grupa.getPromovabilitate();
    }

}
