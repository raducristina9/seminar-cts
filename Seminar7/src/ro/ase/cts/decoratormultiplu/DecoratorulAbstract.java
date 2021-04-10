package ro.ase.cts.decoratormultiplu;

public abstract class DecoratorulAbstract implements IOperatorBilet {

	private IOperatorBilet bilet;
	
	public DecoratorulAbstract(IOperatorBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		bilet.rezervaBilet();
		
	}

	@Override
	public String getNumeEchipaGazda() {
		// TODO Auto-generated method stub
		return bilet.getNumeEchipaGazda();
	}

	@Override
	public String getNumeEchipaOaspeti() {
		// TODO Auto-generated method stub
		return bilet.getNumeEchipaOaspeti();
	}
	
	

}
