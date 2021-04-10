package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements ICardAbstract{
	
	private ICardAbstract cardAbstract;

	public DecoratorAbstract(ICardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	public ICardAbstract getCardAbstract() {
		return cardAbstract;
	}

	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		cardAbstract.platesteOnline();
	}

	@Override
	public void platestePOS() {
		// TODO Auto-generated method stub
		cardAbstract.platestePOS();
	}
	
	public abstract void platesteContactless();
	
}
