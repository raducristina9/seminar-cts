package ro.ase.cts.composite;

public interface ComponentaMeniu {
	
	void adaugareNod(ComponentaMeniu componentaMeniu);
	void stergereNod(ComponentaMeniu componentaMeniu);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
	
}
