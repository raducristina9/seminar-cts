package ro.ase.cts.decoratormultiplu;

public class DecoratorUrarePasteFericit extends DecoratorulAbstract{

	public DecoratorUrarePasteFericit(IOperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Paste fericit si hai la meci!");
	}

}
