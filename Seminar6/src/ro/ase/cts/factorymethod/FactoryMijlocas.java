package ro.ase.cts.factorymethod;

public class FactoryMijlocas implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int meciuriJucate) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume, meciuriJucate);
	}

}
