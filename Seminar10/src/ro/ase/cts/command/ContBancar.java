package ro.ase.cts.command;

public class ContBancar {
	
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		this.sold=suma;
		System.out.println("A fost constituit contul pentru "+ detinator+" cu soldul "+sold);
	}
	
	public void depunere(float suma) {
		this.sold=this.sold+suma;
		System.out.println("A fost depusa suma in contul pentru "+ detinator+" noul sold este "+sold);
	}
	
	public void retragere(float suma) {
		if(suma< this.sold) {
		this.sold=this.sold-suma;
		System.out.println("A fost retrasa suma din contul pentru "+ detinator+" noul sold este "+sold);
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
		
	}

}
