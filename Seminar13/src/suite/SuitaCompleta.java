package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestPromovabilitateGrupa;
import ro.ase.cts.teste.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.teste.TesteConstructorGrupa;
import ro.ase.cts.teste.TesteMock;

@RunWith(Suite.class)
@SuiteClasses({ TesteConstructorGrupa.class, TesteMock.class, TestPromovabilitateGrupa.class,
		TestPromovabilitateGrupaWithFixture.class })

public class SuitaCompleta {

}
