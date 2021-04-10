package ro.ase.cts.decorator;

public class Card implements ICardAbstract{
	
	private String titular;
	private String numarCard;
	
	public Card(String titular, String numarCard) {
		super();
		this.titular = titular;
		this.numarCard = numarCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println(titular + " a relizat o plata online");		
	}

	public String getTitular() {
		return titular;
	}

	public String getNumarCard() {
		return numarCard;
	}

	@Override
	public void platestePOS() 	{
		System.out.println(titular + " a relizat o plata la POS");
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
