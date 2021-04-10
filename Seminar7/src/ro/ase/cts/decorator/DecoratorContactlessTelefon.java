package ro.ase.cts.decorator;

public class DecoratorContactlessTelefon  extends DecoratorAbstract{

	public DecoratorContactlessTelefon(ICardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println(((Card)super.getCardAbstract()).getTitular()+" a relizat o plata contactless cu telefonul.");		
	}
	
	

}
