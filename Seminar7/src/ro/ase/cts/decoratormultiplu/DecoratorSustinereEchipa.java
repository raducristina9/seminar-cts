package ro.ase.cts.decoratormultiplu;

public class DecoratorSustinereEchipa extends DecoratorulAbstract {

	public DecoratorSustinereEchipa(IOperatorBilet bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinem "+ super.getNumeEchipaGazda());
	}

}
