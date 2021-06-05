package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.TestPromovabilitateGrupa;
import ro.ase.cts.teste.TestPromovabilitateGrupaWithFixture;
import ro.ase.cts.teste.TesteConstructorGrupa;
import ro.ase.cts.teste.TesteMock;
import suite.categorii.TestePromovabilitateCategory;
import suite.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({ TesteConstructorGrupa.class, TesteMock.class, TestPromovabilitateGrupa.class,
	TestPromovabilitateGrupaWithFixture.class})
@Categories.IncludeCategory({TestePromovabilitateCategory.class})
@Categories.ExcludeCategory({TesteUrgenteCategory.class})
public class SuitaCustom {

}
