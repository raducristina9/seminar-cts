package ro.ase.cts.decorator;

public class DecoratorContactless extends DecoratorAbstract{

	public DecoratorContactless(ICardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println(((Card)super.getCardAbstract()).getTitular()+" a relizat o contactless.");		
	}

}
