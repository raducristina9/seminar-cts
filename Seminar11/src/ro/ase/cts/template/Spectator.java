package ro.ase.cts.template;

public class Spectator extends TemplateSpectatorAbstract{
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" s-a asezat la coada");
	}

	@Override
	public void printeazBilet() {
		System.out.println(this.nume+" printeaza bilet");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume+" realizeaza control corporal");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume+" ocupa loc");
		
	}
}
