package ro.ase.cts.template;

public class SpectatorVIP extends TemplateSpectatorAbstract {

	private String loja;
	private String nume;
	
	
	public SpectatorVIP(String loja, String nume) {
		super();
		this.loja = loja;
		this.nume = nume;
	}
	@Override
	public void asezareCoada() {
		System.out.println(this.nume+" intra direct la VIP");
		
	}
	@Override
	public void printeazBilet() {
		System.out.println(this.nume+" prezinta bilet vip");
		
	}
	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume+" relizeaza control corporal");
		
	}
	@Override
	public void ocupaLoc() {
		System.out.println(this.nume+" ocupa loc la loja "+this.loja);
		
	}

}
